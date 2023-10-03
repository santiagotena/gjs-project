package com.stenahe.keepontruckin.repository;

import com.stenahe.keepontruckin.entity.Cargo;
import com.stenahe.keepontruckin.enums.Status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CargoRepositoryTest {
    @Autowired
    private CargoRepository cargoRepository;

    @Test
    public void saveCargoRepository() {
        Cargo cargo =
                Cargo.builder()
                        .cargoName("cheeseLoad")
                        .weightKg(500)
                        .cargoStatus(Status.CargoStatus.READY)
                        .build();
        cargoRepository.save(cargo);
    }

    @Test
    public void printAllCargo() {
        List<Cargo> cargos =
                cargoRepository.findAll();
        System.out.println("cargos = " + cargos);
    }

}