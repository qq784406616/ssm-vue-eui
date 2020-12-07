package com.hnguigu.vo;

/**
 * 员工表
 */
public class Staff {

    private Integer staffid;//角色ID
    private String staffname;//员工姓名
    private String staffaccount;//员工账户
    private String staffpwd;//员工密码
    private String remark;//员工备注

    public Staff() {
    }

    public Staff(Integer staffid, String staffname, String staffaccount, String staffpwd, String remark) {
        this.staffid = staffid;
        this.staffname = staffname;
        this.staffaccount = staffaccount;
        this.staffpwd = staffpwd;
        this.remark = remark;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getStaffaccount() {
        return staffaccount;
    }

    public void setStaffaccount(String staffaccount) {
        this.staffaccount = staffaccount;
    }

    public String getStaffpwd() {
        return staffpwd;
    }

    public void setStaffpwd(String staffpwd) {
        this.staffpwd = staffpwd;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffid=" + staffid +
                ", staffname='" + staffname + '\'' +
                ", staffaccount='" + staffaccount + '\'' +
                ", staffpwd='" + staffpwd + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
