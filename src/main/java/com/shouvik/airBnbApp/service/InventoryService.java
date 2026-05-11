package com.shouvik.airBnbApp.service;

import com.shouvik.airBnbApp.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

}
