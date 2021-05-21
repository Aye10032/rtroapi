package com.aye10032.rtroapi.dao;

import com.aye10032.rtroapi.pojo.VideoInfo;
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

    @Select("SELECT count(*) FROM sqlite_master WHERE type=\"table\" AND name = \"videoinfo\"")
    Integer TableExist();

    @Update("create table videoinfo\n" +
            "(\n" +
            "    ID          INTEGER not null\n" +
            "        primary key autoincrement,\n" +
            "    URL         TEXT    not null,\n" +
            "    HASDONE     INTEGER not null,\n" +
            "    NEEDTRANS   INTEGER not null,\n" +
            "    ISTRANS     INTEGER not null,\n" +
            "    FROMEQQ     INTEGER not null,\n" +
            "    DESCRIPTION TEXT    not null,\n" +
            "    TIME        TEXT    not null\n" +
            ");")
    void CreateVideoTable();

    @Select("SELECT * FROM videoinfo WHERE ID=#{id}")
    List<VideoInfo> getVideoByID(Integer id);

    @Select("SELECT * FROM videoinfo WHERE HASDONE=#{HASDONE} AND NEEDTRANS=#{NEEDTRANS}")
    List<VideoInfo> getVideoList(VideoInfo videoInfo);

}
