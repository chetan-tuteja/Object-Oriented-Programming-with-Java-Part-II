/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.*;

public class Storehouse {

    private Map<String, Integer> mapPrice, mapStock;

    public Storehouse() {
        this.mapPrice = new HashMap<String, Integer>();
        this.mapStock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.mapPrice.put(product, price);
        this.mapStock.put(product, stock);
    }

    public int price(String product) {
        if (this.mapPrice.containsKey(product)) {
            return this.mapPrice.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.mapStock.containsKey(product)) {
            return this.mapStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.mapStock.containsKey(product)) {
            if (this.mapStock.get(product) > 0) {
                this.mapStock.put(product, this.mapStock.get(product) - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        Set<String> ret = this.mapPrice.keySet();
        return ret;
    }

}
