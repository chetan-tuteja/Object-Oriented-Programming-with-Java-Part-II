/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

/**
 *
 * @author Chetan Tuteja
 */
import java.util.ArrayList;
import java.util.List;
import moving.domain.*;

public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> ret = new ArrayList<Box>();
        for (Thing i : things) {
            Box temp = new Box(this.boxesVolume);
            temp.addThing(i);
            ret.add(temp);
        }
        return ret;
    }

}
