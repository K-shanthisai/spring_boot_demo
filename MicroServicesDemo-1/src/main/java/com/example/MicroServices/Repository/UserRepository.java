package com.example.MicroServices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MicroServices.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
