package com.services.dependenciesexplorer.repository;

import com.services.dependenciesexplorer.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface ApplicationRepository extends JpaRepository<Application, Long> {
}