package com.insaf.spring.compress.service;

/**
 * Created by DemaFayz on 05.01.2017.
 */

import com.insaf.spring.compress.entity.BaseEntity;
import com.insaf.spring.compress.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseServiceImpl implements BaseService {

    @Autowired
    private BaseRepository repository;

    public List<BaseEntity> getAll() {
        return repository.findAll();
    }

    public BaseEntity getById(long id) {
        return repository.findOne(id);
    }

    public BaseEntity save(BaseEntity baseEntity) {
        return repository.saveAndFlush(baseEntity);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
