package com.gestor.toDo.service;


import com.gestor.toDo.dtto.UsuarioDTO;
import com.gestor.toDo.entity.Tarea;
import com.gestor.toDo.entity.Usuario;
import com.gestor.toDo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserRepository repo;

    public UserService(UserRepository repo){
        this.repo = repo;
    }

    public List<Usuario> mostrarUsuarios(){
        return repo.findAll();
    }

    public void agregarUsuario(UsuarioDTO user){
        if (repo.existsById(user.getDni())){
            throw new RuntimeException("Usuario ya existente");
        }
        Usuario nuevo_usuario = new Usuario();
        nuevo_usuario.setDni(user.getDni());
        nuevo_usuario.setEmail(user.getEmail());
        nuevo_usuario.setNombre(user.getNombre());
        repo.save(nuevo_usuario);
    }

    public void eliminarUsuario(Integer id){
        repo.deleteById(id);
    }







}
