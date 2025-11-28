package com.gestor.toDo.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Entity
public class Usuario {
    @Id
    @Column(nullable = false)
    private Integer dni;
    @Column(nullable = false)
    private String nombre;
    private String email;
    @OneToMany(mappedBy = "usuario")
    @JsonManagedReference
    private List<Tarea> tareas;

    public Usuario(){}

    public Usuario(Integer dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}
