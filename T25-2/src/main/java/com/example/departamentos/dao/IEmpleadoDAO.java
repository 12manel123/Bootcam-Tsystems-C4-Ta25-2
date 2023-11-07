package com.example.departamentos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.departamentos.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado,String>{

}
