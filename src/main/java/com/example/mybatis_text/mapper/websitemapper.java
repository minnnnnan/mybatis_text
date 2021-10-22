package com.example.mybatis_text.mapper;

import com.example.mybatis_text.entity.website;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface websitemapper {
    public List<website> findAllWebsite();
    public List<website> findWebsiteById(int id);
}
