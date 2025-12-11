package com.wilmar.web.controller.menu;


import com.wilmar.web.services.base.menu.MenuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {
    MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

}
