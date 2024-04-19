package com.example.lab3_20213704.Entity;

import jakarta.persistence.*;

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
    @JoinColumn(name = "oftalmologo_id")
    private int oftalmologo_id;
    @JoinColumn(name="clinica_id")
    private int clinica_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getNumero_habitacion() {
        return numero_habitacion;
    }

    public void setNumero_habitacion(String numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }

    public int getOftalmologo_id() {
        return oftalmologo_id;
    }

    public void setOftalmologo_id(int oftalmologo_id) {
        this.oftalmologo_id = oftalmologo_id;
    }

    public int getClinica_id() {
        return clinica_id;
    }

    public void setClinica_id(int clinica_id) {
        this.clinica_id = clinica_id;
    }
}
