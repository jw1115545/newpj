package com.example.newpj.service;

import com.example.newpj.repo.*;
import com.example.newpj.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class McdonaldService {
    @Autowired
    private McdonaldRepository mcdonaldRepository;

    // 전체 데이터 조회
    public List<McdonaldVo> findAll() {
        List<McdonaldVo> menu = new ArrayList<>();
        mcdonaldRepository.findAll().forEach(e -> menu.add(e));
        return menu;
    }

    // 데이터 넣기(insert)
    public Long save(McdonaldVo menu) {
        return mcdonaldRepository.save(menu).getId();
//        return menu;
    }

    public List<McdonaldVo> findRandMenu() {
        return mcdonaldRepository.findRandMenu();
    }
}