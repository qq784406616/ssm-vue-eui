package com.hnguigu.vo;

/**
 * 角色表
 */
public class Role {

    private Integer roleid; //角色ID
    private String rolename;//角色名称
    private String remark;  //角色备注

    public Role() {
    }

    public Role(Integer roleid, String rolename, String remark) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.remark = remark;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
