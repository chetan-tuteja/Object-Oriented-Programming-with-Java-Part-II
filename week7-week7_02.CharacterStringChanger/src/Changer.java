/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> list;

    public Changer() {
        list = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        this.list.add(change);
    }

    public String change(String characterString) {
        String ret = characterString;
        for (Change i : this.list) {
            ret = i.change(ret);
        }
        return ret;
    }

}
