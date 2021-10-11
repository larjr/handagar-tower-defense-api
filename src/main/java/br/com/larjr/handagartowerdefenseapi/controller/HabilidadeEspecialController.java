package br.com.larjr.handagartowerdefenseapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.larjr.handagartowerdefenseapi.entidade.HabilidadeEspecial;
import br.com.larjr.handagartowerdefenseapi.service.HabilidadeEspecialService;

@RestController
@RequestMapping("/habilidadeEspecial")
public class HabilidadeEspecialController {

	@Autowired
	HabilidadeEspecialService habilidadeEspecialService;

	@GetMapping("")
	private List<HabilidadeEspecial> listaTodos() {
		return habilidadeEspecialService.listaTodos();
	}

	@GetMapping("{id}")
	private Optional<HabilidadeEspecial> listaPeloId(@PathVariable(value = "id") Long id) {
		return habilidadeEspecialService.encontraPeloId(id);
	}

	@PostMapping("")
	private String gravaHabilidadeEspecial() {
		return "POST: ";
	}

	@PutMapping("{id}")
	private String atualizaHabilidadeEspecial(@PathVariable(value = "id") Long id) {
		String idInformado = "PUT: Id informado: ";
		idInformado = idInformado.concat(id.toString());

		return idInformado;
	}

	@PatchMapping("{id}")
	private String atualizaHabilidadeEspecialParcialmente(@PathVariable(value = "id") Long id) {
		String idInformado = "PATCH: Id informado: ";
		idInformado = idInformado.concat(id.toString());

		return idInformado;
	}

	@DeleteMapping("{id}")
	private String deletaHabilidadeEspecial(@PathVariable(value = "id") Long id) {
		String idInformado = "DELETE: Id informado: ";
		idInformado = idInformado.concat(id.toString());

		return idInformado;
	}

	@RequestMapping(value = "{id}", method = RequestMethod.OPTIONS)
	private String opcoesHabilidadeEspecial(@PathVariable(value = "id") Long id) {
		String idInformado = "OPTIONS: Id informado: ";
		idInformado = idInformado.concat(id.toString());

		System.out.println(idInformado);

		return idInformado;
	}

	// TODO: Verificar uso do método HEAD
	@RequestMapping(value = "{id}", method = RequestMethod.HEAD)
	private String headHabilidadeEspecial(@PathVariable(value = "id") Long id) {
		String idInformado = "HEAD: Id informado: ";
		idInformado = idInformado.concat(id.toString());

		System.out.println(idInformado);

		return idInformado;
	}

}
