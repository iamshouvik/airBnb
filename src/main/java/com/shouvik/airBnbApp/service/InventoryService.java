package com.shouvik.airBnbApp.service;

import com.shouvik.airBnbApp.dto.HotelDto;
import com.shouvik.airBnbApp.dto.HotelSearchRequest;
import com.shouvik.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
