package com.example.departamentos.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {
	@Id
	@Column(name = "dni")
	private String id;
	private String nombre;
	private String apellidos;
	
	@ManyToOne
	@JoinColumn(name = "departamento")
	private Departamento departamento;

	public Empleado() {
	}

	public Empleado(String id, String nombre, String apellidos, Departamento departamento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamento="
				+ departamento + "]";
	}
	
	
	

}
