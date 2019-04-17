package com.pojo;

import java.util.List;
/**
* @Description:     树形结构实体类
* @Author:         jieHao
* @CreateDate:     2019/4/17 16:50
* @UpdateUser:     jieHao
* @UpdateDate:     2019/4/17 16:50
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class TestMode {

    /** 节点id */
    private Integer id;
    /** 节点名称 */
    private String name;
    /** 父节点id */
    private Integer parentId;
    /** 节点下的子节点 */
    private List<TestMode> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<TestMode> getChildren() {
        return children;
    }

    public void setChildren(List<TestMode> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "{"+"id=" + id + ", name=" + name + ", parentId=" + parentId + ", children=" + children+"}";
    }
}

