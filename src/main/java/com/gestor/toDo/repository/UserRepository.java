package com.gestor.toDo.repository;

import com.gestor.toDo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Integer> {
}
