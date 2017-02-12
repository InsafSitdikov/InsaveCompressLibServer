package com.insaf.spring.compress.repository;

/**
 * Created by DemaFayz on 05.01.2017.
 */

import com.insaf.spring.compress.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository extends JpaRepository<BaseEntity, Long> {}