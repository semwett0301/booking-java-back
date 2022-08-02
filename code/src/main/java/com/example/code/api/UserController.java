package com.example.code.api;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/users")
@Data
public class UserController {

//    @GetMapping("/{id}")
//    public ResponseEntity getUserById(@PathVariable("id") @NotNull UUID id) {
//
//    }
}
