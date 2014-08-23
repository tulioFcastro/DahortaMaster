
package com.br.les.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {

    private List<Item> cardapio;

    public Menu() {
        this.setCardapio(new ArrayList<Item>());
        Item temp0 = new Item("Guarnicao");
        this.cardapio.add(temp0);
        Item temp1 = new Item("Molho");
        this.cardapio.add(temp1);
        Item temp2 = new Item("Salada");
        this.cardapio.add(temp2);
        Item temp3 = new Item("Acompanhamento");
        this.cardapio.add(temp3);
    }

    public void addSubItem(String itemName, SubItem si) {

        for (int i = 0; i < cardapio.size(); i++) {
            if (this.getCardapio().get(i).getName().equals(itemName)) {
                this.getCardapio().get(i).addSubItem(si);
                return;
            }
        }

    }

    public List<Item> getCardapio() {
        return cardapio;
    }

    public void setCardapio(List<Item> cardapio) {
        this.cardapio = cardapio;
    }

    @Override
    public String toString() {
        return this.cardapio.toString();
    }
    
}
