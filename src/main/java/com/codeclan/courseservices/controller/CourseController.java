package com.codeclan.courseservices.controller;

import com.codeclan.courseservices.models.Course;
import com.codeclan.courseservices.models.Customer;
import com.codeclan.courseservices.repositories.CourseRepository;
import com.codeclan.courseservices.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


    @RestController
    public class CourseController {

        @Autowired
        CourseRepository courseRepository;

        @GetMapping(value = "/courses")
        public ResponseEntity<List<Course>> getCoursesByRating(
                @RequestParam(name = "rating", required = false) Integer rating
        ){
            if (rating != null){
            return new ResponseEntity<>(courseRepository.findByRating(rating),HttpStatus.OK);
        }
            return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }
    }
