package Infrastructures;

import Entities.Usuario;
import Repositories.UsuarioRepository;

import java.util.*;

public class UsuarioMemoryRepository implements UsuarioRepository {
    private Map<Long, Usuario> bancoUsuario = new HashMap() {
    };

    @Override
    public void adicionaUsuario(Usuario usuario) {
        bancoUsuario.put(usuario.getId(), usuario);
    }

    @Override
    public List<Usuario> listaTodosUsuarios() {
        return new ArrayList<>(bancoUsuario.values());
    }
}
