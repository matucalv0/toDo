package com.gestor.toDo.repository;

import com.gestor.toDo.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
    @Query("SELECT t.titulo FROM Tarea t WHERE t.id > 1")
    List<String> getTareasIdMayorA1();
    @Query(value = "SELECT * FROM Tarea WHERE usuario_dni = :dni", nativeQuery = true)
    List<Tarea> tareasSegunUsuario(@Param("dni") Integer dni);




}
