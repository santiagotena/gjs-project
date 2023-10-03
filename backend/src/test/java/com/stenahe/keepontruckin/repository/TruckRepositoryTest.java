package com.stenahe.keepontruckin.repository;

import com.stenahe.keepontruckin.entity.Driver;
import com.stenahe.keepontruckin.entity.Truck;
import com.stenahe.keepontruckin.enums.Status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TruckRepositoryTest {
    @Autowired
    private TruckRepository truckRepository;

    @Test
    public void saveTruckRepository() {
        Truck truck =
                Truck.builder()
                        .truckId("1234ABC")
                        .capacityTonnes(10)
                        .truckStatus(Status.TruckStatus.OK)
                        .currentCity("Granada")
                        .build();
        truckRepository.save(truck);
    }

    @Test
    public void printAllTrucks() {
        List<Truck> trucks =
                truckRepository.findAll();
        System.out.println("trucks = " + trucks);
    }

}