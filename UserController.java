
package com.example.fitnessplatform;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        // Simple logic (you can integrate with a database)
        return "User " + username + " registered successfully!";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password) {
        return "Welcome, " + username;
    }
}

