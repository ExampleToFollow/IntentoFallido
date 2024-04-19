package com.example.lab3_20213704.Repository;

import com.example.lab3_20213704.Entity.Clinica;
import com.example.lab3_20213704.Entity.Oftalmologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OftalmologoRepository extends JpaRepository<Oftalmologo,Integer> {

}
