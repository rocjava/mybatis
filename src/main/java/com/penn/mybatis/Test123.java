package com.penn.mybatis;

import com.penn.mybatis.dto.User;
import com.penn.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author penn
 * @since 2019/12/11
 */
public class Test123 {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);

        SqlSession session = sessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        try {
            User user = userMapper.selectById(1);
            System.err.println("用戶信息:" + user);
            User user1 = userMapper.selectById(1);
            System.err.println("用戶信息:" + user1);
        }catch (Exception e){
            e.printStackTrace();
        }
        session.close();
    }
}
