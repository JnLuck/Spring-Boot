package com.jhoselyn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jhoselyn.iservice.ItractorService;

import com.jhoselyn.models.Tractor;

@Controller
@RequestMapping
public class TractorController {
	
	@Autowired
	private ItractorService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Tractor> tractores=service.listar();
		model.addAttribute("tractores",tractores);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("tractor",new Tractor() );
		return "tractor_add";	
	}
	
	@GetMapping("/save")
	public String guardar(@Validated Tractor tor, Model model) {
		service.guardar(tor);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Tractor> tractor=service.buscarId(id);
		model.addAttribute("tractor" ,tractor);
		return "tractor_add"; 
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		service.eliminar(id);
		return "redirect:/listar";
	}
}
