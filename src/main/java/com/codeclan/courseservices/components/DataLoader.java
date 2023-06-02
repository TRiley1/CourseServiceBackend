package com.codeclan.courseservices.components;

import com.codeclan.courseservices.models.Booking;
import com.codeclan.courseservices.models.Course;
import com.codeclan.courseservices.models.Customer;
import com.codeclan.courseservices.repositories.BookingRepository;
import com.codeclan.courseservices.repositories.CourseRepository;
import com.codeclan.courseservices.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


    @Profile("!test") //Run every time EXCEPT Tests
    @Component
    public class DataLoader implements ApplicationRunner {

        @Autowired
        CustomerRepository customerRepository ;

        @Autowired
        BookingRepository bookingRepository;

        @Autowired
        CourseRepository courseRepository;

        public DataLoader() {

        }

        public void run(ApplicationArguments args) {
            Customer customer1 = new Customer("Hank Hill","Arling", 45);
            customerRepository.save(customer1);

            Customer customer2 = new Customer("Peggy Hill","Arling", 42);
            customerRepository.save(customer2);

            Customer customer3 = new Customer("Bobby Hill","Arling", 15);
            customerRepository.save(customer3);

            Customer customer4 = new Customer("Boomhauer","Arling", 40);
            customerRepository.save(customer4);

            Course course1 = new Course("Advanced Propane Sales","Arling", 1);
            courseRepository.save(course1);

            Course course2 = new Course("Teaching","Arling", 5);
            courseRepository.save(course2);

            Course course3 = new Course("Self-Defence","Arling", 4);
            courseRepository.save(course3);

            Booking booking1 = new Booking("12/2/4",customer1,course1);
            bookingRepository.save(booking1);
            Booking booking2 = new Booking("14/2/4",customer2,course2);
            bookingRepository.save(booking2);
            Booking booking3 = new Booking("16/2/4",customer3,course3);
            bookingRepository.save(booking3);

        }
    }