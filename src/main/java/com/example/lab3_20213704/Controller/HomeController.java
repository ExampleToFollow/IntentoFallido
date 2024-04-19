package com.example.lab3_20213704.Controller;

import com.example.lab3_20213704.Repository.ClinicaRepository;
import com.example.lab3_20213704.Repository.OftalmologoRepository;
import com.example.lab3_20213704.Repository.PacienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    final ClinicaRepository clinicaRepository;

    final OftalmologoRepository oftalmologoRepository;
    final PacienteRepository pacienteRepository;
    public HomeController(ClinicaRepository clinicaRepository, OftalmologoRepository oftalmologoRepository, PacienteRepository pacienteRepository) {
        this.clinicaRepository = clinicaRepository;
        this.oftalmologoRepository = oftalmologoRepository;
        this.pacienteRepository = pacienteRepository;
    }

    @GetMapping("/listarClinicas")
    public String listar(Model model) {
        model.addAttribute("listaClinicas", clinicaRepository.findAll());
        return "listaClinicas";
    }

}
