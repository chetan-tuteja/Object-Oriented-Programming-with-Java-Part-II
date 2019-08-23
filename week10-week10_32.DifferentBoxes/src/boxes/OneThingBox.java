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
public class OneThingBox extends Box {

    private Thing thing;

    public OneThingBox() {
    }

    public void add(Thing thing) {
        if (this.thing == null) {
            this.thing = thing;
        }
    }

    public boolean isInTheBox(Thing thing) {
        if (this.thing == null) {
            return false;
        }

        if (!this.thing.equals(thing)) {
            return false;
        }
        return true;
    }
}
