package com.springlab2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springlab2.demo.models.Trainee;

public interface TraineeDaoInterface extends JpaRepository<Trainee,Integer> {

}
