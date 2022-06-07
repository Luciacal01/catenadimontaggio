package it.prova.catenadimontaggio.model;

import java.util.List;

public class SlotCatenaDiMontaggio {
	private String brand;
	private String country;
	private List<Automobile> automobili;
	
	public SlotCatenaDiMontaggio() {
	}

	public SlotCatenaDiMontaggio(String brand, String country) {
		super();
		this.brand = brand;
		this.country = country;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void addToSlot(Automobile automobile) {
		this.automobili.add(automobile);
	}

	public List<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(List<Automobile> automobili) {
		this.automobili = automobili;
	}

	@Override
	public String toString() {
		return "SlotCatenaDiMontaggio [brand=" + brand + ", country=" + country + "]";
	}
	
	
	
	
}
