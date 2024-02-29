package com.bitwise.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitwise.blog.entities.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

}
