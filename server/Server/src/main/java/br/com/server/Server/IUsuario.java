package br.com.server.Server; 

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.Optional;

public interface IUsuario extends CrudRepository<Usuario, Integer>{
    


    @Query("SELECT u FROM Usuario u WHERE u.Email = :email")
    Optional<Usuario> findByEmail(@Param("email") String email);

    @Query("SELECT u FROM Usuario u WHERE u.Email = :email AND u.Password = :password")
    Optional<Usuario> authenticatedUser(@Param("email") String email, @Param("password") String password);

}