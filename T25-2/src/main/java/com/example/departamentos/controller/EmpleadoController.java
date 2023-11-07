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

import com.example.departamentos.dto.Empleado;
import com.example.departamentos.services.EmpleadoServiceImpl;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	@Autowired
	private EmpleadoServiceImpl empleadoServiceImpl;

    @GetMapping("/all")
    public List<Empleado> getEmpleado() {
        return empleadoServiceImpl.listarEmpleados();
    }

    @GetMapping("/{id}")
	public Empleado EmpleadoXID(@PathVariable(name="id") String id) {
    	Empleado Empleado_xid= new Empleado();
    	Empleado_xid=empleadoServiceImpl.obtenerEmpleadoPorId(id);
		System.out.println("Empleado XID: "+Empleado_xid);
		return Empleado_xid;
	}
    @PostMapping("/add")
	public Empleado salvarEmpleado(@RequestBody Empleado Empleado) {
		return empleadoServiceImpl.guardarEmpleado(Empleado);
	}

    @PutMapping("/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id")String id,@RequestBody Empleado Empleado) {
    	Empleado Empleado_seleccionado= new Empleado();
		
    	Empleado_seleccionado= empleadoServiceImpl.obtenerEmpleadoPorId(id);
		
    	Empleado_seleccionado.setNombre(Empleado.getNombre());
    	Empleado_seleccionado.setApellidos(Empleado.getApellidos());
		
    	Empleado_seleccionado = empleadoServiceImpl.actualizarEmpleado(Empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ Empleado_seleccionado);
		
		return Empleado_seleccionado;
    }

    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable String id) {
    	empleadoServiceImpl.eliminarEmpleado(id);
		System.out.println("Empleado eliminado");
    }
}
