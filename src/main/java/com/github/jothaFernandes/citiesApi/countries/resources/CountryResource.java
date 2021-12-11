package com.github.jothaFernandes.citiesApi.countries.resources;

import java.util.List;
import java.util.Optional;

import com.github.jothaFernandes.citiesApi.countries.entity.Country;
import com.github.jothaFernandes.citiesApi.countries.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryResource {

    private final CountryRepository countryRepository;

    public CountryResource(final CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping("/countries")
    public List<Country> countries(){
        return countryRepository.findAll();
    }

    @GetMapping("/countries/{id}")
    public Country countryId(@PathVariable Long id) {
        Optional<Country> optional = countryRepository.findById(id);
        return optional.get();
    }
}
