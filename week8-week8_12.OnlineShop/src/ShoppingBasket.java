/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {

    private Map<String, Purchase> map;

    public ShoppingBasket() {
        this.map = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (this.map.containsKey(product)) {
            this.map.get(product).increaseAmount();
        } else {
            this.map.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int total = 0;
        for (String i : this.map.keySet()) {
            total += this.map.get(i).price();
        }
        return total;
    }

    public void print() {
        for (String i : this.map.keySet()) {
            System.out.println(this.map.get(i));
        }
    }

}
