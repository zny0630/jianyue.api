package com.soft1721.jianyue.api.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by 张楠燕 on 2019/4/1.
 */
@Data
public class User {
    private Integer id;
    private String mobile;
    private String password;
    private String nickname;
    private String token;
    private Date regtime;
    private Short status;
    private  String avatar;

}
