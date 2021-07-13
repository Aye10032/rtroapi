package com.aye10032.rtroapi.temputil;

import com.aye10032.rtroapi.dao.IVideoDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: rtroapi
 * @className: OldVideoDaoImpl
 * @Description: 旧版视频DAO接口实现
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/13 下午 7:31
 */
public class OldVideoDaoImpl implements OldVideoDao{

    private InputStream in;
    private SqlSession session;
    private OldVideoDao dao;

    private void initSession() {
        try {
            in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            session = factory.openSession();
            dao = session.getMapper(OldVideoDao.class);
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
    public List<OldVideoPojo> getVideos() {
        List<OldVideoPojo> videoPojoList = null;
        initSession();

        videoPojoList = dao.getVideos();

        closeAll();
        return videoPojoList;
    }
}
