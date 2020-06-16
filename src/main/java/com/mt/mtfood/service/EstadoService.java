package com.mt.mtfood.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mt.mtfood.domain.model.Estado;
import com.mt.mtfood.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repository;
	
	public Optional<Estado> buscarPorId(Long id){
		 Optional<Estado> estado = repository.findById(id);
		 
		 return estado;
	}
}
