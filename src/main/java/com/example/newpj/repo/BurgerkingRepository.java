package com.example.newpj.repo;
import com.example.newpj.vo.BurgerkingVo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
public interface BurgerkingRepository extends JpaRepository<BurgerkingVo, Long> {
    @Query(value = "SELECT * From tb_burgerking ORDER BY rand() LIMIT 1", nativeQuery=true)
    List<BurgerkingVo> findRandMenu();
}
