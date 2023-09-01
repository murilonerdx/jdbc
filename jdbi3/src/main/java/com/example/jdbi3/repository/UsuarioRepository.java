package com.example.jdbi3.repository;

import com.example.jdbi3.entity.Usuario;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.transaction.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RegisterBeanMapper(Usuario.class)
public interface UsuarioRepository {
    @SqlQuery("select * from usuarios;")
    List<Usuario> findAll();

    @SqlQuery("select * from usuarios where id = :id;")
    Usuario findById(@Bind("id") long id);

    @Transaction
    @SqlUpdate("delete from usuarios where id = :id;")
    int deleteById(@Bind("id") long id);

    @Transaction
    @SqlUpdate("update usuarios set nome = :nome, email=:email where id = :id;")
    int update(@BindBean Usuario usuario);

    @Transaction
    @GetGeneratedKeys
    @SqlUpdate("insert into usuarios (nome, email) values (:nome, :email);")
    int insert(@BindBean Usuario usuario);
}
