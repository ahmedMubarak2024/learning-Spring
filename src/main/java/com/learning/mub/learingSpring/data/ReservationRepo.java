package com.learning.mub.learingSpring.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {

    Reservation findReservationByResDate(Date date);
}
