package br.com.larjr.handagartowerdefenseapi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/torre")
public class TorreController {

	@GetMapping("")
	private String listaTodos() {

		return "Hello World";
	}

	@GetMapping("{id}")
	private String listaPeloId(@PathVariable(value = "id") Long id) {
		String idInformado = "Id informado: ";
		idInformado = idInformado.concat(id.toString());

		return idInformado;
	}

	@PostMapping("")
	private String gravaTorre() {
		return "post gravaTorre90";
	}

	@PutMapping("{id}")
	private String atualizaTorre(@PathVariable(value = "id") Long id) {
		String idInformado = "PUT: Id informado: ";
		idInformado = idInformado.concat(id.toString());

		return idInformado;
	}

	@PatchMapping("{id}")
	private String atualizaTorreParcialmente(@PathVariable(value = "id") Long id) {
		String idInformado = "PATCH: Id informado: ";
		idInformado = idInformado.concat(id.toString());

		return idInformado;
	}

	@DeleteMapping("{id}")
	private String deletaTorre(@PathVariable(value = "id") Long id) {
		String idInformado = "DELETE: Id informado: ";
		idInformado = idInformado.concat(id.toString());

		return idInformado;
	}

	@RequestMapping(value = "{id}", method = RequestMethod.OPTIONS)
	private String opcoesTorre(@PathVariable(value = "id") Long id) {
		String idInformado = "OPTIONS: Id informado: ";
		idInformado = idInformado.concat(id.toString());

		System.out.println(idInformado);

		return idInformado;
	}

	//TODO: Verificar uso do método HEAD
	@RequestMapping(value = "{id}", method = RequestMethod.HEAD)
	private String headTorre(@PathVariable(value = "id") Long id) {
		String idInformado = "HEAD: Id informado: ";
		idInformado = idInformado.concat(id.toString());

		System.out.println(idInformado);

		return idInformado;
	}

}
