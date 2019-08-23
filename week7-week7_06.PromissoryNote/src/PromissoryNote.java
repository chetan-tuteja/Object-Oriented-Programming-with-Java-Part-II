/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.HashMap;
import java.util.Map;

public class PromissoryNote {
    
    private HashMap<String, Double> hash;
    
    public PromissoryNote() {
        this.hash = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        this.hash.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        if (this.hash.containsKey(whose)) {
            return this.hash.get(whose);
        }
        return 0;
    }
}
