package com.huajiang.mybatis.util;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

import java.util.Properties;

/**
 * @author jianghua
 * @version v1.0
 * @package com.huajiang.mybatis.util
 * @date 2020/2/8 上午10:20
 * @Copyright
 */

/**
 *  MyBatis 允许你在已映射语句执行过程中的某一点进行拦截调用。默认情况下，MyBatis 允许使用插件来拦截的方法调用包括：
 *
 *     Executor (update, query, flushStatements, commit, rollback, getTransaction, close, isClosed)
 *     ParameterHandler (getParameterObject, setParameters)
 *     ResultSetHandler (handleResultSets, handleOutputParameters)
 *     StatementHandler (prepare, parameterize, batch, update, query)
 *
 * 这些类中方法的细节可以通过查看每个方法的签名来发现，或者直接查看 MyBatis 发行包中的源代码。 如果你想做的不仅仅是监控方法的调用，那么你最好相当了解要重写的方法的行为。 因为如果在试图修改或重写已有方法的行为的时候，你很可能在破坏 MyBatis 的核心模块。 这些都是更低层的类和方法，所以使用插件的时候要特别当心。
 *
 * 通过 MyBatis 提供的强大机制，使用插件是非常简单的，只需实现 Interceptor 接口，并指定想要拦截的方法签名即可
 */
@Intercepts({@Signature(
        type = Executor.class,
        method = "update",
        args = {MappedStatement.class,Object.class}
)})
public class MyPlugin implements Interceptor {
    private Properties properties = new Properties();
    //拦截方法
    public Object intercept(Invocation invocation) throws Throwable {
        //前置操作
        Object returnObject = invocation.proceed();
        //后置操作
        return returnObject;
    }

    public Object plugin(Object target) {
        return null;
    }

    public void setProperties(Properties properties) {
       this.properties = properties;
    }
}
