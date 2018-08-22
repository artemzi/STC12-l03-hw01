package com.github.artemzi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class MathBox {

    private Set<Integer> storage = new TreeSet<>();

    MathBox(Integer[] data) {
        storage.addAll(Arrays.asList(data));
    }

    int summator() {
        return storage.stream().mapToInt(Integer::intValue).sum();
    }

    ArrayList<Double> splitter(int divider) {
        ArrayList<Double> result = new ArrayList<>();
        for (Integer current : this.storage) {
            result.add((double) current / divider);
        }
        return result;
    }
}
