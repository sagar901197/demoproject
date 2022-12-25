package com.sagar.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "USER_ACCOUNT")
@Data
public class UserAccountEntity {

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "FIRST_NAEM")
	private String name;

	@Column(name = "LAST_NAME")
	private String lname;

	@Column(name = "USER_EMAIL", unique = true)
	private String email;

	@Column(name = "USER_PWD")
	private String password;

	@Column(name = "USER_MOMBILE")
	private Long phno;

	@Column(name = "DOB")
	private LocalDate dob;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "CITY_ID")
	private Integer cityId;

	@Column(name = "STATE_ID")
	private Integer stateId;

	@Column(name = "COUNTRY_ID")
	private Integer countryId;

	@Column(name = "ACC_STATUS")
	private String accStatus;

	@Column(name = "CREATE_DATE", updatable = false)
	@CreationTimestamp
	private LocalDate createDate;

	@Column(name = "UPDATE_DATE", insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;

}
