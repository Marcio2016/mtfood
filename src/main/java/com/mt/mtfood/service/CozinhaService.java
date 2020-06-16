package com.mt.mtfood.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mt.mtfood.domain.model.Cozinha;
import com.mt.mtfood.repository.CozinhaRepository;

@Service
public class CozinhaService {

	@Autowired
	private CozinhaRepository repository;
	
	public Optional<Cozinha> buscarPorId(Long id) {
		Optional<Cozinha> cozinha = repository.findById(id);
		return cozinha;		
	}
}
