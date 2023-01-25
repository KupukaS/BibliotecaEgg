
package com.egg.bibliotecaV2.repositorios;

import com.egg.bibliotecaV2.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, String> {

}
