package com.aye10032.rtroapi.dao;

import com.aye10032.rtroapi.pojo.VideoInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: rtroapi
 * @className: IVideoDao
 * @Description: 视频DAO接口实现
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/5/21 下午 2:38
 */
public class IVideoDaoImpl implements IVideoDao {

    private InputStream in;
    private SqlSession session;
    private IVideoDao dao;

    private void initSession() {
        try {
            in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            session = factory.openSession();
            dao = session.getMapper(IVideoDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeAll() {
        try {
            session.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer TableExist() {
        Integer result = null;
        initSession();

        result = dao.TableExist();

        closeAll();
        return result;
    }

    @Override
    public void CreateVideoTable() {
        initSession();

        dao.CreateVideoTable();

        session.commit();
        closeAll();
    }

    @Override
    public List<VideoInfo> getVideoByID(Integer id) {
        List<VideoInfo> videoInfos = null;
        initSession();

        videoInfos = dao.getVideoByID(id);

        closeAll();
        return videoInfos;
    }

    @Override
    public List<VideoInfo> getVideoList(VideoInfo videoInfo) {
        List<VideoInfo> videoInfos = null;
        initSession();

        videoInfos = dao.getVideoList(videoInfo);

        closeAll();
        return videoInfos;
    }

    @Override
    public Integer insertNewVideo(VideoInfo videoInfo) {
        initSession();

        dao.insertNewVideo(videoInfo);

        session.commit();
        closeAll();
        return videoInfo.getID();
    }
}
