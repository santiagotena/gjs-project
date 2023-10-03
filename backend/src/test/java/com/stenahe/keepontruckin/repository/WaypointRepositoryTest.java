package com.stenahe.keepontruckin.repository;

import com.stenahe.keepontruckin.entity.Cargo;
import com.stenahe.keepontruckin.entity.Driver;
import com.stenahe.keepontruckin.entity.Waypoint;
import com.stenahe.keepontruckin.enums.Status;
import com.stenahe.keepontruckin.enums.Types;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WaypointRepositoryTest {
    @Autowired
    private WaypointRepository waypointRepository;

    @Test
    public void saveWaypointRepository() {
        Cargo cargo =
                Cargo.builder()
                        .cargoName("freshBread")
                        .weightKg(500)
                        .cargoStatus(Status.CargoStatus.SHIPPED)
                        .build();

        Waypoint waypoint =
                Waypoint.builder()
                        .destinationCity("Berlin")
                        .cargo(cargo)
                        .actionType(Types.ActionType.UNLOADING)
                        .build();
        waypointRepository.save(waypoint);
    }

    @Test
    public void printAllWaypoints() {
        List<Waypoint> waypoints =
                waypointRepository.findAll();
        System.out.println("waypoints = " + waypoints);
    }

}