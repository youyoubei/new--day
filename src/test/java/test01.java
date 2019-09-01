import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.user;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
public class test01 {
    @Test
    public void findALl() throws IOException {
        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("config.xml");
//获得sqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(resourceAsStream);
//获得sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//执行sql语句
        List<user> userList = sqlSession.selectList("userMapper.findAll");
//打印结果
        System.out.println(userList);
//释放资源
        sqlSession.close();
    }

    @Test
    public void add() throws IOException {
        user user = new user();
        user.setUser("小花");
        user.setPass("456");
        user.setId(2);
        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("config.xml");
//获得sqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(resourceAsStream);
//获得sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//执行sql语句
        List<user> userList = sqlSession.selectList("userMapper.add", user);
//打印结果
        System.out.println(userList);
//释放资源
        sqlSession.close();
    }

    @Test
    public void delde() throws IOException {
        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("config.xml");
//获得sqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(resourceAsStream);
//获得sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//执行sql语句
        List<user> userList = sqlSession.selectList("userMapper.dele", 1);
//打印结果
        System.out.println(userList);
//释放资源
        sqlSession.close();

    }

    @Test
    public void up() throws IOException {
        user user = new user();
        user.setUser("uu");
        user.setPass("147");
        user.setId(2);

        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("config.xml");
//获得sqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(resourceAsStream);
//获得sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//执行sql语句
        List<user> userList = sqlSession.selectList("userMapper.up", user);
//打印结果
        System.out.println(userList);
//释放资源
        sqlSession.close();
    }
    @Test
    public void test01(){
        int num =2147483647;
        num+=2;
        System.out.println(num);
    }



}
