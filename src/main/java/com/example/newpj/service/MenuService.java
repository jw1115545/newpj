package com.example.newpj.service;


import com.example.newpj.repo.MenuRepository;
import com.example.newpj.vo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    // 전체 데이터 조회
    public List<MenuVo> findAll() {
        List<MenuVo> menu = new ArrayList<>();
        menuRepository.findAll().forEach(e -> menu.add(e));
        return menu;
    }

    // 데이터 넣기(insert)
    public Long save(MenuVo menu) {
        return menuRepository.save(menu).getId();
//        return menu;
    }

    public List<MenuVo> findRandMenu() {
        return menuRepository.findRandMenu();
    }


}