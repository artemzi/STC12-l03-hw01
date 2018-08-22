package com.github.artemzi;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Integer[] data = new Integer[1000];
        for (int i = 0; i < 1000; i++) {
            data[i] = ThreadLocalRandom.current().nextInt(1, 100500);
        }
        MathBox mathBox = new MathBox(data);

        System.out.println(mathBox.storage);
    }
}
