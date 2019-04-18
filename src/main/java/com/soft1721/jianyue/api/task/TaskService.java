package com.soft1721.jianyue.api.task;

import com.soft1721.jianyue.api.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
//@Async
public class TaskService {
    @Autowired
    private MailService mailService;

    @Scheduled(cron = "0 00 10 ? * *")
    public void proces() {
        mailService.sendMail("824772535@qq.com", "简单邮件", "张楠燕定时10.00发送");
        System.out.println("发送成功");
    }
}