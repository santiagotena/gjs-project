package com.stenahe.keepontruckin.repository;

import com.stenahe.keepontruckin.entity.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<Truck, String> {
}
