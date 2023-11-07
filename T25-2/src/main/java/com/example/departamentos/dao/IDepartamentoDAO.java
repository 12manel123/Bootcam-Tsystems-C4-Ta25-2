package com.example.departamentos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.departamentos.dto.Departamento;

public interface IDepartamentoDAO extends JpaRepository<Departamento,Integer>{

}
