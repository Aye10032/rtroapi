package com.aye10032.rtroapi.dao;

import com.aye10032.rtroapi.pojo.VideoInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @program: rtroapi
 * @className: IVideoDao
 * @Description: 视频信息dao类
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/4/22 下午 3:23
 */
public interface IVideoDao {

    @Select("SELECT count(*) FROM sqlite_master WHERE type=\"table\" AND name = \"video_info\"")
    Integer TableExist();

    @Update("create table video_info\n" +
            "(\n" +
            "    ID          INTEGER not null\n" +
            "        primary key autoincrement,\n" +
            "    URL         TEXT    not null,\n" +
            "    HASDONE     INTEGER not null,\n" +
            "    NEEDTRANS   INTEGER not null,\n" +
            "    ISTRANS     INTEGER not null,\n" +
            "    FROMEQQ     INTEGER not null,\n" +
            "    DESCRIPTION TEXT    not null,\n" +
            "    TIME        BLOB    not null\n" +
            ");")
    void CreateVideoTable();

    @Select("SELECT * FROM video_info WHERE ID=#{id}")
    List<VideoInfo> getVideoByID(Integer id);

    @Select("SELECT * FROM video_info WHERE HASDONE=#{HASDONE} AND NEEDTRANS=#{NEEDTRANS}")
    List<VideoInfo> getVideoList(VideoInfo videoInfo);

    @Insert("INSERT INTO video_info" +
            "('URL','HASDONE','NEEDTRANS','ISTRANS','FROMEQQ','DESCRIPTION','TIME') VALUES " +
            "(#{URL}, #{HASDONE}, #{NEEDTRANS}, #{ISTRANS}, #{FROMEQQ}, #{DESCRIPTION}, #{TIME});")
    @Options(useGeneratedKeys = true, keyProperty = "ID", keyColumn = "ID")
    Integer insertNewVideo(VideoInfo videoInfo);

}
