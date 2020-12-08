package com.hnguigu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hnguigu.dao.MenuDao;
import com.hnguigu.service.MenuService;
import com.hnguigu.vo.Menu;
import com.hnguigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuDao menuDao;


    @Override
    public List<Menu> queryMenu(Menu menu, int page, int rows) {
        PageHelper.startPage(page, rows);
        return menuDao.queryMenu(menu);
    }

    @Override
    public PageVo<Menu> querycountMenu(Menu menu, int page, int rows) {
        PageVo<Menu> pageVo = new PageVo<>();
        //放在 查询代码的前面
        PageHelper.startPage(page, rows);
        pageVo.setRows(menuDao.queryMenu(menu));

        pageVo.setTotal(menuDao.querycountMenu(menu));

        return pageVo;
    }

    @Override
    public int addMenu(Menu menu) {
        return 0;
    }

    @Override
    public int deleteMenu(int id) {
        return 0;
    }

    @Override
    public int updateMenu(Menu menu) {
        return 0;
    }

    @Override
    public Menu queryById(int id) {
        return null;
    }
}
