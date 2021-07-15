package com.aye10032.rtroapi.dao;

import com.aye10032.rtroapi.pojo.TransList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @program: rtroapi
 * @className: ITransDao
 * @Description: 翻译信息DAO接口
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/14 下午 6:38
 */
public interface ITransDao {

    @Select("SELECT count(*) FROM sqlite_master WHERE type=\"table\" AND name = \"trans_list\"")
    Integer TableExist();

    @Update("create table trans_list\n" +
            "(\n" +
            "    ID     INTEGER not null\n" +
            "        primary key autoincrement,\n" +
            "    FROMID INTEGER not null,\n" +
            "    FROMQQ INTEGER not null,\n" +
            "    MSG    TEXT    not null,\n" +
            "    TIME   BLOB    not null\n" +
            ");")
    void CreateTransTable();

    @Select("SELECT * FROM trans_list WHERE FROMID=#{id}")
    List<TransList> getTransByVideoID(Integer id);

    @Insert("INSERT INTO trans_list" +
            "('FROMID','FROMQQ','MSG','TIME') VALUES " +
            "(#{fromid}, #{fromqq}, #{msg}, #{time});")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    Integer insertTrans(TransList transList);
}
