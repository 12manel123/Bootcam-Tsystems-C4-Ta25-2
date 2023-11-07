package com.example.departamentos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.departamentos.dao.IDepartamentoDAO;
import com.example.departamentos.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{
	@Autowired
    private IDepartamentoDAO iDepartamentoDAO;

    @Override
    public List<Departamento> listarDepartamentos() {
        return iDepartamentoDAO.findAll();
    }

    @Override
    public Departamento obtenerDepartamentoPorId(Integer id) {
    	return iDepartamentoDAO.findById(id).get();
    }

    @Override
    public Departamento guardarDepartamento(Departamento Departamento) {
        return iDepartamentoDAO.save(Departamento);
    };


    @Override
    public Departamento actualizarDepartamento(Departamento Departamento) {
    	return iDepartamentoDAO.save(Departamento);
    }

    @Override
    public void eliminarDepartamento(Integer id) {
    	iDepartamentoDAO.deleteById(id);
    }
}
