/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Chetan Tuteja
 */
public class BlackHoleBox extends Box {

    private Thing thing;

    public BlackHoleBox() {
    }

    public void add(Thing thing) {
        this.thing = thing;
    }

    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
