package com.services.dependenciesexplorer.controller;

import com.services.dependenciesexplorer.model.Application;
import com.services.dependenciesexplorer.repository.ApplicationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ApplicationController {

    ApplicationRepository applicationRepository;

    public ApplicationController(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @GetMapping("/dependencies")
    public Collection<Application> getDependencies() {
        return applicationRepository.findAll();
    }

    @PostMapping("/dependencies")
    public Application postDependencies(@RequestBody Application application) {
        return applicationRepository.save(application);
    }
}