package com.huajiang.mybatis.util;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author jianghua
 * @version v1.0
 * @package com.huajiang.mybatis.util
 * @date 2020/2/8 上午9:23
 * @Copyright
 */

/**
 *自定义类型处理器,方法：实现 org.apache.ibatis.type.TypeHandler 接口，、
 *或继承一个很便利的类 org.apache.ibatis.type.BaseTypeHandler，
 *然后可以选择性地将它映射到一个 JDBC 类型
 */
@MappedJdbcTypes(JdbcType.VARCHAR)  //映射的jdbc类型
@MappedTypes(String.class) //映射的java类型
public class MyHandler extends BaseTypeHandler<String> {
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
       preparedStatement.setString(i,s);
    }

    public String getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return resultSet.getString(s);
    }

    public String getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getString(i);
    }

    public String getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return callableStatement.getString(i);
    }
}
