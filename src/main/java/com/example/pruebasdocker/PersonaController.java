package com.example.pruebasdocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    PersonaService service;

    @Autowired
    public PersonaController(PersonaService service) {
        this.service = service;
    }
    
    @PostMapping
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona) {
        return service.crearPersona(persona);
    }

    @GetMapping
    public ResponseEntity<List<Persona>> getAllPersonas() {
        return service.getAllPersonas();
    }
}
