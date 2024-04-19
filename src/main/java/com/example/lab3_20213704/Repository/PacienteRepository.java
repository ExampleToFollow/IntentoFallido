package com.example.lab3_20213704.Repository;


import com.example.lab3_20213704.Entity.Clinica;
import com.example.lab3_20213704.Entity.Oftalmologo;
import com.example.lab3_20213704.Entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Integer> {


}
