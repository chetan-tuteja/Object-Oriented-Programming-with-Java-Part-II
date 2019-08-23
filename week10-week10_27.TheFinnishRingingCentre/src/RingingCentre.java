/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.*;

public class RingingCentre {

    private Map<Bird, List<String>> hash;

    public RingingCentre() {
        this.hash = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (this.hash.containsKey(bird)) {
            this.hash.get(bird).add(place);
        } else {
            this.hash.put(bird, new ArrayList<String>());
            this.hash.get(bird).add(place);
        }
    }

    public void observations(Bird bird) {
        if (this.hash.containsKey(bird)) {
            System.out.println(bird.toString() + " observations: " + this.hash.get(bird).size());
            for (int i = 0; i < this.hash.get(bird).size(); i++) {
                System.out.println(this.hash.get(bird).get(i));
            }
        } else {
            System.out.println(bird.toString() + " observations: 0");
        }
    }
}
