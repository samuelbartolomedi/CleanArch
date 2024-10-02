package Interfaces;

import Entities.Usuario;
import UseCases.AdicionaUsuario;

public class UsuarioController {
    private final AdicionaUsuario adicionaUsuario;

    public UsuarioController(AdicionaUsuario adicionaUsuario) {
        this.adicionaUsuario = adicionaUsuario;
    }

    public void criaUsuario(Long id, String nome, String email) {
        Usuario usuario = new Usuario(id, nome, email);
        adicionaUsuario.adiciona(usuario);
    }
}
