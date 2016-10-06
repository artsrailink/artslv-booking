package co.id.artslv.controller;

import co.id.artslv.lib.response.MessageWrapper;
import co.id.artslv.lib.transactions.Transaction;
import co.id.artslv.lib.utility.CustomErrorResponse;
import co.id.artslv.lib.utility.CustomException;
import co.id.artslv.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by gemuruhgeo on 06/09/16.
 */
@RestController
@RequestMapping(value = "/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;


}
