
package com.br.les.util;

import java.util.ArrayList;
import java.util.List;

public class Item {

    @Override
    public String toString() {
        return "Item [name=" + name + ", subItems=" + subItems + "]";
    }

    private String name;
    private List<SubItem> subItems;

    public Item(String name) {
        this.setName(name);
        this.setSubItems(new ArrayList<SubItem>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubItem> getSubItems() {
        return subItems;
    }

    public void setSubItems(List<SubItem> subItems) {
        this.subItems = subItems;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public void addSubItem(SubItem si) {
        this.subItems.add(si);
    }
}
