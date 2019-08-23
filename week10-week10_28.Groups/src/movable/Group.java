/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Chetan Tuteja
 */
public class Group implements Movable {

    private List<Movable> list;

    public Group() {
        this.list = new ArrayList<Movable>();
    }

    @Override
    public String toString() {
        String result = "";
        for (Movable i : this.list) {
            result += i.toString() + "\n";
        }
        return result;
    }

    public void addToGroup(Movable movable) {
        this.list.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable i : this.list) {
            i.move(dx, dy);
        }
    }
}
