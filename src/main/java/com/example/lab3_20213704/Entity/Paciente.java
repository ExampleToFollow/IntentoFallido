package com.example.lab3_20213704.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "edad")
    private int edad;
    @Column(name = "genero")
    private String genero;
    @Column(name = "diagnostico")
    private String diagnostico;
    @Column(name = "fecha_cita")
    private String fecha_cita;
    @Column(name = "numero_habitacion")
    private String numero_habitacion;
    @ManyToOne
    @JoinColumn(name = "oftalmologo_id")
    private Oftalmologo oftalmologo;
    @ManyToOne
    @JoinColumn(name="clinica_id")
    private Clinica clinica;
}
