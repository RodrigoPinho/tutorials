package com.rodrigopinho.java17.patternmatching;

sealed interface Vehicle permits Car, Bus, Motorcycle {
    static String sealedVehicle(Vehicle v) {
        return switch (v) {
            case Bus b -> "Vehicle type: Bus";
            case Car c -> "Vehicle type: Car";
            case Motorcycle m -> "Vehicle type: Motorcycle";
        };
    }
}
final class Bus implements Vehicle {}
final class Car implements Vehicle {}
final class Motorcycle implements Vehicle {}

