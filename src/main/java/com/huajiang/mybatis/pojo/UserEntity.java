package com.huajiang.mybatis.pojo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

/**
 * @author jianghua
 * @version v1.0
 * @package com.huajiang.mybatis.pojo
 * @date 2020/2/7 下午5:11
 * @Copyright
 */
@Alias("user")
public class UserEntity implements Serializable {
    private Integer id;
    private UserInfoEntity userInfoEntity;
    private List<BlogEntity> blogEntityList;
    private String name;
    private String pwd;
    private String blogId;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }




    public UserInfoEntity getUserInfoEntity() {
        return userInfoEntity;
    }

    public void setUserInfoEntity(UserInfoEntity userInfoEntity) {
        this.userInfoEntity = userInfoEntity;
    }

    public List<BlogEntity> getBlogEntityList() {
        return blogEntityList;
    }

    public void setBlogEntityList(List<BlogEntity> blogEntityList) {
        this.blogEntityList = blogEntityList;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userInfoEntity=" + userInfoEntity +
                ", blogEntityList=" + blogEntityList +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
