package com.egg.bibliotecaV2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egg.bibliotecaV2.entidades.Imagen;

@Repository
public interface ImagenRepositorio extends JpaRepository<Imagen,String>{
    
}