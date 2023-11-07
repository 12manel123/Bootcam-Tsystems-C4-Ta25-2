package com.example.departamentos.services;

import java.util.List;

import com.example.departamentos.dto.Departamento;

public interface IDepartamentoService {
	//Listar todos
			public List<Departamento> listarDepartamentos();
			
			//Listar por id
			public Departamento obtenerDepartamentoPorId(Integer id);

		    // Guardar
		    public Departamento guardarDepartamento(Departamento Departamento);

		    // Actualizar
		    public Departamento actualizarDepartamento(Departamento Departamento);

		    // Eliminar
		    public void eliminarDepartamento(Integer id);
}
