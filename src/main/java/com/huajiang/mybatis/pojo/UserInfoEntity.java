package com.huajiang.mybatis.pojo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * @author jianghua
 * @version v1.0
 * @package com.huajiang.mybatis.pojo
 * @date 2020/2/8 下午3:13
 * @Copyright
 */
@Alias("userinfo")
public class UserInfoEntity implements Serializable {
    private String name;
    private String idNo;
    private String uname;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }



    @Override
    public String toString() {
        return "UserInfoEntity{" +
                "name='" + name + '\'' +
                ", idNo='" + idNo + '\'' +
                ", phone='" + phone + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }
}
