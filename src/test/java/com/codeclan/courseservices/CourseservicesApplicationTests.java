package com.codeclan.courseservices;

import com.codeclan.courseservices.models.Booking;
import com.codeclan.courseservices.models.Course;
import com.codeclan.courseservices.models.Customer;
import com.codeclan.courseservices.repositories.BookingRepository;
import com.codeclan.courseservices.repositories.CourseRepository;
import com.codeclan.courseservices.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseservicesApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void canAddCustomer(){
		Customer customer = new Customer("Hank Hill","Arling", 45);
		customerRepository.save(customer);
	}

	@Test
	void canAddCourse(){
		Course course = new Course("Advanced Propane Sales", "Arlen", 5);
		courseRepository.save(course);
	}

	@Test
	void canAddBooking(){
		Customer customer = new Customer("Hank Hill","Arling", 45);
		customerRepository.save(customer);
		Course course = new Course("Advanced Propane Sales", "Arlen", 5);
		courseRepository.save(course);
		Booking booking = new Booking("yesterday",customer, course);
		bookingRepository.save(booking);
	}

}
