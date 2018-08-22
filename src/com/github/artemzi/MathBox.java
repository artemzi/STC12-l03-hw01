package com.github.artemzi;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class MathBox {

    Set<Integer> storage = new TreeSet<>();

    MathBox(Integer[] data) {
        storage.addAll(Arrays.asList(data));
    }
}
