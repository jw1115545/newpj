package com.example.newpj.vo;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="tb_menu")
public class MenuVo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String menu;
    private int price;
    private int price2;
    private String img;

    @Builder
    public MenuVo(String menu, int price,int price2, String img) {
        this.menu = menu;
        this.price = price;
        this.price2=price2;
        this.img = img;
    }

}
