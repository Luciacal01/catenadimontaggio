package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;
@Service
public class MotoreServiceImpl implements MotoreService {

	@Override
	public void aggiuntaMotore(Automobile automobile) {
		System.out.println("Motore aggiunto correttamente");

	}

}
