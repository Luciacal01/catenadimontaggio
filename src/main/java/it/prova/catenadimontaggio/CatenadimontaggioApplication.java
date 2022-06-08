package it.prova.catenadimontaggio;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
import it.prova.catenadimontaggio.service.CatenaDiMontaggioService;

@SpringBootApplication
public class CatenadimontaggioApplication implements CommandLineRunner {
	
	@Autowired
	private CatenaDiMontaggioService catenaDiMontaggioService;
	
	public static void main(String[] args) {
		SpringApplication.run(CatenadimontaggioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SlotCatenaDiMontaggio catenaDiMontaggio= catenaDiMontaggioService.caricaSlots(1);
		
		Automobile automobile= new Automobile(7L, "500X", "fg5104", new SimpleDateFormat("dd-MM-yyyy").parse("12-08-76"));
		
		catenaDiMontaggioService.aggiungiMacchinaASlot(automobile, catenaDiMontaggio);
		
		catenaDiMontaggioService.avviaSlot(catenaDiMontaggio);
		
	}
	
	
}
