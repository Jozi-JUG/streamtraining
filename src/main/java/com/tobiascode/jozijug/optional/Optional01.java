package com.tobiascode.jozijug.optional;

import com.tobiascode.jozijug.model.Track;

public class Optional01 {
    public static Track getTrack(String trackName) {
        return null;
    }

    public static void main(String[] args) {
        Track nullTrack = getTrack("some name");

        System.out.println(nullTrack.getLength());
    }
}
