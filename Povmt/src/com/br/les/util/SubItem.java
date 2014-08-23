
package com.br.les.util;

import android.graphics.Bitmap;

public class SubItem {
    private String name;
    private Bitmap image;
    private Integer qnt;
    private String description;

    public SubItem(String name, Bitmap image, Integer qnt, String desc) {
        this.setName(name);
        this.setImage(image);
        this.setQnt(qnt);
        this.setDescription(desc);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
