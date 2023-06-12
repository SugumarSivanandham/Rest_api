package com.example.demo.service;

import com.example.demo.model.loginModel;
import com.example.demo.repository.loginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class loginService {

    private final loginRepository loginRepository;

    @Autowired
    public loginService(loginRepository loginModelRepository) {
        this.loginRepository = loginModelRepository;
    }

    public List<loginModel> getAllLoginModels() {
        return loginRepository.findAll();
    }

    public Optional<loginModel> getLoginModelByFirstName(String firstName) {
        return loginRepository.findById(firstName);
    }

    public loginModel createLoginModel(loginModel loginModel) {
        return loginRepository.save(loginModel);
    }

    public void updateLoginModel(String firstName, loginModel updatedLoginModel) {
        Optional<loginModel> existingLoginModel = loginRepository.findById(firstName);
        existingLoginModel.ifPresent(login -> {
            login.setFirstname(updatedLoginModel.getFirstname());
            login.setLastname(updatedLoginModel.getLastname());
            login.setPassword(updatedLoginModel.getPassword());
            login.setEmailid(updatedLoginModel.getEmailid());
            login.setConfirmpassword(updatedLoginModel.getConfirmpassword());
            loginRepository.save(login);
        });
    }

    public void deleteLoginModel(String firstName) {
        loginRepository.deleteById(firstName);
    }
}
