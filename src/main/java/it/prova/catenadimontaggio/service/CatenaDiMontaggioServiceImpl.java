package it.prova.catenadimontaggio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.dao.SlotCatenaDiMontaggioDAO;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
@Service
public class CatenaDiMontaggioServiceImpl implements CatenaDiMontaggioService {

	@Autowired
	private TelaioService telaioService;
	@Autowired
	private MotoreService motoreService;
	@Autowired 
	private ImpiantoElettricoService impiantoElettricoService;
	@Autowired
	private CarrozzeriaService carrozzeriaService;
	@Autowired
	private ProvaSuStradaService provaSuStradaService;
	@Autowired 
	private SlotCatenaDiMontaggioDAO slotCatenaDiMontaggioDAO;
	
	@Override
	public void avviaSlot(SlotCatenaDiMontaggio slotCatenaDiMontaggio) {
		System.out.println("inizio assemblaggio macchina");
		for (Automobile automobile : slotCatenaDiMontaggio.getAutomobili()) {
			System.out.println("inizio assemblaggio macchina: "+ automobile.getModello());
			telaioService.aggiuntaTelaio(automobile);
			motoreService.aggiuntaMotore(automobile);
			impiantoElettricoService.aggiuntaImpiantoElettrico(automobile);
			carrozzeriaService.aggiuntaCarrozzeria(automobile);
			provaSuStradaService.effettuaProvaSuStrada(automobile);
			System.out.println("Terminato assemblaggio macchina: "+ automobile.getModello());
		}
		System.out.println("Termine assemblaggio");
	}
	
	@Override
	public SlotCatenaDiMontaggio caricaSlots(int id) {
		return slotCatenaDiMontaggioDAO.get(id);
	}

	@Override
	public void aggiungiMacchinaASlot(Automobile automobile, SlotCatenaDiMontaggio slotCatenaDiMontaggio) {
		slotCatenaDiMontaggioDAO.addAutomobileToSlot(automobile, slotCatenaDiMontaggio);
		
	}
	
}
