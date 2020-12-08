package com.hnguigu.controller;

import com.hnguigu.service.RoleService;
import com.hnguigu.vo.PageVo;
import com.hnguigu.vo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {

    @Autowired
    RoleService roleService;

    @RequestMapping("/queryRole.action")
    @ResponseBody
    @CrossOrigin
    public List<Role> queryRole(Role role,
                                @RequestParam(value = "page", defaultValue = "1") int page,
                                @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return roleService.queryRole(role, page, rows);

    }

    @RequestMapping("/queryRole2.action")
    @ResponseBody
    @CrossOrigin
    public PageVo<Role> queryRole2(Role role,
                                   @RequestParam(value = "page", defaultValue = "1") int page,
                                   @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return roleService.querycountRole(role, page, rows);

    }

    //添加
    @RequestMapping(value = "/addRole.action",produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin
    public String addRple(Role role) {

        System.out.println(role);
        int num = roleService.addRole(role);
        if(num>0) {
            //跳转页面
            return "添加成功";
        }else{
            return "添加失败";
        }
    }

    //修改
    @RequestMapping(value = "/updateRole.action",produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin
    public String updateRole(Role role) {

        System.out.println(role);
        int num = roleService.updateRole(role);
        if(num>0) {
            //跳转页面
            return "修改成功";
        }else{
            return "修改失败";
        }
    }

    //删除
    @RequestMapping(value = "/deleteRole.action",produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin
    public String DeleteRole(int id) {
        //获取参数
        int num = roleService.deleteRole(id);
        if(num>0) {
            //跳转页面
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @RequestMapping("/queryrolebyid.action")
    @ResponseBody
    @CrossOrigin
    public Role queryById(int id) {
        System.out.println(id);
        return roleService.queryById(id);
    }
}
