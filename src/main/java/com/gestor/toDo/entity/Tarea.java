package com.gestor.toDo.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


@Entity
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private boolean completada = false;
    @ManyToOne
    @JoinColumn(name = "usuario_dni")
    @JsonBackReference
    private Usuario usuario;

    public Tarea(){}

    public Tarea(String titulo){
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEstado(boolean completada) {
        this.completada = completada;
    }

    public Long getId(){
        return id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTitulo(){
        return titulo;
    }

    public boolean getEstado(){
        return completada;
    }


}
