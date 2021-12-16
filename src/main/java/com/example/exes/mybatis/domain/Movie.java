package com.example.exes.mybatis.domain;

import javax.annotation.Generated;

public class Movie {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1521466+09:00", comments="Source field: movie.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1521466+09:00", comments="Source field: movie.image_url")
    private String image_url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1521466+09:00", comments="Source field: movie.title")
    private String title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1521466+09:00", comments="Source field: movie.info")
    private String info;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1531469+09:00", comments="Source field: movie.movie_url")
    private String movie_url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1531469+09:00", comments="Source field: movie.channel_name")
    private String channel_name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1521466+09:00", comments="Source field: movie.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1521466+09:00", comments="Source field: movie.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1521466+09:00", comments="Source field: movie.image_url")
    public String getImage_url() {
        return image_url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1521466+09:00", comments="Source field: movie.image_url")
    public void setImage_url(String image_url) {
        this.image_url = image_url == null ? null : image_url.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1521466+09:00", comments="Source field: movie.title")
    public String getTitle() {
        return title;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1521466+09:00", comments="Source field: movie.title")
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1521466+09:00", comments="Source field: movie.info")
    public String getInfo() {
        return info;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1531469+09:00", comments="Source field: movie.info")
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1531469+09:00", comments="Source field: movie.movie_url")
    public String getMovie_url() {
        return movie_url;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1531469+09:00", comments="Source field: movie.movie_url")
    public void setMovie_url(String movie_url) {
        this.movie_url = movie_url == null ? null : movie_url.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1531469+09:00", comments="Source field: movie.channel_name")
    public String getChannel_name() {
        return channel_name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-12-09T22:01:59.1531469+09:00", comments="Source field: movie.channel_name")
    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name == null ? null : channel_name.trim();
    }
}