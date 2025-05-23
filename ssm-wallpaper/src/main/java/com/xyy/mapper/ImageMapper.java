package com.xyy.mapper;

import com.xyy.domain.Image;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ImageMapper {
    @Insert("insert into tb_img(id, phead, purl, hid, create_time) values(#{id}, #{head}, #{url}, #{hid}, #{createTime})")
    void add(Image image);

    @Delete("delete from tb_img where purl = #{url}")
    void delete(String url);

    @Select("select id, phead, purl, hid, create_time from tb_img where purl = #{url}")
    @ResultMap("imageMap")
    Image get(String url);

    @Select("select purl from tb_img limit #{begin}, 9")
    List<String> getImageByIndex(int begin);

}
