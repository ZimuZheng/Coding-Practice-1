package com.itlize.codinghomework1.service;

import com.itlize.codinghomework1.entity.CreditCard;
import com.itlize.codinghomework1.entity.Menu;
import com.itlize.codinghomework1.entity.PrisonBreak;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

public interface CodingService {
    ResponseEntity<?> codingTestOne(Menu menu);

    ResponseEntity<?> codingTestTwo(CreditCard creditCard);

    ResponseEntity<?> codingTestThree(PrisonBreak prisonBreak);

    ResponseEntity<?> codingTestFour(String filepath) throws IOException;
}
