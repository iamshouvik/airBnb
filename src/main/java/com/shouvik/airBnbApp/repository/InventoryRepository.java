package com.shouvik.airBnbApp.repository;

import com.shouvik.airBnbApp.entity.Inventory;
import com.shouvik.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByRoom(Room room);

}
