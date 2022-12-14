package com.example.springproyect.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springproyect.app.modelo.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
