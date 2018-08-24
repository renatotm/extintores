package br.com.cnaga.ControleExtintores.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExtintoresController {

	@RequestMapping("/extintores/novo")
	public String novo() {
	
		return "extintor/CadastroExtintor";
	}

	@RequestMapping(value="/extintores/novo", method = RequestMethod.POST)
	public void cadastrar() {
		
		
		
	}
	
}
