package com.codeclan.courseservices.repositories;

import com.codeclan.courseservices.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
