package Repositories;

import Entities.Usuario;

import java.util.List;

public interface UsuarioRepository {
    public void adicionaUsuario(Usuario usuario);

    List<Usuario> listaTodosUsuarios();
}
