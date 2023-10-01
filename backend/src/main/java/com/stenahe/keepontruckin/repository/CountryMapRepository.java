package com.stenahe.keepontruckin.repository;

import com.stenahe.keepontruckin.entity.CountryMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryMapRepository extends JpaRepository<CountryMap, Long> {
}
