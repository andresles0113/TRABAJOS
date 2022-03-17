package com.andreslesmesfull.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andreslesmesfull.app.entity.User;

@Repository 

public interface UserReposotory extends JpaRepository<User, Long> {

}
