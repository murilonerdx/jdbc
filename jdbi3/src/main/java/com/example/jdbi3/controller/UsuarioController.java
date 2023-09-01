package com.example.jdbi3.controller;



import com.example.jdbi3.entity.Usuario;
import com.example.jdbi3.services.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * REST controller for managing {@link Usuario}.
 *
 * @usuario @aek
 */
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final Logger log = LoggerFactory.getLogger(UsuarioController.class);
    private final UsuarioService entityService;

    public UsuarioController (UsuarioService entityService) {
        this.entityService = entityService;
    }


    /**
     * {@code POST  /usuario} : Create a new usuario.
     *
     * @param usuario the usuario to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new usuario.
     */
    @PostMapping()
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        log.debug("REST request to save Usuario : {}", usuario);
        return new ResponseEntity<>(entityService.create(usuario), HttpStatus.CREATED);
    }

    /**
     * {@code GET  /usuario} : get all the usuarios.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of usuario in body.
     */

    @GetMapping()
    public ResponseEntity<List<Usuario>> getAllUsuario() {
        log.debug("REST request to get all usuarios");
        List<Usuario> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /usuario/:id} : get the "id" usuario.
     *
     * @param id the id of the usuario to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the usuario, or with status {@code 404 (Not Found)}.
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> getOneUsuario(@PathVariable("id") Long id) {
        log.debug("REST request to get Usuario : {}", id);
        Usuario e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

}
