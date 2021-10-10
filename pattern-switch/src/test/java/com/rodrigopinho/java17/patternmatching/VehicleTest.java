package com.rodrigopinho.java17.patternmatching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleTest {
    @Test
    void testVehicleType() {
        assertThat(Vehicle.sealedVehicle(new Bus()))
                .isEqualTo("Vehicle type: Bus");

        assertThat(Vehicle.sealedVehicle(new Car()))
                .isEqualTo("Vehicle type: Car");

        assertThat(Vehicle.sealedVehicle(new Motorcycle()))
                .isEqualTo("Vehicle type: Motorcycle");
    }
}
