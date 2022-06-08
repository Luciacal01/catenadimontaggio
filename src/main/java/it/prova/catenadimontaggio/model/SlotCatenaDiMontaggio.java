package it.prova.catenadimontaggio.model;

import java.util.ArrayList;
import java.util.List;

public class SlotCatenaDiMontaggio {
	private Long id;
	private String brand;
	private String country;
	private List<Automobile> automobili = new ArrayList<Automobile>();
	
	public SlotCatenaDiMontaggio() {
	}

	public SlotCatenaDiMontaggio(Long id, String brand, String country) {
		super();
		this.id=id;
		this.brand = brand;
		this.country = country;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
