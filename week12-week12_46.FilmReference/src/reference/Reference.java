/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import reference.comparator.*;
import reference.domain.*;
import java.util.*;

/**
 *
 * @author Chetan Tuteja
 */
public class Reference {

    private RatingRegister reg;

    public Reference(RatingRegister reg) {
        this.reg = reg;
    }

    public Film recommendFilm(Person person) {
        ArrayList<Film> films = new ArrayList<Film>();
        List<Person> reviewers = this.reg.reviewers();

        if (!reviewers.contains(person)) {
            for (Film i : this.reg.filmRatings().keySet()) {
                films.add(i);
            }
            Collections.sort(films, new FilmComparator(this.reg.filmRatings()));
            return films.get(0);
        } else {

            Map<Person, Integer> temp = new HashMap<Person, Integer>();

            for (Film i : this.reg.getPersonalRatings(person).keySet()) {
                for (Person p : reviewers) {
                    int ratPro = 0;
                    for (Film fp : this.reg.getPersonalRatings(p).keySet()) {
                        if (i.equals(fp)) {
                            ratPro += this.reg.getPersonalRatings(person).get(i).getValue() * this.reg.getPersonalRatings(p).get(fp).getValue();

                        }
                    }
                    temp.put(p, ratPro);
                }
            }
            Collections.sort(reviewers, new PersonComparator(temp));

            Film toRet;
            if (reviewers.get(0).equals(person)) {
                toRet = this.retHighestRated(person, reviewers.get(1));
            } else {
                toRet = this.retHighestRated(person, reviewers.get(0));
            }
            return toRet;
        }
    }

    private Film retHighestRated(Person main, Person other) {
        Map<Film, Rating> mainP = this.reg.getPersonalRatings(main);
        Map<Film, Rating> otherP = this.reg.getPersonalRatings(other);
        Map<Film, Rating> tempMap = new HashMap<Film, Rating>();

        tempMap.putAll(otherP);

        ArrayList<Film> list = new ArrayList<Film>(mainP.keySet());
        ArrayList<Integer> intList = new ArrayList<Integer>();

        for (Film i : list) {
            for (Film f : otherP.keySet()) {
                if (i.equals(f)) {
                    tempMap.remove(i);
                }
            }
        }

        for (Film x : tempMap.keySet()) {
            intList.add(tempMap.get(x).getValue());
        }

        if (intList.isEmpty()) {
            return null;
        }

        int rat = intList.get(0);
        for (int z : intList) {
            if (rat < z) {
                rat = z;
            }
        }

        Film temp = new Film("");
        for (Film a : tempMap.keySet()) {
            if (tempMap.get(a).getValue() == rat) {
                temp = a;
                break;
            }
        }

        return temp;
    }
}
