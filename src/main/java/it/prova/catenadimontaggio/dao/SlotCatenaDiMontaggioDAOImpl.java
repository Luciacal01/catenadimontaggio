package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Component
public class SlotCatenaDiMontaggioDAOImpl implements SlotCatenaDiMontaggioDAO {

	@Override
	public SlotCatenaDiMontaggio get(int id) {
		for (SlotCatenaDiMontaggio slotCatenaDiMontaggio : DbMock.SLOTS) {
			if(slotCatenaDiMontaggio.getId()==id)
				return slotCatenaDiMontaggio;
		}
		return null;
	}

	@Override
	public void addAutomobileToSlot(Automobile automobileInput, SlotCatenaDiMontaggio slotInput) {
		for (SlotCatenaDiMontaggio slotCatenaDiMontaggioItem : DbMock.SLOTS) {
			if(slotCatenaDiMontaggioItem.getId()==slotInput.getId())
				slotCatenaDiMontaggioItem.addToSlot(automobileInput);
		}

	}

}
