package com.hnguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.hnguigu.dao.RoleDao;
import com.hnguigu.service.RoleService;
import com.hnguigu.vo.PageVo;
import com.hnguigu.vo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDao roleDao;
    @Override
    public List<Role> queryRole(Role role, int page, int rows) {
        PageHelper.startPage(page, rows);
        return roleDao.queryRole(role);
    }

    @Override
    public PageVo<Role> querycountRole(Role role, int page, int rows) {
        PageVo<Role> pageVo = new PageVo<>();
        //放在 查询代码的前面
        PageHelper.startPage(page, rows);
        pageVo.setRows(roleDao.queryRole(role));

        pageVo.setTotal(roleDao.querycountRole(role));

        return pageVo;
    }

    @Override
    public int addRole(Role role) {
        return roleDao.addRole(role);
    }

    @Override
    public int deleteRole(int id) {
        return roleDao.deleteRole(id);
    }

    @Override
    public int updateRole(Role role) {
        return roleDao.updateRole(role);
    }

    @Override
    public Role queryById(int id) {
        return roleDao.queryById(id);
    }
}
