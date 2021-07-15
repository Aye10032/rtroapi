package com.aye10032.rtroapi.temputil;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: rtroapi
 * @className: OldTransListDao
 * @Description: 旧版翻译信息DAO接口
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/14 下午 6:33
 */
public interface OldTransListDao {

    @Select("SELECT * FROM translist")
    List<OldTransList> getTransList();

}
