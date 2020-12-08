package com.hnguigu.controller;

import com.alibaba.fastjson.JSONObject;
import com.hnguigu.service.StaffService;
import com.hnguigu.vo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StaffController {

    @Autowired
    StaffService staffService;



    @RequestMapping("/queryStaff.action")
    @ResponseBody
    @CrossOrigin
    public String queryStaff(Staff staff,
                            @RequestParam(value = "page",defaultValue = "1") int page,
                            @RequestParam(value = "rows",defaultValue = "10") int rows){
        return JSONObject.toJSONString(staffService.queryStaff(staff,page,rows));

    }

    @RequestMapping("/queryStaff2.action")
    @ResponseBody
    @CrossOrigin
    public String queryStaff2(Staff staff,
                             @RequestParam(value = "page",defaultValue = "1") int page,
                             @RequestParam(value = "rows",defaultValue = "5") int rows){
        return JSONObject.toJSONString(staffService.querycountStaff(staff,page,rows));

    }

    //添加
    @RequestMapping(value = "/addStaff.action",produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin
    public String AddStaff(Staff staff) {

        int num=staffService.addStaff(staff);
        if(num==1){
            return "添加成功";
        }else{
            return "添加失败";
        }
    }

    //修改
    @RequestMapping(value = "/updateStaff.action",produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin
    public String UpdateStaff(Staff staff) {
        System.out.println(staff);

        int num = staffService.updateStaff(staff);
        if(num>0) {
            //跳转页面
            return "修改成功";
        }else{
            return "修改失败";
        }
    }

    //id查询
    @RequestMapping("/querystaffById.action")
    @ResponseBody
    @CrossOrigin
    public String QueryById(int id,HttpSession session){
        Staff staff=staffService.queryById(id);
        return JSONObject.toJSONString(staff);
    }


    //删除
    @RequestMapping(value = "/deleteStaff.action",produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin
    public String DelStaff(int id) {
        //获取参数
        int num = staffService.deleteStaff(id);
        if(num>0) {
            //跳转页面
            return "删除成功";
        }else{
            return "删除成功";
        }

    }

}
