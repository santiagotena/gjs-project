package com.stenahe.keepontruckin.repository;

import com.stenahe.keepontruckin.entity.CountryMap;
import com.stenahe.keepontruckin.entity.Truck;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CountryMapRepositoryTest {
    @Autowired
    private CountryMapRepository countryMapRepository;

    @Test
    public void saveCountryMapRepository() {
        CountryMap countryMap =
                CountryMap.builder()
                        .sourceCity("Wolfsburg")
                        .destinationCity("Berlin")
                        .distanceKm(230)
                        .build();
        countryMapRepository.save(countryMap);
    }

    @Test
    public void printAllCountryMaps() {
        List<CountryMap> countryMaps =
                countryMapRepository.findAll();
        System.out.println("countryMaps = " + countryMaps);
    }
}