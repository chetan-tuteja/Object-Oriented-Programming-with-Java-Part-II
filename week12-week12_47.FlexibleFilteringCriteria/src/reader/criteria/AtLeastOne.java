/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.*;

/**
 *
 * @author Chetan Tuteja
 */
public class AtLeastOne implements Criterion {

    private List<Criterion> input = new ArrayList<Criterion>();

    public AtLeastOne(Criterion... values) {
        for (int i = 0; i < values.length; i++) {
            input.add(values[i]);
        }
    }

    @Override
    public boolean complies(String line) {
        for (Criterion i : this.input) {
            if (i.complies(line)) {
                return true;
            }
        }
        return false;
    }

}
