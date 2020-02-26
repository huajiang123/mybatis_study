package com.huajiang.mybatis.dao;

import com.huajiang.mybatis.pojo.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author jianghua
 * @version v1.0
 * @package com.huajiang.mybatis.dao
 * @date 2020/2/7 下午5:11
 * @Copyright
 */
public interface UserDao {

     List<UserEntity> queryAll();

     @Select({"<script>",
             "select  * from  user " + "where" +
                     " id= #{id}","<script>"}) //简单sql可以通过注解形式
     UserEntity queryById(@Param("id") int id);


     boolean addUser(UserEntity entity);

     //其中 ${column} 会被直接替换，而 #{value} 会被使用 ? 预处理。
     //这个想法也同样适用于用来替换表名的情况
     // 用这种方式接受用户的输入，并将其用于语句中的参数是不安全的，
     // 会导致潜在的 SQL 注入攻击，
     // 因此要么不允许用户输入这些字段，要么自行转义并检验
     @Select("select * from user where ${column}=#{value}")
     UserEntity queryByColumn(@Param("column") String column,@Param("value") String value);

     UserEntity queryById(@Param("id") String id);

}
