package com.stenahe.keepontruckin.repository;

import com.stenahe.keepontruckin.entity.Driver;
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
    public void SaveDriverRepository() {
        Driver driver =
                Driver.builder()
                        .firstName("Santiago")
                        .lastName("Tena")
                        .remainingMonthlyHours(176)
                        .driverStatus(Status.DriverStatus.REST)
                        .currentCity("Wolfsburg")
                        .currentTruck("1234ABC")
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