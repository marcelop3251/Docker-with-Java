package com.invillia.dockerjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invillia.dockerjava.entity.Usuario;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Long> {

}
