package com.jiantao.mall.service.impl;

import com.jiantao.mall.mapper.PmsBrandMapper;
import com.jiantao.mall.model.PmsBrand;
import com.jiantao.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> getAllBrandList() {
        return pmsBrandMapper.getAllBrandList();
    }
}
