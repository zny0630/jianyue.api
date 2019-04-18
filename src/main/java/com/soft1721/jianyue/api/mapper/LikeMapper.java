package com.soft1721.jianyue.api.mapper;

import com.soft1721.jianyue.api.entity.Follow;

import com.soft1721.jianyue.api.entity.Like;

import com.soft1721.jianyue.api.entity.vo.FollowVO;

import com.soft1721.jianyue.api.entity.vo.LikeVO;

import org.apache.ibatis.annotations.*;


import java.util.List;


public interface LikeMapper {

    @Results({

            @Result(property = "id", column = "id"),

            @Result(property = "uId", column = "u_id"),

            @Result(property = "aId", column = "a_id")

    })

    @Select("SELECT * FROM t_like WHERE u_id = #{uId} AND a_id = #{aId} ")
    Like getLike(@Param("uId") int uId, @Param("aId") int aId);


    @Results({

            @Result(column = "a_id", property = "aId"),

            @Result(column = "title", property = "title"),

            @Result(column = "create_time", property = "createTime")

    })

    @Select("SELECT a.a_id,b.title,b.create_time FROM t_like a LEFT JOIN t_article b ON a.a_id = b.id WHERE a.u_id = #{uId}  ")
    List<LikeVO> getLikeByUId(Integer uId);


    @Insert("INSERT INTO t_like (u_id,a_id) VALUES (#{uId},#{aId}) ")
    void insertLike(Like like);


    @Delete("DELETE  FROM t_like WHERE u_id = #{uId} AND a_id = #{aId} ")
    void deleteLike(@Param("uId") int uId, @Param("aId") int aId);

}