package it.prova.catenadimontaggio.service;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface CatenaDiMontaggioService {
	public SlotCatenaDiMontaggio caricaSlots(int id);
	public void avviaSlot(SlotCatenaDiMontaggio slotCatenaDiMontaggio);
	public void aggiungiMacchinaASlot(Automobile automobile, SlotCatenaDiMontaggio slotCatenaDiMontaggio);
}
