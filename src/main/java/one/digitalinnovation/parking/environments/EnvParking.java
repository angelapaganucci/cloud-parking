package one.digitalinnovation.parking.environments;

import one.digitalinnovation.parking.model.Parking;

import java.util.ArrayList;
import java.util.List;

public class EnvParking {

    public static List<Parking> parkingList() {
        List<Parking> parkings = new ArrayList<>();
        parkings.add(parking());
        parkings.add(parking1());
        return parkings;
    }

    public static Parking parking() {
        return Parking.builder()
                .id("1")
                .license("HHB-5874")
                .model("Corsa")
                .color("Branco")
                .state("SP")
                .build();
    }

    public static Parking parking1() {
        return Parking.builder()
                .id("2")
                .license("FTR-9874")
                .model("Brasili")
                .color("Amarela")
                .state("AM")
                .build();
    }
}
