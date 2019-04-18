package com.soft1721.jianyue.api.service.impl;

import com.soft1721.jianyue.api.entity.Like;

import com.soft1721.jianyue.api.entity.vo.LikeVO;

import com.soft1721.jianyue.api.mapper.LikeMapper;

import com.soft1721.jianyue.api.service.LikeService;

import org.springframework.stereotype.Service;


import javax.annotation.Resource;

import java.util.List;


@Service

public class LikeServiceImpl implements LikeService {

    @Resource

    private LikeMapper likeMapper;

    @Override

    public Like getLike(int uId, int aId) {

        return likeMapper.getLike(uId, aId);

    }


    @Override

    public List<LikeVO> getLikeByUId(Integer uId) {

        return likeMapper.getLikeByUId(uId);

    }

    @Override

    public void insertLike(Like like) {

        likeMapper.insertLike(like);


    }


    @Override

    public void deleteLike(int uId, int aId) {

        likeMapper.deleteLike(uId, aId);


    }

}