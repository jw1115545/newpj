package com.example.newpj;

import com.example.newpj.service.BurgerkingService;
import com.example.newpj.service.McdonaldService;
import com.example.newpj.service.MenuService;
import com.example.newpj.vo.BurgerkingVo;
import com.example.newpj.vo.McdonaldVo;
import com.example.newpj.vo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class NewpjApiController {
    @Autowired
    private MenuService menuService;



    @PostMapping("/api/v1/insert")
    public Long save(@RequestBody MenuVo menu) {
        return menuService.save(menu);
    }

    @Transactional(readOnly = true)
    @GetMapping("/api/v1/menulist")
    public ResponseEntity<List<MenuVo>> getAllMenu() {
        List<MenuVo> list = menuService.findAll();
        return new ResponseEntity<List<MenuVo>>(list, HttpStatus.OK);
    }

    @GetMapping("/api/v1/bestmenu")
    public ResponseEntity<List<MenuVo>> getBestMenu() {
        List<MenuVo> list = menuService.findRandMenu();
        return new ResponseEntity<List<MenuVo>>(list, HttpStatus.OK);
    }

    @Autowired
    private BurgerkingService burgerkingService;

    @Transactional(readOnly = true)
    @GetMapping("/api/v1/bergerkinglist")
    public ResponseEntity<List<BurgerkingVo>> getAllBurgerking() {
        List<BurgerkingVo> list = burgerkingService.findAll();
        return new ResponseEntity<List<BurgerkingVo>>(list, HttpStatus.OK);
    }
    @GetMapping("/api/v1/bestbk")
    public ResponseEntity<List<BurgerkingVo>> getBestBurgerking() {
        List<BurgerkingVo> list = burgerkingService.findRandMenu();
        return new ResponseEntity<List<BurgerkingVo>>(list, HttpStatus.OK);
    }
    @PostMapping("/api/v1/bk_insert")
    public Long save(@RequestBody BurgerkingVo burgerkingVo) {
        return burgerkingService.save(burgerkingVo);
    }
    @Autowired
    private McdonaldService mcdonaldService;

    @Transactional(readOnly = true)
    @GetMapping("/api/v1/mcdoanldlist")
    public ResponseEntity<List<McdonaldVo>> getAllMcdonald() {
        List<McdonaldVo> list = mcdonaldService.findAll();
        return new ResponseEntity<List<McdonaldVo>>(list, HttpStatus.OK);
    }
    @GetMapping("/api/v1/bestmc")
    public ResponseEntity<List<McdonaldVo>> getBestMcdonald() {
        List<McdonaldVo> list = mcdonaldService.findRandMenu();
        return new ResponseEntity<List<McdonaldVo>>(list, HttpStatus.OK);
    }
    @PostMapping("/api/v1/mc_insert")
    public Long save(@RequestBody McdonaldVo mcdonaldVo) {
        return mcdonaldService.save(mcdonaldVo);
    }




}
