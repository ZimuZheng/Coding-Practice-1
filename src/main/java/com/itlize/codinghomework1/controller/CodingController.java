package com.itlize.codinghomework1.controller;


import com.itlize.codinghomework1.entity.CreditCard;
import com.itlize.codinghomework1.entity.Menu;
import com.itlize.codinghomework1.entity.PrisonBreak;
import com.itlize.codinghomework1.service.CodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/coding")
public class CodingController {

    @Autowired
    CodingService codingService;

    @GetMapping(value = "/testone")
    public ResponseEntity<?> testOne(@RequestBody Menu menu) {
        return codingService.codingTestOne(menu);
    }

    @GetMapping(value = "/testtwo")
    public ResponseEntity<?> testTwo(@RequestBody CreditCard creditCard) {
        return codingService.codingTestTwo(creditCard);
    }

    @GetMapping(value = "/testthree")
    public ResponseEntity<?> testThree(@RequestBody PrisonBreak prisonBreak){
        return codingService.codingTestThree(prisonBreak);
    }

    @GetMapping(value = "/testfour")
    public ResponseEntity<?> testFour(@RequestParam String filepath) throws IOException {
        return codingService.codingTestFour(filepath);
    }

}
