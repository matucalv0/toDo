package com.gestor.toDo.controller;


import com.gestor.toDo.dtto.TareaDTO;
import com.gestor.toDo.entity.Tarea;
import com.gestor.toDo.service.TareaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {
    private final TareaService service;

    public TareaController(TareaService service){
        this.service = service;
    }

    @GetMapping
    public List<Tarea> mostrarTareas(){
        return service.mostrarTareas();
    }

    @GetMapping("/idmayora1")
    public List<String> tareasmayor(){
        return service.tareasConIdMayorA1();
    }

    @PostMapping("/{dni}")
    public void agregarTarea(@RequestBody TareaDTO tarea, @PathVariable Integer dni){
        service.agregarTarea(tarea, dni);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id){
        service.eliminarTarea(id);
    }


    @GetMapping("/{id}")
    public List<Tarea> obtenerTareasSegunId(@PathVariable Integer id){
        return service.mostrarTareasSegunUsuario(id);
    }

    @PatchMapping("/{id}/completar")
    public void completarTarea(@PathVariable Long id){

    }





}
