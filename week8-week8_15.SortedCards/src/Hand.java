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
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> list;

    public Hand() {
        this.list = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.list.add(card);
    }

    public void print() {
        for (Card i : this.list) {
            System.out.println(i);
        }
    }

    public int total() {
        int temp = 0;
        for (Card i : this.list) {
            temp += i.getValue();
        }
        return temp;
    }

    public void sort() {
        Collections.sort(this.list);
    }

    @Override
    public int compareTo(Hand hand) {
        return this.total() - hand.total();
    }

    public void sortAgainstSuit() {
        Collections.sort(this.list, new SortAgainstSuitAndValue());
    }

}
