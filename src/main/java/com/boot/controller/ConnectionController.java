package com.boot.controller;

import com.boot.model.ShipWreck;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/connection")
public class ConnectionController {

    @RequestMapping(method = RequestMethod.GET)
    public int getTTT() {
        return 666;
    }
}
