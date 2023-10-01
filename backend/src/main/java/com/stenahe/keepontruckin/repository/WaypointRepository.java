package com.stenahe.keepontruckin.repository;

import com.stenahe.keepontruckin.entity.Waypoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaypointRepository extends JpaRepository<Waypoint, Long> {
}
