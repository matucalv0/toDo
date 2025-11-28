package com.gestor.toDo.dtto;

import com.gestor.toDo.entity.Tarea;


import java.util.List;

public class UsuarioDTO {
    private Integer dni;
    private String nombre;
    private String email;
    private List<Tarea> tareas;

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

}
