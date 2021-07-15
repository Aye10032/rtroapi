package com.aye10032.rtroapi;

import com.aye10032.rtroapi.dao.ITransDaoImpl;
import com.aye10032.rtroapi.dao.IVideoDaoImpl;
import com.aye10032.rtroapi.pojo.TransList;
import com.aye10032.rtroapi.pojo.VideoInfo;
import com.aye10032.rtroapi.temputil.OldTransList;
import com.aye10032.rtroapi.temputil.OldTransListDaoImpl;
import com.aye10032.rtroapi.temputil.OldVideo;
import com.aye10032.rtroapi.temputil.OldVideoDaoImpl;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: rtroapi
 * @className: OldTest
 * @Description: 旧版数据库迁移
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/15 上午 9:16
 */
public class OldTest {

    @Test
    void VideoTest(){
        OldVideoDaoImpl dao = new OldVideoDaoImpl();
        List<OldVideo> videoPojos = dao.getVideos();

        System.out.println(videoPojos);
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );

        IVideoDaoImpl dao1 = new IVideoDaoImpl();

        if (dao1.TableExist() == 0){
            dao1.CreateVideoTable();
        }

        for (OldVideo videos:videoPojos) {
            try {
                VideoInfo videoInfo = new VideoInfo();
                videoInfo.setUrl(videos.getURL());
                videoInfo.setHasdone(videos.isHASDONE());
                videoInfo.setNeedtrans(videos.isNEEDTRANS());
                videoInfo.setIstrans(videos.isISTRANS());
                videoInfo.setFromqq(videos.getFROMEQQ());
                videoInfo.setDescription(videos.getDESCRIPTION());
                Date date = sdf.parse(videos.getTIME());
                videoInfo.setTime(date.getTime());
                dao1.insertNewVideo(videoInfo);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    void TransTest(){
        OldTransListDaoImpl dao = new OldTransListDaoImpl();
        List<OldTransList> transLists = dao.getTransList();

        System.out.println(transLists);
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );

        ITransDaoImpl dao1 = new ITransDaoImpl();

        if (dao1.TableExist() == 0){
            dao1.CreateTransTable();
        }

        for (OldTransList oldTransList:transLists){
            try {
                TransList transList = new TransList();
                transList.setFromid(oldTransList.getFromid());
                transList.setFromqq(oldTransList.getFromqq());
                transList.setMsg(oldTransList.getMsg());
                Date date = sdf.parse(oldTransList.getTime());
                transList.setTime(date.getTime());
                dao1.insertTrans(transList);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

}
