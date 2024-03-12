package com.example.pruebasdocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    PersonaRepository repository;

    @Autowired
    public PersonaService(PersonaRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<Persona> crearPersona(Persona persona) {
        return ResponseEntity.ok(repository.save(persona));
    }

    public ResponseEntity<List<Persona>> getAllPersonas() {
        return ResponseEntity.ok(repository.findAll());
    }
}
