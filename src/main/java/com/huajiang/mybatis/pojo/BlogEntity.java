package com.huajiang.mybatis.pojo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * @author jianghua
 * @version v1.0
 * @package com.huajiang.mybatis.pojo
 * @date 2020/2/8 下午5:01
 * @Copyright
 */
@Alias("blog")
public class BlogEntity implements Serializable {

    private String blogId;
    private String title;
    private String topic;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "BlogEntity{" +
                "blogId='" + blogId + '\'' +
                ", title='" + title + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
