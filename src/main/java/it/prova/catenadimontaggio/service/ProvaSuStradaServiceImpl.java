package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class ProvaSuStradaServiceImpl implements ProvaSuStradaService {

	@Override
	public void effettuaProvaSuStrada(Automobile automobile) {
		System.out.println("Prova su strada effettuata corretamente");
	}

}
