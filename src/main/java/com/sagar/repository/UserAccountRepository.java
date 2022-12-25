package com.sagar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.entity.UserAccountEntity;

public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Integer> {

}
