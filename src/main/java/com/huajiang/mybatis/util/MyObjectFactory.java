package com.huajiang.mybatis.util;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.Collection;
import java.util.List;
import java.util.Properties;

/**
 * @author jianghua
 * @version v1.0
 * @package com.huajiang.mybatis.util
 * @date 2020/2/8 上午9:58
 * @Copyright
 */

/**
 * MyBatis 每次创建结果对象的新实例时，它都会使用一个对象工厂（ObjectFactory）实例来完成。
 * 默认的对象工厂需要做的仅仅是实例化目标类，
 * 要么通过默认构造方法，要么在参数映射存在的时候通过参数构造方法来实例化。
 * 如果想覆盖对象工厂的默认行为，则可以通过创建自己的对象工厂来实现
 * Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs
 */
public class MyObjectFactory extends DefaultObjectFactory {
    public Object create(Class type) {
        return super.create(type);
    }

    // TODO: 2020/2/8 这个有参构造器有问题 
    /*public Object create(Class type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        return super.create(type, constructorArgTypes, constructorArgs);
    }*/
    public void setProperties(Properties properties) {
        super.setProperties(properties);
    }
    public <T> boolean isCollection(Class<T> type) {
        return Collection.class.isAssignableFrom(type);
    }
}
