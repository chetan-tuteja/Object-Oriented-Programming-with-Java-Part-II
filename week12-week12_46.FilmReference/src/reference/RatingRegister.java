/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import reference.domain.*;
import java.util.*;

/**
 *
 * @author Chetan Tuteja
 */
public class RatingRegister {

    private Map<Film, List<Rating>> register;
    private Map<Person, Map<Film, Rating>> personalized;

    public RatingRegister() {
        this.register = new HashMap<Film, List<Rating>>();
        this.personalized = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (this.register.containsKey(film)) {
            this.register.get(film).add(rating);
        } else {
            this.register.put(film, new ArrayList<Rating>());
            this.register.get(film).add(rating);
        }
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (this.personalized.containsKey(person)) {
            this.personalized.get(person).put(film, rating);
            this.addRating(film, rating);
        } else {
            this.personalized.put(person, new HashMap<Film, Rating>());
            this.personalized.get(person).put(film, rating);
            this.addRating(film, rating);
        }
    }

    public Rating getRating(Person person, Film film) {
        if (this.personalized.get(person).containsKey(film)) {
            return this.personalized.get(person).get(film);
        }
        return Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (!this.personalized.containsKey(person)) {
            return new HashMap<Film, Rating>();
        }
        return this.personalized.get(person);
    }

    public List<Person> reviewers() {
        List<Person> temp = new ArrayList<Person>();
        for (Person i : this.personalized.keySet()) {
            temp.add(i);
        }
        return temp;
    }

    public List<Rating> getRatings(Film film) {
        return this.register.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.register;
    }
}
