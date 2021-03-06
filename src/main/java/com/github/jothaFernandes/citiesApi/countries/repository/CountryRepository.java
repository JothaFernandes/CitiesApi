package com.github.jothaFernandes.citiesApi.countries.repository;

import com.github.jothaFernandes.citiesApi.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
