package com.example.jdbi3.services;

import com.example.jdbi3.entity.Usuario;
import com.example.jdbi3.repository.UsuarioRepository;
import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(Jdbi jdbi) {
        this.repository = jdbi.onDemand(UsuarioRepository.class);
    }

    public Usuario create(Usuario author) {
        return getOne(repository.insert(author));
    }

    public List<Usuario> getAll(){
        return repository.findAll();
    }

    public Usuario getOne(long id) {
        return repository.findById(id);
    }

    public int deleteById(long id) {
        return repository.deleteById(id);
    }
}
