package com.soft1721.jianyue.api.service.impl;

import com.soft1721.jianyue.api.entity.vo.ArticleVO;
import com.soft1721.jianyue.api.mapper.ArticleMapper;
import com.soft1721.jianyue.api.mapper.ImgMapper;
import com.soft1721.jianyue.api.service.ArticleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 张楠燕 on 2019/4/8.
 */
@Service
public class ArticleServiceImpl implements ArticleService{
    @Resource
    private  ArticleMapper articleMapper;

    @Resource
    private ImgMapper imgMapper;

    @Override
    public List<ArticleVO> selectAll() {
        List<ArticleVO> articleVOList = articleMapper.selectAll();
        for (ArticleVO articleVO:articleVOList){
            articleVO.setImgs(imgMapper.selectImgsByAId(articleVO.getId()));
        }
        return articleVOList;

    }



    @Override

    public ArticleVO getArticleById(int aId) {

        return articleMapper.getArticleById(aId);

    }

}