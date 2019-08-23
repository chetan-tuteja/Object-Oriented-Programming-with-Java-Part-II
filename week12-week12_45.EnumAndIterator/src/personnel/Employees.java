/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.*;

/**
 *
 * @author Chetan Tuteja
 */
public class Employees {

    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.list.add(person);
    }

    public void add(List<Person> persons) {
        this.list.addAll(persons);
    }

    public void print() {
        Iterator<Person> iterator = this.list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.list.iterator();
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation().equals(education)) {
                System.out.println(nextPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.list.iterator();
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }

}
