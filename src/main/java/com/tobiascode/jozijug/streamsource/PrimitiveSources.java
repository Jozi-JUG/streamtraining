package com.tobiascode.jozijug.streamsource;


import java.util.stream.IntStream;

public class PrimitiveSources {
    public static void main(String[] args) {
        System.out.println("Old school exlusive");
        for (int i = 1; i < 4; i++){
            System.out.println(i);
        }

        System.out.println("New school exlusive");
        IntStream.range(1, 4).forEach(System.out::println);

        System.out.println("Old school inclusive");
        for (int i = 1; i <= 4; i++){
            System.out.println(i);
        }

        System.out.println("New school inlusive");
        IntStream.rangeClosed(1, 4).forEach(System.out::println);
    }
}
