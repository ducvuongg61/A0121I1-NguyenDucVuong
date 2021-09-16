package controller;

import model.bean.User;

import java.util.Comparator;

public class ComparatorName implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getName().charAt(0) > o2.getName().charAt(0)) {
            return 1;
        } else if (o1.getName().charAt(0) == o2.getName().charAt(0)) {
            return 0;
        } else {
            return -1;
        }
    }
}
