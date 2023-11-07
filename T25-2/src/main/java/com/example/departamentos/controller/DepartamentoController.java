package com.example.departamentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.departamentos.dto.Departamento;
import com.example.departamentos.services.DepartamentoServiceImpl;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
	@Autowired
	private DepartamentoServiceImpl departamentoServiceImpl;
	@GetMapping("/all")
    public List<Departamento> getDepartamento() {
        return departamentoServiceImpl.listarDepartamentos();
    }

    @GetMapping("/{id}")
	public Departamento departamentoXID(@PathVariable(name="id") Integer id) {
    	Departamento departamento_xid= new Departamento();
		departamento_xid=departamentoServiceImpl.obtenerDepartamentoPorId(id);
		System.out.println("departamento XID: "+departamento_xid);
		return departamento_xid;
	}
    @PostMapping("/add")
	public Departamento salvardepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}

    @PutMapping("/{id}")
	public Departamento actualizardepartamento(@PathVariable(name="id")Integer id,@RequestBody Departamento departamento) {
    	Departamento departamento_seleccionado= new Departamento();
    	Departamento departamento_actualizado= new Departamento();
		
		departamento_seleccionado= departamentoServiceImpl.obtenerDepartamentoPorId(id);
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		departamento_seleccionado.setEmpleado(departamento.getEmpleado());

		departamento_actualizado = departamentoServiceImpl.actualizarDepartamento(departamento_seleccionado);
		
		System.out.println("El departamento actualizado es: "+ departamento_actualizado);
		
		return departamento_actualizado;
    }

    @DeleteMapping("/{id}")
    public void eliminardepartamento(@PathVariable int id) {
    	departamentoServiceImpl.eliminarDepartamento(id);
		System.out.println("Departamento eliminado");

    }
}
