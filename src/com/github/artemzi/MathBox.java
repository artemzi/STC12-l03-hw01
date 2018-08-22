package com.github.artemzi;

import java.util.*;

class MathBox extends HashMap {

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

    @Override
    public boolean equals(Object o) { // TODO: does current code satisfying contract?
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        if (storage.hashCode() != mathBox.hashCode()) return false;
        return Objects.equals(storage, mathBox.storage);
    }

    @Override
    public int hashCode() {
        return storage.hashCode();
    }

    @Override
    public String toString() {
        return "MathBox{" +
                storage +
                '}';
    }
}
