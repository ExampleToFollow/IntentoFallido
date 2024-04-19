package com.example.lab3_20213704.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="oftalmologo")
public class Oftalmologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    //Consideramos el caso de beans como atributo
    @ManyToOne
    @JoinColumn(name="clinica_id")
    private Clinica clinica;
}
