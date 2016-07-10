package main.java.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Apple filter
 *
 */
public class AppleFilter {

    /**
     * pass method by java object
     *
     * @param inventory apple invertory
     *
     * @param predicate predicate object
     *
     * @return apple list after filter
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<Apple>();

        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }


}


