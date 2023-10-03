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
class DriverRepositoryTest {
    @Autowired
    private DriverRepository driverRepository;

    @Test
    public void saveDriverRepository() {
        Truck truck =
                Truck.builder()
                        .truckId("4321ABC")
                        .capacityTonnes(10)
                        .truckStatus(Status.TruckStatus.OK)
                        .currentCity("Wolfsburg")
                        .build();

        Driver driver =
                Driver.builder()
                        .firstName("Santiago")
                        .lastName("Tena")
                        .remainingMonthlyHours(176)
                        .driverStatus(Status.DriverStatus.REST)
                        .currentCity("Wolfsburg")
                        .truck(truck)
                        .build();
        driverRepository.save(driver);
    }

    @Test
    public void printAllDrivers() {
        List<Driver> drivers =
                driverRepository.findAll();
        System.out.println("drivers = " + drivers);
    }
}