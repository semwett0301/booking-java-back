package com.example.code.api;

import com.example.code.model.dto.RequestHotelDTO;
import com.example.code.model.dto.ResponseHotelDTO;
import com.example.code.services.HotelService.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public ResponseEntity<List<ResponseHotelDTO>> getHotels(@RequestBody RequestHotelDTO requestHotelDTO) {
        return ResponseEntity.ok().body(hotelService.getHotels(requestHotelDTO));
    }
}
