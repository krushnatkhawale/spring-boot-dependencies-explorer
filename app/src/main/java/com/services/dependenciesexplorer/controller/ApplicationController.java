package com.services.dependenciesexplorer.controller;

import com.services.dependenciesexplorer.model.Application;
import com.services.dependenciesexplorer.repository.ApplicationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ApplicationController {

    ApplicationRepository applicationRepository;

    public ApplicationController(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @GetMapping("/dependencies")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Application> getDependencies() {
        return applicationRepository.findAll();
    }

    @PostMapping("/dependencies")
    public Application postDependencies(@RequestBody Application application) {
        return applicationRepository.save(application);
    }
}