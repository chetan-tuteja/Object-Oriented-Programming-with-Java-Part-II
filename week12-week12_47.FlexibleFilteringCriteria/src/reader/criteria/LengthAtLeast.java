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
public class LengthAtLeast implements Criterion {

    private int reqLen;

    public LengthAtLeast(int reqLen) {
        this.reqLen = reqLen;
    }

    @Override
    public boolean complies(String line) {
        if (line.length() < this.reqLen) {
            return false;
        }
        return true;
    }
}
