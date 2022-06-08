package it.prova.catenadimontaggio.dao;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface SlotCatenaDiMontaggioDAO {
	public SlotCatenaDiMontaggio get(int id);
	public void addAutomobileToSlot(Automobile automobileInput, SlotCatenaDiMontaggio slotInput);
}
