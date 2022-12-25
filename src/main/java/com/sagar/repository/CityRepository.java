package com.sagar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.entity.CityMasterEntity;

public interface CityRepository extends JpaRepository<CityMasterEntity, Integer> {

}
