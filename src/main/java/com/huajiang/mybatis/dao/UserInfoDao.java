package com.huajiang.mybatis.dao;

/**
 * @author jianghua
 * @version v1.0
 * @package com.huajiang.mybatis.dao
 * @date 2020/2/8 下午3:51
 * @Copyright
 */

import com.huajiang.mybatis.pojo.UserEntity;
import com.huajiang.mybatis.pojo.UserInfoEntity;
import org.apache.ibatis.annotations.Param;

/**
 * 关联查询：
 */
public interface UserInfoDao {

    //关联查询一对一,一个用户有一个个人信息
    UserEntity getUserInfoById(@Param("id") String id);

    //关联查询一对多,一个用户对应多个博客
    UserEntity getUserById(@Param("id") String id);
}
