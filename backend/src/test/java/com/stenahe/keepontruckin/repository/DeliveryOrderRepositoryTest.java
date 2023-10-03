package com.stenahe.keepontruckin.repository;

import com.stenahe.keepontruckin.entity.*;
import com.stenahe.keepontruckin.enums.Status;
import com.stenahe.keepontruckin.enums.Types;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DeliveryOrderRepositoryTest {
    @Autowired
    private DeliveryOrderRepository deliveryOrderRepository;

    @Test
    public void saveOrderRepository() {
        Cargo cargo =
                Cargo.builder()
                        .cargoName("wineBarrels")
                        .weightKg(900)
                        .cargoStatus(Status.CargoStatus.DELIVERED)
                        .build();

        Waypoint waypoint =
                Waypoint.builder()
                        .destinationCity("Dresden")
                        .cargo(cargo)
                        .actionType(Types.ActionType.LOADING)
                        .build();

        Truck truck =
                Truck.builder()
                        .truckId("4444ABC")
                        .capacityTonnes(10)
                        .truckStatus(Status.TruckStatus.OK)
                        .currentCity("Wolfsburg")
                        .build();

        Driver driver1 =
                Driver.builder()
                        .firstName("Bob")
                        .lastName("Baratheon")
                        .remainingMonthlyHours(176)
                        .driverStatus(Status.DriverStatus.REST)
                        .currentCity("Wolfsburg")
                        .truck(truck)
                        .build();

        Driver driver2 =
                Driver.builder()
                        .firstName("Max")
                        .lastName("Mustermann")
                        .remainingMonthlyHours(176)
                        .driverStatus(Status.DriverStatus.REST)
                        .currentCity("Wolfsburg")
                        .truck(truck)
                        .build();

        DeliveryOrder order =
                DeliveryOrder.builder()
                        .isOrderCompleted(true)
                        .waypoints(List.of(waypoint))
                        .truck(truck)
                        .drivers(List.of(driver1, driver2))
                        .build();
        deliveryOrderRepository.save(order);
    }

    @Test
    public void printAllDrivers() {
        List<DeliveryOrder> deliveryOrders =
                deliveryOrderRepository.findAll();
        System.out.println("orders = " + deliveryOrders);
    }
}