package br.com.larjr.handagartowerdefenseapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.larjr.handagartowerdefenseapi.entidade.Torre;
import br.com.larjr.handagartowerdefenseapi.repository.TorreRepository;

@Service
public class TorreService {

	@Autowired
	TorreRepository torreRepository;

	public List<Torre> listaTodos() {
		return torreRepository.findAll();
	}

	public Torre gravar(Torre torre) {
		return torreRepository.save(torre);
	}

	public Optional<Torre> encontraPeloId(Long id) {
		return torreRepository.findById(id);
	}

	public void deleta(Torre torre) {
		torreRepository.delete(torre);
	}

}
