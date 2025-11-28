package com.gestor.toDo.dtto;


import com.gestor.toDo.entity.Usuario;

public class TareaDTO {
    private Long id;
    private String titulo;
    private boolean completada = false;
    private Usuario usuario;

    public Long getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
