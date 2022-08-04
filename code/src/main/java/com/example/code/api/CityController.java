package com.example.code.api;

import com.example.code.model.dto.ResponseCityDTO;
import com.example.code.services.CityService.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/top")
    public ResponseEntity<List<ResponseCityDTO>> getCities(@RequestParam int amount) {
        return ResponseEntity.ok().body(cityService.getTopCities(amount));
    }

    @GetMapping("/part")
    ResponseEntity<List<ResponseCityDTO>> getCitiesByPartOfName(@RequestParam String part) {
        return ResponseEntity.ok().body(cityService.getCitiesByPartOfName(part));
    }

}
