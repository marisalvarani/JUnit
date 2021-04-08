package com.marianageneration.junit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marianageneration.junit.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{

}
