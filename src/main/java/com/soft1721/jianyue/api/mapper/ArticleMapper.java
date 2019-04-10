package com.soft1721.jianyue.api.mapper;

import com.soft1721.jianyue.api.entity.vo.ArticleVO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import java.util.List;


public interface ArticleMapper {
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "u_id",property = "uId"),
            @Result(column = "title",property = "title"),
            @Result(column = "content",property = "content"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "nickname",property = "nickname"),
            @Result(column = "avatar",property = "avatar")
    })

    @Select("SELECT a.*,b.id,b.nickname,b.avatar FROM t_article a LEFT JOIN t_user b ON a.u_id=b.id ORDER By b.id DESC ")
    List<ArticleVO> selectAll();

    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "u_id",property = "uId"),
            @Result(column = "title",property = "title"),
            @Result(column = "content",property = "content"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "nickname",property = "nickname"),
            @Result(column = "avatar",property = "avatar")
    })

    @Select("SELECT a.*,b.id,b.nickname,b.avatar FROM t_article a LEFT JOIN t_user b ON a.u_id=b.id WHERE a.id = #{id} ")
    ArticleVO getArticleById(int aId);

}