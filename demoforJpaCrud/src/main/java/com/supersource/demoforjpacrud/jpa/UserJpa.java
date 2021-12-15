package com.supersource.demoforjpacrud.jpa;

import com.supersource.demoforjpacrud.entity.User_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import java.io.Serializable;

public interface UserJpa extends JpaRepository<User_Entity,Long> , JpaSpecificationExecutor<User_Entity>, Serializable {
}
