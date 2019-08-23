/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.*;
import java.util.*;

/**
 *
 * @author Chetan Tuteja
 */
public class CompoundFigure extends Figure {

    private ArrayList<Figure> list;

    public CompoundFigure() {
        super(0, 0);
        this.list = new ArrayList<Figure>();
    }

    public void add(Figure f) {
        this.list.add(f);
    }

    @Override
    public void move(int dx, int dy) {
        for (Figure i : this.list) {
            i.move(dx, dy);
        }
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure i : this.list) {
            i.draw(graphics);
        }
    }
}
