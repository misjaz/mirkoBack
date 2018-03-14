package com.boot.controller;

import com.boot.model.ShipWreck;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ShipWreckController {

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public int get() {
        return 666;
    }
}
