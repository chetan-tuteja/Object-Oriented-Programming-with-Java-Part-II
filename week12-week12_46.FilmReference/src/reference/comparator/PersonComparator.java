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
public class PersonComparator implements Comparator<Person> {

    private Map<Person, Integer> map;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.map = peopleIdentities;
    }

    @Override
    public int compare(Person p1, Person p2) {
        int temp = this.map.get(p1) - this.map.get(p2);
        if (temp == 0) {
            return 0;
        } else if (temp < 0) {
            return 1;
        }
        return -1;
    }
}
