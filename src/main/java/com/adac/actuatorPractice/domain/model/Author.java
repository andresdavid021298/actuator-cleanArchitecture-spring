package com.adac.actuatorPractice.domain.model;

import java.time.LocalDate;

public record Author(Integer id, String name, String country, LocalDate birthdate) {

}
