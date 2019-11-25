package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class accessPTB {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private int rivermiles;

	private Boolean boatramp;

	private String regdescript;

	private int algoid;

	private String photos;

	private String descript;

	private int damid;

	private Boolean regs;
	
	
	public accessPTB() {}
	
	public accessPTB(String name, int rivermiles, boolean boatramp, String regdescript, int algoid, String photos, String descript, int damid, boolean regs) {
		this.name = name;
		this.rivermiles = rivermiles;
		this.boatramp = boatramp;
		this.regdescript = regdescript;
		this.algoid = algoid;
		this.photos = photos;
		this.descript = descript;
		this.damid = damid;
		this.regs = regs;
	}

	
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRiverMiles() {
		return this.rivermiles;
	}

	public void setRiverMiles(int rivermiles) {
		this.rivermiles = rivermiles;
	}

	public Boolean getBoatRamp() {
		return this.boatramp;
	}

	public void setBoatRamp(Boolean boatramp) {
		this.boatramp = boatramp;
	}

	public String getRegDescript() {
		return this.regdescript;
	}

	public void setRegsDescript(String regdescript) {
		this.regdescript = regdescript;
	}

	public int getAlgoID() {
		return this.algoid;
	}

	public void setAlgoID(int algoid) {
		this.algoid = algoid;
	}

	public String getPhotos() {
		return this.photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

	public String getDescript() {
		return this.descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public int getID() {
		return this.id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public Boolean getRegs() {
		return this.regs;
	}

	public void setRegs(Boolean regs) {
		this.regs = regs;
	}

	public int getDamID() {
		return this.damid;
	}

	public void setDamID(int damid) {
		this.damid = damid;
	}

}
