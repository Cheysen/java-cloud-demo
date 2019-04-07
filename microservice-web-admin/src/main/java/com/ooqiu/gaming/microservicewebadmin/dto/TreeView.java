package com.ooqiu.gaming.microservicewebadmin.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 前端树控件
 * <p>Title: TreeView</p>
 * <p>Description: </p>
 *
 * @author Lusifer
 * @version 1.0.0
 * @date 2018/3/2 9:19
 */
@Data
public class TreeView implements Serializable {
    private String id;
    private String icon;
    private String text;
    private boolean children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }
}
