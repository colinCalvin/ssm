package com.service;

import com.domain.Product;

import java.util.List;

/**
 * @author 长歌哲理
 * @Description: product的service接口
 */
public interface ProductService {

    /**
     * @Author 长歌哲理
     * @Description 查询所有产品信息
     * @Param []
     * @return java.util.List<com.dao.Product>
     **/
    public List<Product> findAll();
}
