package com.soft1721.jianyue.api.service;

import com.soft1721.jianyue.api.entity.vo.ArticleVO;
import java.util.List;

public interface ArticleService {
    //获取所有文章
    List<ArticleVO> selectAll();
    //根据文章id获取文章
    ArticleVO getArticleById(int aId);



}