package com.aye10032.rtroapi.temputil;

import com.aye10032.rtroapi.dao.IVideoDaoImpl;
import com.aye10032.rtroapi.pojo.VideoInfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: rtroapi
 * @className: O2Nutil
 * @Description: 数据库类型转换
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/13 下午 7:35
 */
public class O2Nutil {

    public static void main(String[] args) {
        OldVideoDaoImpl dao = new OldVideoDaoImpl();
        List<OldVideoPojo> videoPojos = dao.getVideos();

        System.out.println(videoPojos);
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );

        IVideoDaoImpl dao1 = new IVideoDaoImpl();

        if (dao1.TableExist() == 0){
            dao1.CreateVideoTable();
        }

        for (OldVideoPojo videos:videoPojos) {
            try {
                VideoInfo videoInfo = new VideoInfo();
                videoInfo.setURL(videos.URL);
                videoInfo.setHASDONE(videos.HASDONE);
                videoInfo.setNEEDTRANS(videos.NEEDTRANS);
                videoInfo.setISTRANS(videos.ISTRANS);
                videoInfo.setFROMEQQ(videos.FROMEQQ);
                videoInfo.setDESCRIPTION(videos.DESCRIPTION);
                Date date = sdf.parse(videos.TIME);
                videoInfo.setTIME(date);
                dao1.insertNewVideo(videoInfo);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

}
