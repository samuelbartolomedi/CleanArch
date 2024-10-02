package UseCases;

import Entities.Usuario;
import Repositories.UsuarioRepository;

public class AdicionaUsuario {
    private final UsuarioRepository usuarioRepo;

    public AdicionaUsuario(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public void adiciona(Usuario usuario) {
        if (usuario.getNome().isBlank() || usuario.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome é obrigatório!");
        }
        if (usuario.getEmail().isBlank() || usuario.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email é obrigatório!");
        }
        usuarioRepo.adicionaUsuario(usuario);
    }
}
