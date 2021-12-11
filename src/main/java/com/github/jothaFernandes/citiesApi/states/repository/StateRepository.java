package com.github.jothaFernandes.citiesApi.states.repository;

import com.github.jothaFernandes.citiesApi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {

}
