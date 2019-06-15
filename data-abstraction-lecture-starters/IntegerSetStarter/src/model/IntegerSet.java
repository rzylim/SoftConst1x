package model;

import java.util.ArrayList;

public class IntegerSet {
    ArrayList<Integer> internalArray;

    public IntegerSet(){
        internalArray = new ArrayList<>();
    }

    // MODIFIES: this
    // EFFECTS: inserts integer into set unless it's already there, in which case do nothing.
    public void insert(Integer num) {
        if(!internalArray.contains(num)){
            internalArray.add(num);
        }
    }

    // MODIFIES: this
    // EFFECTS: if the integer is in the integer set, then remove it from the integer set.
    //          otherwise, do nothing.
    public void remove(Integer num) {
        internalArray.remove(num);
    }

    //EFFECTS: return true if set contains num.
    public boolean contains(Integer num) {
        return internalArray.contains(num);
    }

    //EFFECTS: returns size of the set.
    public Integer size() {
        return internalArray.size();
    }

}