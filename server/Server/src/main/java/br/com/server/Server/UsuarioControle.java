package br.com.server.Server;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;



@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UsuarioControle{

    @Autowired
    private IUsuario dao; //isso estende toda a classe para essa variavel 

    @GetMapping
    public List<Usuario> listaUsuarios() {
        return (List<Usuario>) dao.findAll(); //mostra todos os usuarios do banco 
    }
    
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario user) {
        Usuario newUser = dao.save(user);
        return newUser;
    }

    @PutMapping
    public Usuario editarUsuario(@RequestBody Usuario user) {
        Usuario newUser = dao.save(user);
        return newUser;
    }

    @DeleteMapping("/{ID_user}")
    public Optional<Usuario> deleteUsuario(@PathVariable Integer ID_user) {
        Optional<Usuario> User = dao.findById(ID_user);
        dao.deleteById(ID_user);
        return User;
    }

    @PostMapping("/login")
    public Optional<Usuario> authenticateUser(@RequestBody Usuario user) {
        Optional<Usuario> authenticatedUser = dao.authenticatedUser(user.getEmail(), user.getPassword());
        return authenticatedUser;
    }
    
}
    

