package br.com.larjr.handagartowerdefenseapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/torre")
public class TorreController {

	@GetMapping("/torre")
	private String listaTodos() {

		return "Hello World";
	}

	@GetMapping("/torre/{id}")
	private String listaPeloId(@PathVariable(value = "id") Long id) {
		String idInformado = "Id informado: ";
		idInformado = idInformado.concat(id.toString());

		return idInformado;
	}
}
