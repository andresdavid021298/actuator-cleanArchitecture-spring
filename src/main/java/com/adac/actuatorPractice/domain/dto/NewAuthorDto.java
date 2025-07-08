package com.adac.actuatorPractice.domain.dto;

import java.time.LocalDate;

public class NewAuthorDto {

	private String name;
	private String country;
	private LocalDate birthdate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Name: " + name + " - Country: " + country + " - Birthdate: " + birthdate;
	}

}
