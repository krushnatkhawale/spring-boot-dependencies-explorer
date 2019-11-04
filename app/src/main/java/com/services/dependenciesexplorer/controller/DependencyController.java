package com.services.dependenciesexplorer.controller;

import com.services.dependenciesexplorer.model.Application;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ViewController {


    @GetMapping("/visualization")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Application> getDependencies(@RequestParam String viewType) {
        List<Application> applications = new ArrayList<>();
       /* List<Dependency> libraries = applications
                .stream()
                .flatMap(app -> app.getDependencies().stream())
                .distinct()
                .collect(toList());*/
        return applications;
    }
}
