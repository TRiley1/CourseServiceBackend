package com.codeclan.courseservices.repositories;

import com.codeclan.courseservices.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByBookingsCourseName (String course);
}
