package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="usuarios")
public class UsuarioDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = null;
    private String nome;
    private String email;
}
