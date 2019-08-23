/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Chetan Tuteja
 */
public class Not implements Criterion {

    private Criterion given;

    public Not(Criterion given) {
        this.given = given;
    }

    @Override
    public boolean complies(String line) {
        if (given.complies(line)) {
            return false;
        }
        return true;
    }
}
