package com.hnguigu.controller;

import com.hnguigu.service.MenuService;
import com.hnguigu.service.RoleService;
import com.hnguigu.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MenuController {

    @Autowired
    MenuService menuService;


    @RequestMapping("/queryMenu.action")
    @ResponseBody
    @CrossOrigin
    public List<Menu> queryMenu(Menu menu,
                                    @RequestParam(value = "page", defaultValue = "1") int page,
                                    @RequestParam(value = "rows", defaultValue = "10") int rows) {
        return menuService.queryMenu(menu, page, rows);

    }

    @RequestMapping("/queryMenu2.action")
    @ResponseBody
    @CrossOrigin
    public PageVo<Menu> queryMenu2(Menu menu,
                                       @RequestParam(value = "page", defaultValue = "1") int page,
                                       @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return menuService.querycountMenu(menu, page, rows);

    }

    //修改
    @RequestMapping(value = "/addMenu.action",produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin
    public String addMenu(Menu menu) {

        System.out.println(menu);
        int num = menuService.addMenu(menu);
        if(num>0) {
            //跳转页面
            return "添加成功";
        }else{
            return "添加失败";
        }
    }

    //修改
    @RequestMapping(value = "/updateMenu.action",produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin
    public String updateMenu(Menu menu) {

        System.out.println(menu);
        int num = menuService.updateMenu(menu);
        if(num>0) {
            //跳转页面
            return "修改成功";
        }else{
            return "修改失败";
        }
    }

    //删除
    @RequestMapping(value = "/deleteMenu.action",produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin
    public String DeleteMenu(int id) {
        //获取参数
        int num = menuService.deleteMenu(id);
        if(num>0) {
            //跳转页面
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @RequestMapping(value = "/querymenubyid.action",produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin
    public Menu queryById(int id) {
        System.out.println(id);
        return menuService.queryById(id);
    }


}
