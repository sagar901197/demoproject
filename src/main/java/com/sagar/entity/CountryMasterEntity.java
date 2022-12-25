package com.sagar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "COUNTRY_MASTER")
@Data
public class CountryMasterEntity {

	@Id
	@Column(name = "COUNTRY_ID")
	private Integer contryId;

	@Column(name = "COUNTRY_NAME")
	private String countryName;

}
