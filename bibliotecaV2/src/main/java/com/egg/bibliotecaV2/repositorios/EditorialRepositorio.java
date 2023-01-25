
package com.egg.bibliotecaV2.repositorios;

import com.egg.bibliotecaV2.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial,String> {

}
