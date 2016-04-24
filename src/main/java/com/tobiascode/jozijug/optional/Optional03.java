package com.tobiascode.jozijug.optional;

import com.tobiascode.jozijug.model.Track;

public class Optional03 {
    public static Track getTrack(String trackName) {
        return null;
    }

    public static void main(String[] args) {
        Track nullTrack = getTrack("some name");

        if (nullTrack != null) {
            System.out.println(nullTrack.getLength());
        } else {
            System.out.println("Not found");
        }
    }
}
