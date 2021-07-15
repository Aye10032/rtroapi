package com.aye10032.rtroapi.dao;

import com.aye10032.rtroapi.pojo.TransList;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: rtroapi
 * @className: ITransDaoImpl
 * @Description: 翻译信息接口实现
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/15 上午 9:11
 */
public class ITransDaoImpl implements ITransDao{

    private InputStream in;
    private SqlSession session;
    private ITransDao dao;

    private void initSession() {
        try {
            in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            session = factory.openSession();
            dao = session.getMapper(ITransDao.class);
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
    public void CreateTransTable() {
        initSession();

        dao.CreateTransTable();

        session.commit();
        closeAll();
    }

    @Override
    public List<TransList> getTransByVideoID(Integer id) {
        List<TransList> transLists = null;
        initSession();

        transLists = dao.getTransByVideoID(id);

        closeAll();
        return transLists;
    }

    @Override
    public Integer insertTrans(TransList transList) {
        initSession();

        dao.insertTrans(transList);

        session.commit();
        closeAll();
        return transList.getId();
    }
}
