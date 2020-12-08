package com.hnguigu.service;

import com.hnguigu.vo.PageVo;
import com.hnguigu.vo.Staff;

import java.util.List;

public interface StaffService {

    /**
     * 根据条件查询用户  条件没有值 查所有
     * @param staff
     * @return
     */
    public List<Staff> queryStaff(Staff staff, int page, int rows);

    /**
     * 根据条件查询用户记录数量
     * @param staff
     * @return
     */
    public PageVo<Staff> querycountStaff(Staff staff, int page, int rows);

    public Staff queryById(int id);
    //注册
    public int addStaff(Staff staff);

    public int updateStaff(Staff staff);

    public int deleteStaff(int id);
}
