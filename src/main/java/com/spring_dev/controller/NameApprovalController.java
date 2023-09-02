package com.spring_dev.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring_dev.model.ErrorResponse;
import com.spring_dev.model.NameRequest;
import com.spring_dev.model.ValidationResponse;



@RestController
public class NameApprovalController {
	
	@PostMapping("/PFM")
    public ResponseEntity<?> validateName(@RequestBody NameRequest nameRequest) {
		// Exception handling (if any...)
		    try {
		        String name = nameRequest.getName();

		        // Condition to check if name contain any number
		        if (name.matches(".*\\d+.*")) {
		            // Invalid name: Contains a number
		            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
		                    .body(new ErrorResponse("Please enter a valid name", "0"));
		        } else {
		            // Valid name: Does not contain a number
		            return ResponseEntity.ok(new ValidationResponse("Hello " + name, "1"));
		        }
		    } catch (Exception e) {
		        // Handle exceptions and return an internal server error response
		        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
		                .body(new ErrorResponse("Something went wrong", "0"));
		    }
		}


}






