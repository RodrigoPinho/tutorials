package com.rodrigopinho.java17.patternmatching;

public class PatternMatching {

    public static String getPatternMatchingMessage(Object object) {
        return switch (object) {
            case String s -> "Type: String, value: " + s;
            case Integer i -> "Type: Integer, value: " + i;
            case null -> "Null object";
            default ->  "Type: Unknown, value: " + object.toString();
        };
    }


    public static String getGuardedPatternMessage(Object object) {
        return switch (object) {
            case String s && (s.length() > 10)->
                    "Big string, size: " + s.length();
            case String s  ->
                    "Small string, size: " + s.length();
            default ->  "Unsupported Object: " + object.getClass().getSimpleName();
        };
    }
}
