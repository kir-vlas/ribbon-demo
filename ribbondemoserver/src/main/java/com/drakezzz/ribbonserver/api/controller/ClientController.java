package com.drakezzz.ribbonserver.api.controller;

import com.drakezzz.ribbonserver.api.dto.Guest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/clients")
public class ClientController {

    @Value("${guest.name}")
    private String guestName;

    @GetMapping("/guest")
    public Guest getGuestClient() {
        Guest guest = new Guest();
        guest.setName(guestName);
        guest.setOccupation("Farmer");
        return guest;
    }

}
