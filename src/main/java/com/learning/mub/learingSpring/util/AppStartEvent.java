package com.learning.mub.learingSpring.util;

import com.learning.mub.learingSpring.data.GuestRepo;
import com.learning.mub.learingSpring.data.ReservationRepo;
import com.learning.mub.learingSpring.data.RoomRepo;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartEvent implements ApplicationListener<ApplicationReadyEvent> {
    private final RoomRepo roomRepo;
    private final GuestRepo guestRepo;
    private final ReservationRepo reservationRepo;

    public AppStartEvent(RoomRepo roomRepo, GuestRepo guestRepo, ReservationRepo reservationRepo) {
        this.roomRepo = roomRepo;
        this.guestRepo = guestRepo;
        this.reservationRepo = reservationRepo;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {

        roomRepo.findAll().forEach(System.out::println);
        guestRepo.findAll().forEach(System.out::println);
        reservationRepo.findAll().forEach(System.out::println);
    }
}
