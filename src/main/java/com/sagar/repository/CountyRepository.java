package com.sagar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.entity.CountryMasterEntity;

public interface CountyRepository extends JpaRepository<CountryMasterEntity, Integer> {

}
