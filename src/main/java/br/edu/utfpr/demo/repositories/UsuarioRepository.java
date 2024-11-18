package br.edu.utfpr.demo.repositories;

import br.edu.utfpr.demo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}