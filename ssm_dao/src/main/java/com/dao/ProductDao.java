package com.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 长歌哲理
 * @Description: product的dao接口
 */
public interface ProductDao {

    /**
     * @Author 长歌哲理
     * @Description 查询所有产品信息
     * @Param []
     * @return java.util.List<com.dao.Product>
     **/
    @Select("select * from product")
    public List<ProductDao> findAll();
}
