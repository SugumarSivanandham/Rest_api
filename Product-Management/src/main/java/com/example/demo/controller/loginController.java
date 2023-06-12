package com.example.demo.controller;

import com.example.demo.model.loginModel;
import com.example.demo.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/login")
public class loginController {

    private final loginService loginService;

    @Autowired
    public loginController(loginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping
    public ResponseEntity<List<loginModel>> getAllLoginModels() {
        List<loginModel> loginModels = loginService.getAllLoginModels();
        return new ResponseEntity<>(loginModels, HttpStatus.OK);
    }

    @GetMapping("/{firstName}")
    public ResponseEntity<loginModel> getLoginModelByFirstName(@PathVariable("firstName") String firstName) {
        Optional<loginModel> loginModel = loginService.getLoginModelByFirstName(firstName);
        return loginModel.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/post")
    public ResponseEntity<loginModel> createLoginModel(@RequestBody loginModel loginModel) {
        loginModel createdLoginModel = loginService.createLoginModel(loginModel);
        return new ResponseEntity<>(createdLoginModel, HttpStatus.CREATED);
    }

    @PutMapping("/{firstName}")
    public ResponseEntity<Void> updateLoginModel(@PathVariable("firstName") String firstName, @RequestBody loginModel loginModel) {
        loginService.updateLoginModel(firstName, loginModel);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{firstName}")
    public ResponseEntity<Void> deleteLoginModel(@PathVariable("firstName") String firstName) {
        loginService.deleteLoginModel(firstName);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
