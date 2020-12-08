package com.hnguigu.vo;

import java.util.List;

public class Menu {
    /**
     * 主键
     */
    private Long menuid;

    /**
     * 名称
     */
    private String name;

    /**
     * 菜单编码
     */
    private String menuCode;

    /**
     * 父节点
     */
    private Long parentId;

    /**
     * 节点类型，1文件夹，2页面，3按钮
     */
    private Integer nodeType;

    /**
     * 图标地址
     */
    private String iconUrl;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 页面对应的地址
     */
    private String linkUrl;

    /**
     * 层次
     */
    private Integer level;

    /**
     * 树id的路径 整个层次上的路径id，逗号分隔，想要找父节点特别快
     */
    private String path;

    /**
     * 是否删除   0：未删除  1：已删除
     */
    private Integer isdelete;

    /**
     * 子菜单集合
     */
    List<Menu> childMenu;

    //权限数据回显 点击选中一个角色  如果该角色拥有此菜单
    //操作权限，checked 为true
    private boolean checked;


    public Menu() {
    }

    public Menu(Long menuid, String name, String menuCode, Long parentId, Integer nodeType, String iconUrl, Integer sort, String linkUrl, Integer level, String path, Integer isdelete, List<Menu> childMenu, boolean checked) {
        this.menuid = menuid;
        this.name = name;
        this.menuCode = menuCode;
        this.parentId = parentId;
        this.nodeType = nodeType;
        this.iconUrl = iconUrl;
        this.sort = sort;
        this.linkUrl = linkUrl;
        this.level = level;
        this.path = path;
        this.isdelete = isdelete;
        this.childMenu = childMenu;
        this.checked = checked;
    }

    public Long getMenuid() {
        return menuid;
    }

    public void setMenuid(Long menuid) {
        this.menuid = menuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public List<Menu> getChildMenu() {
        return childMenu;
    }

    public void setChildMenu(List<Menu> childMenu) {
        this.childMenu = childMenu;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "MenuInfo{" +
                "menuid=" + menuid +
                ", name='" + name + '\'' +
                ", menuCode='" + menuCode + '\'' +
                ", parentId=" + parentId +
                ", nodeType=" + nodeType +
                ", iconUrl='" + iconUrl + '\'' +
                ", sort=" + sort +
                ", linkUrl='" + linkUrl + '\'' +
                ", level=" + level +
                ", path='" + path + '\'' +
                ", isdelete=" + isdelete +
                ", childMenu=" + childMenu +
                ", checked=" + checked +
                '}';
    }
}
