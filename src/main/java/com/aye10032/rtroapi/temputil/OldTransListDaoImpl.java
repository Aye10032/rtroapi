package com.aye10032.rtroapi.temputil;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: rtroapi
 * @className: OldTransListDaoImpl
 * @Description: 旧版翻译信息接口实现
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/14 下午 6:35
 */
public class OldTransListDaoImpl implements OldTransListDao{

    private InputStream in;
    private SqlSession session;
    private OldTransListDao dao;

    private void initSession() {
        try {
            in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            session = factory.openSession();
            dao = session.getMapper(OldTransListDao.class);
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
    public List<OldTransList> getTransList() {
        List<OldTransList> transLists = null;
        initSession();

        transLists = dao.getTransList();

        closeAll();
        return transLists;
    }
}
