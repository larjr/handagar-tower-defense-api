package br.com.larjr.handagartowerdefenseapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.larjr.handagartowerdefenseapi.entidade.HabilidadeEspecial;
import br.com.larjr.handagartowerdefenseapi.repository.HabilidadeEspecialRepository;

@Service
public class HabilidadeEspecialService {
	
	@Autowired
	HabilidadeEspecialRepository habilidadeEspecialRepository;
	
	public List<HabilidadeEspecial> listaTodos() {
		return habilidadeEspecialRepository.findAll();
	}

	public Optional<HabilidadeEspecial> encontraPeloId(Long id) {
		return habilidadeEspecialRepository.findById(id);
	}

}
