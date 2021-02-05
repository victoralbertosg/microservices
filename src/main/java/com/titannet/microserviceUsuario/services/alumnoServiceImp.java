package com.titannet.microserviceUsuario.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.titannet.microserviceUsuario.models.entity.Alumno;
import com.titannet.microserviceUsuario.models.repository.AlumnoRepository;

@Service
public class alumnoServiceImp implements AlumnoService {

	@Autowired
	private AlumnoRepository repository;
	@Override
	@Transactional (readOnly=true)
	public Iterable<Alumno> findAll() {
		return repository.findAll();
	}
	@Override
	public Optional<Alumno> findById(Long id) {
		return repository.findById(id);
	}
	@Override
	public Alumno save(Alumno alumno) {
		return repository.save(alumno);		
	}
	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);		
	}
}
