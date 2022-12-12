/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.equipo1.restapi.controller;

import java.util.List;
import org.equipo1.restapi.repository.Usuario;
import org.equipo1.restapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author odraude
 */
@RestController
@RequestMapping("/usr")
public class UsuarioController {
    @Autowired
    UsuarioRepository repo;
    
    @GetMapping()
    public List<Usuario> getUsuarios(){
        return repo.findAll();
    }
    
    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable int id){
        return repo.findById(id).get();
    }
    
    @PostMapping()
    public Usuario guardarUsuario(@RequestBody Usuario usr){
        return repo.save(usr);
    }
    
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable int id){
        repo.deleteById(id);
    }
    
    @PutMapping()
    public Usuario actulizarUsuario(@RequestBody Usuario usr){
        return repo.save(usr);
    }
    
}
