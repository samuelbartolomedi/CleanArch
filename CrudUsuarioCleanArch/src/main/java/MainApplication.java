import Entities.Usuario;
import Infrastructures.UsuarioMemoryRepository;
import Interfaces.UsuarioController;
import Repositories.UsuarioRepository;
import UseCases.AdicionaUsuario;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        UsuarioRepository repository = new UsuarioMemoryRepository();
        AdicionaUsuario adicionaUsuario = new AdicionaUsuario(repository);
        UsuarioController usuarioController = new UsuarioController(adicionaUsuario);

        usuarioController.criaUsuario(1L, "Bruce Wayne", "bruce_wayne@hotmail.com");
        usuarioController.criaUsuario(2L, "Kung Lao", "kung_lao@hotmail.com");
        usuarioController.criaUsuario(3L, "Liu Kang", "liu_kang@hotmail.com");

        List<Usuario> usuarios = repository.listaTodosUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId());
            System.out.println("Name: " + usuario.getNome());
            System.out.println("Email: "+ usuario.getEmail());

            System.out.println("____XXX____");
        }
    }
}
