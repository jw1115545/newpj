package com.example.newpj;

import com.example.newpj.dto.TbMenu;
import com.example.newpj.service.*;
import com.example.newpj.dto.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewpjController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private BurgerkingService burgerkingService;
    @Autowired
    private McdonaldService mcdonaldService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/insert")
    public String insert(){
        return "insert";
    }
    @PostMapping("/insert_proc")
    @ResponseBody
    public TbMenu insert_proc(@ModelAttribute TbMenu tbmenu){
        System.out.println(tbmenu.getMenu());
        System.out.println(tbmenu.getPrice());
        System.out.println(tbmenu.getImg());
        return tbmenu;
    }
    @GetMapping("/see")
    public String see(Model model) {
        model.addAttribute("list", menuService.findAll());

        return "see";
    }
    @GetMapping("/best")
    public String best() {

        return "best";
    }
    @GetMapping("/bk_see")
    public String bk_see(Model model) {
        model.addAttribute("list", burgerkingService.findAll());

        return "bk_see";
    }
    @GetMapping("/bk_insert")
    public String bk_insert(){
        return "bk_insert";
    }
    @PostMapping("/bk_insert_proc")
    @ResponseBody
    public TbBurgerking bk_insert_proc(@ModelAttribute TbBurgerking tbBurgerking){
        System.out.println(tbBurgerking.getMenu());
        System.out.println(tbBurgerking.getPrice());
        System.out.println(tbBurgerking.getImg());
        return tbBurgerking;
    }
    @GetMapping("/bk_best")
    public String bk_best() {

        return "bk_best";
    }

    @GetMapping("/mc_see")
    public String mc_see(Model model) {
        model.addAttribute("list", mcdonaldService.findAll());

        return "mc_see";
    }
    @GetMapping("/mc_insert")
    public String mc_insert(){
        return "mc_insert";
    }

    @GetMapping("/mc_best")
    public String mc_best() {

        return "mc_best";
    }

}
