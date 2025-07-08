package com.adac.actuatorPractice.infrastructure.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AUTHOR")
public class AuthorEntity {

	private Integer id;
	private String name;
	private String country;
	private LocalDate birthdate;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "COUNTRY")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "BIRTHDATE")
	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

//	CREATE TABLE author (
//			id numeric DEFAULT nextval('"LIBRARY_TOP".id_author_seq'::regclass) NOT NULL,
//			"name" varchar NOT NULL,
//			birthdate date NULL,
//			country varchar NULL,
//			CONSTRAINT author_pk PRIMARY KEY (id),
//			CONSTRAINT name_author_unique UNIQUE (name)
//		);

}
