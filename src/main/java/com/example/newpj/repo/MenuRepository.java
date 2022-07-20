package com.example.newpj.repo;

import com.example.newpj.vo.MenuVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface MenuRepository extends JpaRepository<MenuVo, Long> {
    @Query(value = "SELECT * From tb_menu ORDER BY rand() LIMIT 1", nativeQuery=true)
    List<MenuVo> findRandMenu();
}
