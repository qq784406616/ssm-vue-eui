package com.hnguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.hnguigu.dao.StaffDao;
import com.hnguigu.service.StaffService;
import com.hnguigu.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffDao staffDao;

    @Override
    public List<Staff> queryStaff(Staff staff, int page, int rows) {
        PageHelper.startPage(page, rows);
        return staffDao.queryStaff(staff);
    }

    @Override
    public PageVo<Staff> querycountStaff(Staff staff, int page, int rows) {
        PageVo<Staff> pageVo = new PageVo<>();
        //放在 查询代码的前面
        PageHelper.startPage(page, rows);
        pageVo.setRows(staffDao.queryStaff(staff));

        pageVo.setTotal(staffDao.querycountStaff(staff));

        return pageVo;
    }

    @Override
    public Staff queryById(int id) {
        return staffDao.queryById(id);
    }

    @Override
    public int addStaff(Staff staff) {
        return staffDao.addStaff(staff);
    }

    @Override
    public int updateStaff(Staff staff) {
        return staffDao.updateStaff(staff);
    }

    @Override
    public int deleteStaff(int id) {
        return staffDao.deleteStaff(id);
    }


}
