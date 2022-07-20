package com.example.newpj.repo;

import com.example.newpj.vo.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface McdonaldRepository extends JpaRepository<McdonaldVo, Long> {
    @Query(value = "SELECT * From tb_mcdonald ORDER BY rand() LIMIT 1", nativeQuery=true)
    List<McdonaldVo> findRandMenu();
}
