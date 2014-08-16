
package com.br.les.util;

import android.graphics.Bitmap;

public class SubItem {    
    private String name;
//    private Bitmap image;
    private Integer qnt;

//    public SubItem(String name, Bitmap image, Integer qnt) {
//        this.setName(name);
//        this.setImage(image);
//        this.setQnt(qnt);
//    }
    
    public SubItem(String name, String str, Integer qnt) {
        this.setName(name);
        this.setQnt(qnt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Bitmap getImage() {
//        return image;
//    }
//
//    public void setImage(Bitmap image) {
//        this.image = image;
//    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

}
