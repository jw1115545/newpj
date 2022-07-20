package com.example.newpj.service;

import com.example.newpj.repo.*;
import com.example.newpj.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BurgerkingService {
    @Autowired
    private BurgerkingRepository burgerkingRepository;

    // 전체 데이터 조회
    public List<BurgerkingVo> findAll() {
        List<BurgerkingVo> menu = new ArrayList<>();
        burgerkingRepository.findAll().forEach(e -> menu.add(e));
        return menu;
    }

    // 데이터 넣기(insert)
    public Long save(BurgerkingVo menu) {
        return burgerkingRepository.save(menu).getId();
//        return menu;
    }

    public List<BurgerkingVo> findRandMenu() {
        return burgerkingRepository.findRandMenu();
    }
}
