package it.prova.catenadimontaggio.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class DbMock {
	public static final List<SlotCatenaDiMontaggio> SLOTS= new ArrayList<SlotCatenaDiMontaggio>();
	
	static {
		try {
			SlotCatenaDiMontaggio slotCatenaDiMontaggio1= new SlotCatenaDiMontaggio(1L,"Renault", "Francia");
			Automobile automobile1= new Automobile(1L,"Clio ", "FF56TT", new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2022"));
			slotCatenaDiMontaggio1.addToSlot(automobile1);
			Automobile automobile2= new Automobile(2L, "fgakà", "GR893TF", new SimpleDateFormat("dd-MM-yyyy").parse("23-02-1987") );
			slotCatenaDiMontaggio1.addToSlot(automobile2);
			
			SlotCatenaDiMontaggio slotCatenaDiMontaggio2= new SlotCatenaDiMontaggio(2L, "Fiat","Italia");
			Automobile automobile3 = new Automobile(3L, "500L", "DW456VV",  new SimpleDateFormat("dd-MM-yyyy").parse("29-10-2001"));
			slotCatenaDiMontaggio2.addToSlot(automobile3);
			Automobile automobile4= new Automobile(4L, "Doblo", "FF871TG",  new SimpleDateFormat("dd-MM-yyyy").parse("11-06-2008"));
			slotCatenaDiMontaggio2.addToSlot(automobile4);
			Automobile automobile5= new Automobile(5L, "Panda", "TG9209",  new SimpleDateFormat("dd-MM-yyyy").parse("03-09-2004") );
			slotCatenaDiMontaggio2.addToSlot(automobile5);
			
			SLOTS.add(slotCatenaDiMontaggio1);
			SLOTS.add(slotCatenaDiMontaggio2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
