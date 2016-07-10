package main.java.chapter2.impl;

import main.java.chapter2.Apple;
import main.java.chapter2.ApplePredicate;

/**
 * weight filter
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
