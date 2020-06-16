package com.mt.mtfood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mt.mtfood.domain.model.Estado;
import com.mt.mtfood.repository.EstadoRepository;
import com.mt.mtfood.service.EstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoController {

	@Autowired
	private EstadoRepository repository;
	
	@Autowired
	private EstadoService service;
	
	@GetMapping
	public List<Estado> listar(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Estado> buscarPorId(@PathVariable Long id){
		Optional<Estado> estado = service.buscarPorId(id);
		
		return estado.isPresent() ?
				ResponseEntity.ok(estado.get()) : ResponseEntity.notFound().build();
	}
}
