package com.insaf.spring.compress.service;

/**
 * Created by DemaFayz on 05.01.2017.
 */


import com.insaf.spring.compress.entity.BaseEntity;

import java.util.List;

public interface BaseService {

    List<BaseEntity> getAll();
    BaseEntity getById(long id);
    BaseEntity save(BaseEntity baseEntity);
    void remove(long id);
}
