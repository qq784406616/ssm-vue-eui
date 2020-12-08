package com.hnguigu.service;

import com.hnguigu.vo.PageVo;
import com.hnguigu.vo.Role;

import java.util.List;

public interface RoleService {


    /**
     * 根据条件查询角色  条件没有值 查所有
     * @param role
     * @return
     */
    public List<Role> queryRole(Role role,int page, int rows);

    /**
     * 根据条件查询角色记录数量
     * @param role
     * @return
     */
    public PageVo<Role> querycountRole(Role role, int page, int rows);


    //添加角色
    public int addRole(Role role);
    //删除角色
    public int deleteRole(int id);
    //修改角色
    public int updateRole(Role role);
    //根据id查询角色
    public Role queryById(int id);
}
