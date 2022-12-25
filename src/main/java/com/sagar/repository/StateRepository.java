package com.sagar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.entity.StateMasterEntity;

public interface StateRepository extends JpaRepository<StateMasterEntity, Integer> {

}
