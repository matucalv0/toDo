package com.gestor.toDo.controller;

import com.gestor.toDo.dtto.UsuarioDTO;
import com.gestor.toDo.entity.Tarea;
import com.gestor.toDo.entity.Usuario;
import com.gestor.toDo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @GetMapping
    public List<Usuario> mostrarUsuarios(){
        return service.mostrarUsuarios();
    }

    @PostMapping
    public void agregarUsuario(@RequestBody UsuarioDTO user){
        service.agregarUsuario(user);
    }








}
