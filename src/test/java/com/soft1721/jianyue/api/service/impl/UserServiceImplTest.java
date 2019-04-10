package com.soft1721.jianyue.api.service.impl;

import com.soft1721.jianyue.api.entity.User;
import com.soft1721.jianyue.api.entity.dto.UserDTO;
import com.soft1721.jianyue.api.service.UserService;
import com.soft1721.jianyue.api.util.StatusConst;
import com.soft1721.jianyue.api.util.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by 张楠燕 on 2019/4/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Resource
    private UserService userService;
    @Test
    public void getUserByMobile() throws Exception {
        User user = userService.getUserByMobile("18362955628");
        System.out.println(user);
    }

    @Test
    public void signIn() throws Exception {
        UserDTO loginUser = new UserDTO();
        loginUser.setMobile("18362955628");
        String base64Pass = StringUtil.getBase64Encoder("111");
        loginUser.setPassword(base64Pass);
        int status = userService.signIn(loginUser);
        assertEquals(StatusConst.SUCCESS,status);
    }
    @Test
    public void getUserById() throws Exception {
        User user = userService.getUserById(1);
        System.out.println(user);
    }
    @Test
    public void signUp() {
        UserDTO userDTO = new UserDTO();
        userDTO.setMobile("13579951907");
        userDTO.setPassword("444");
        userService.signUp(userDTO);
    }
}