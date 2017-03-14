package com.kinath.bookingservice;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kinath on 14/03/2017.
 */
@RestController
@CrossOrigin
@RequestMapping("bookingservice")
@Api(value="Hello World", description="Hello World Controller")
public class BookingController
{
    @RequestMapping(method = RequestMethod.GET,value = "/message")
    public String getMessage()
    {
        return "Hello World";
    }
}
