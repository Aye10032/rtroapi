package com.aye10032.rtroapi.temputil;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: rtroapi
 * @className: OldVideoDao
 * @Description: 旧版视频信息DAO接口
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/13 下午 7:17
 */
public interface OldVideoDao {

    @Select("SELECT * FROM videoinfo")
    List<OldVideo> getVideos();

}
