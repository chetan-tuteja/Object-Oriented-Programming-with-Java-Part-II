/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.*;
import reference.domain.*;

/**
 *
 * @author Chetan Tuteja
 */
public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> map;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.map = ratings;
    }

    public int compare(Film f1, Film f2) {
        int temp = this.retAverage(this.map.get(f1)) - this.retAverage(this.map.get(f2));
        if (temp == 0) {
            return 0;
        } else if (temp < 0) {
            return 1;
        }
        return -1;
    }

    private int retAverage(List<Rating> list) {
        int total = 0;
        for (Rating i : list) {
            total += i.getValue();
        }
        return (total / list.size());
    }
}
