package com.hnguigu.dao;

import com.hnguigu.vo.Menu;

import java.util.List;

public interface MenuDao {


    /**
     * 根据条件查询  条件没有值 查所有
     * @param menu
     * @return
     */
    public List<Menu> queryMenu(Menu menu);

    /**
     * 根据条件查询角色记录数量
     * @param menu
     * @return
     */
    public int querycountMenu(Menu menu);

    //添加
    public int addMenu(Menu menu);
    //删除
    public int deleteMenu(int id);
    //修改
    public int updateMenu(Menu menu);
    //根据id查询
    public Menu queryById(int id);



}
