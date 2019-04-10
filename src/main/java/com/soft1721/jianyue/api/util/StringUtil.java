package com.soft1721.jianyue.api.util;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by 张楠燕 on 2019/4/1.
 */
public class StringUtil {
    public static String getDateString(Date date) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(date);
    }

    public static String getBase64Encoder(String srcString) {
        String resultStr = "";
        try {
            resultStr = Base64.getEncoder().encodeToString(srcString.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return resultStr;
    }

    public static String getBase64Decoder(String srcString) {
        byte[] bytes = Base64.getDecoder().decode(srcString);
        return new String(bytes);
    }


    public static String getUUIDString() {
        return UUID.randomUUID().toString();
    }

    public static String getVerifyCode() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            stringBuilder.append(String.valueOf(random.nextInt(10)));
        }
        return stringBuilder.toString();
    }
}