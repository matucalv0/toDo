package com.gestor.toDo.service;

import com.gestor.toDo.dtto.TareaDTO;
import com.gestor.toDo.entity.Tarea;
import com.gestor.toDo.entity.Usuario;
import com.gestor.toDo.repository.TareaRepository;
import com.gestor.toDo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {
    private final TareaRepository tareaRepo;
    private final UserRepository userRepo;

    public TareaService(TareaRepository tareaRepo, UserRepository userRepo){
        this.tareaRepo = tareaRepo;
        this.userRepo = userRepo;

    }

    public List<Tarea> mostrarTareas(){
        return tareaRepo.findAll();
    }

    public void agregarTarea(TareaDTO tarea, Integer dni){
       Usuario usuario = userRepo.findById(dni).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));  //busco el usuario

       Tarea nueva_tarea = new Tarea();     //si existe el usuario, creo la tarea nueva
       nueva_tarea.setTitulo(tarea.getTitulo());  //asigno el titulo de lo que ingreso el cliente, es decir lo que está en el DTO
       nueva_tarea.setUsuario(usuario);  //asigno el usuario que se encontró por dni
       tareaRepo.save(nueva_tarea);    //persisto la tarea
    }

    public void eliminarTarea(Long id){
        tareaRepo.deleteById(id);
    }

    public List<String> tareasConIdMayorA1(){
        return tareaRepo.getTareasIdMayorA1();
    }

    public List<Tarea> mostrarTareasSegunUsuario(Integer dni){
        return tareaRepo.tareasSegunUsuario(dni);
    }

    public void completarTarea(Long id) {
        Tarea tarea = tareaRepo.findById(id).orElseThrow(() -> new RuntimeException("Tarea no encontrada"));
        tarea.setEstado(true);
        tareaRepo.save(tarea);
    }
}
