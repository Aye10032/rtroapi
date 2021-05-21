package com.aye10032.rtroapi;

import com.aye10032.rtroapi.dao.IVideoDaoImpl;
import com.aye10032.rtroapi.pojo.VideoInfo;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @program: rtroapi
 * @className: DataBaseTest
 * @Description: 数据库测试类
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/5/21 下午 2:43
 */
public class DataBaseTest {

    @Test
    public void TestGet(){
        IVideoDaoImpl daoImp = new IVideoDaoImpl();
        List<VideoInfo> videoInfos = daoImp.getVideoByID(2);

        System.out.println(videoInfos.get(0).toString());
    }

}
