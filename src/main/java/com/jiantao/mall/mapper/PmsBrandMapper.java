package com.jiantao.mall.mapper;

import com.jiantao.mall.model.PmsBrand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PmsBrandMapper {

    List<PmsBrand> getAllBrandList();
}
