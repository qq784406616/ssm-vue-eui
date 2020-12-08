package com.hnguigu.service;

import com.github.pagehelper.Page;
import com.hnguigu.vo.Menu;
import com.hnguigu.vo.PageVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuService {


    /**
     * 根据条件查询  条件没有值 查所有
     * @param menu
     * @return
     */
    public List<Menu> queryMenu(Menu menu, int page, int rows);

    /**
     * 根据条件查询角色记录数量
     * @param menu
     * @return
     */
    public PageVo<Menu> querycountMenu(Menu menu, int page, int rows);

    public int addMenu(Menu menu);

    public int deleteMenu(int id);

    public int updateMenu(Menu menu);

    public Menu queryById(int id);



}
