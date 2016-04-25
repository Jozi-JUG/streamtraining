package com.tobiascode.jozijug.operations;

import com.tobiascode.jozijug.model.Album;
import com.tobiascode.jozijug.model.Populate;

import java.util.stream.Stream;

public class mapping {
    public static void main(String[] args) {
        Populate.allAlbums.stream()
                .map(Album::getTracks)
                .forEach(System.out::println);

//        Populate.allAlbums.stream()
//                .map(Album::getTracks)
//                .forEach(e-> e.forEach(System.out::println));
//
//        Populate.allAlbums.stream()
//                .flatMap(Album::getTracks)
//                .forEach(System.out::println);
    }
}
