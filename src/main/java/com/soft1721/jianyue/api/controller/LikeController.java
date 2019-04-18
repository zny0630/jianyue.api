package com.soft1721.jianyue.api.controller;

import com.soft1721.jianyue.api.entity.Follow;

import com.soft1721.jianyue.api.entity.Like;

import com.soft1721.jianyue.api.entity.vo.FollowVO;

import com.soft1721.jianyue.api.entity.vo.LikeVO;

import com.soft1721.jianyue.api.service.LikeService;

import com.soft1721.jianyue.api.util.ResponseResult;

import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;

import java.util.List;


@RestController

@RequestMapping(value = "/api/like")

public class LikeController {

    @Resource

    private LikeService likeService;


    @PostMapping("/add")

    public ResponseResult likeArticle(@RequestParam("uId") int uId, @RequestParam("aId") int aId) {

        Like like = new Like();

        like.setUId(uId);

        like.setAId(aId);

        likeService.insertLike(like);

        return ResponseResult.success();

    }


    @PostMapping("/cancel")

    public ResponseResult cancelLike(@RequestParam("uId") int uId, @RequestParam("aId") int aId) {

        likeService.deleteLike(uId, aId);

        return ResponseResult.success();

    }


    @GetMapping("/list")

    public ResponseResult getLikeByUId(@RequestParam("uId") int uId) {

        List<LikeVO> likeVO = likeService.getLikeByUId(uId);

        return ResponseResult.success(likeVO);

    }


}