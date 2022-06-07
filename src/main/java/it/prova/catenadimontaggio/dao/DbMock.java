package it.prova.catenadimontaggio.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class DbMock {
	public static final List<SlotCatenaDiMontaggio> SLOTS= new ArrayList<>();
	
	static {
		try {
			SlotCatenaDiMontaggio slotCatenaDiMontaggio1= new SlotCatenaDiMontaggio("Renault", "Francia");
			Automobile automobile1= new Automobile("Clio ", "FF56TT", new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2022"));
			slotCatenaDiMontaggio1.addToSlot(automobile1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
