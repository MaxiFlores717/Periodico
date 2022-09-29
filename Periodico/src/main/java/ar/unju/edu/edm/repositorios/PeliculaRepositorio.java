package ar.unju.edu.edm.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import ar.unju.edu.edm.modelo.Noticia;


public interface PeliculaRepositorio extends JpaRepository<Noticia, Integer>{

}
