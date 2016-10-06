package co.id.artslv.service;

import co.id.artslv.lib.response.MessageWrapper;
import co.id.artslv.lib.transactions.Transaction;
import co.id.artslv.lib.transactions.Transactiondet;
import co.id.artslv.lib.utility.CustomErrorResponse;
import co.id.artslv.lib.utility.CustomException;
import co.id.artslv.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by root on 26/09/16.
 */
@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;


}
