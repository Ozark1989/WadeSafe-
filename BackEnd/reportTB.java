package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class reportTB {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int hour;

	private int units;

	private int date;

	private int damid;
	
	
	public reportTB() {}
	
	public reportTB(int id, int hour, int units, int date, int damid) { 
		this.id = id;
		this.hour = hour;
		this.date = date;
		this.damid = damid;
		
		
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHour() {
		return this.hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getUnits() {
		return this.units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public int getDate() {
		return this.date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getDamID() {
		return this.damid;
	}

	public void setDamID(int damid) {
		this.damid = damid;
	}

}