package com.hnguigu.dao;

import com.hnguigu.vo.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StaffDao {


    /**
     * 根据条件查询用户  条件没有值 查所有
     * @param staff
     * @return
     */
    public List<Staff> queryStaff(Staff staff);

    /**
     * 根据条件查询用户记录数量
     * @param staff
     * @return
     */
    public int querycountStaff(Staff staff);

    //根据id查询
    public Staff queryById(int id);
    //添加（注册）
    public int addStaff(Staff staff);
    //修改
    public int updateStaff(Staff staff);
    //删除
    public int deleteStaff(int id);


}
