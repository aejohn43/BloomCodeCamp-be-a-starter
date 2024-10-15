package com.hcc.controllers;


import com.hcc.entities.Assignment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {

    // Get assignments by user
    @GetMapping
    public ResponseEntity<List<Assignment>> getAssignmentsByUser(@RequestParam Long userId) {
        // Logic to retrieve assignments for the specified user
    }

    // Get assignment by ID
    @GetMapping("/{id}")
    public ResponseEntity<Assignment> getAssignmentById(@PathVariable Long id) {
        // Logic to retrieve an assignment by its ID
    }

    // Put assignment by ID
    @PutMapping("/{id}")
    public ResponseEntity<Assignment> updateAssignmentById(@PathVariable Long id, @RequestBody Assignment assignment) {
        // Logic to update an assignment by its ID
    }

    // Post assignment
    @PostMapping
    public ResponseEntity<Assignment> createAssignment(@RequestBody Assignment assignment) {
        // Logic to create a new assignment
    }
}