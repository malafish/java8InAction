package main.java.chapter2.impl;

import main.java.chapter2.Apple;
import main.java.chapter2.ApplePredicate;

/**
 * Created by malafish on 16/7/10.
 */
public class AppleGreenColorPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
