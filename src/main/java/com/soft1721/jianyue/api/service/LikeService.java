package com.soft1721.jianyue.api.service;

import com.soft1721.jianyue.api.entity.Follow;
import com.soft1721.jianyue.api.entity.Like;
import com.soft1721.jianyue.api.entity.vo.FollowVO;
import com.soft1721.jianyue.api.entity.vo.LikeVO;

import java.util.List;


public interface LikeService {

    Like getLike(int uId, int aId);


    List<LikeVO> getLikeByUId(Integer uId);


    void insertLike(Like like);


    void deleteLike(int uId, int aId);

}
