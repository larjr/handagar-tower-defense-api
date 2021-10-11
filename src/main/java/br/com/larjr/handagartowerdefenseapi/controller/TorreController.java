package br.com.larjr.handagartowerdefenseapi.controller;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.larjr.handagartowerdefenseapi.entidade.Torre;
import br.com.larjr.handagartowerdefenseapi.service.TorreService;

@RestController
@RequestMapping("/torre")
public class TorreController {

	@Autowired
	TorreService torreService;

	@GetMapping("")
	private List<Torre> listaTodos() {
		return torreService.listaTodos();
	}

	@GetMapping("{id}")
	private Optional<Torre> listaPeloId(@PathVariable(value = "id") Long id) {
		return torreService.encontraPeloId(id);
	}

	@PostMapping("")
	private ResponseEntity<Torre> gravaTorre(@RequestBody Torre novaTorre) throws ServerException {
		Torre torre = torreService.gravar(novaTorre);

		if (torre == null) {
			throw new ServerException("Erro");
		} else {
			return new ResponseEntity<>(torre, HttpStatus.CREATED);
		}
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
	private ResponseEntity<Long> deletaTorre(@PathVariable(value = "id") Long id) {
		Optional<Torre> torre = torreService.encontraPeloId(id);

		if (!torre.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		torreService.deleta(torre.get());

		return new ResponseEntity<>(id, HttpStatus.OK);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.OPTIONS)
	private String opcoesTorre(@PathVariable(value = "id") Long id) {
		String idInformado = "OPTIONS: Id informado: ";
		idInformado = idInformado.concat(id.toString());

		System.out.println(idInformado);

		return idInformado;
	}

	// TODO: Verificar uso do método HEAD
	@RequestMapping(value = "{id}", method = RequestMethod.HEAD)
	private String headTorre(@PathVariable(value = "id") Long id) {
		String idInformado = "HEAD: Id informado: ";
		idInformado = idInformado.concat(id.toString());

		System.out.println(idInformado);

		return idInformado;
	}
}
