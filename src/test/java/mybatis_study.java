import com.huajiang.mybatis.dao.UserDao;
import com.huajiang.mybatis.pojo.UserEntity;
import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author jianghua
 * @version v1.0
 * @package PACKAGE_NAME
 * @date 2020/2/7 下午5:09
 * @Copyright
 */
public class mybatis_study {

    String resource = "mybatis/mybatis-config.xml";
    private SqlSession sqlSession;
    @Test
    public void queryAll(){
        try{
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //SqlsessionFactory 应该是单例的
            SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);
            //SqlSession 一个线程一个SqlSession
             sqlSession = sqlSessionFactory.openSession();
            UserEntity userEntity = sqlSession.selectOne("com.huajiang.mybatis.dao.UserDao.queryById",1);

            /*List<UserEntity> list = sqlSession.selectList("com/huajiang/dao/queryById",1);
              <T> Cursor<T> selectCursor(String statement); //处理大量数据时,使用游标可以节省内存消耗。
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            UserEntity userEntity = userDao.queryById(1);

             */
            System.out.println(userEntity);
        }
        catch(Exception exception){
            System.out.println(exception);
        }
        finally {
            sqlSession.close();
        }
    }
}
