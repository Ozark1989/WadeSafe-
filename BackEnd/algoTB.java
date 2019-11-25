package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class algoTB {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int rise;

	private int fall;

	private int repid;
	
	
	public algoTB() {}
	
	
	public algoTB(int id, int rise, int fall, int repid) {
		this.id = id;
		this.rise = rise;
		this.fall = fall;
		this.repid = repid;
	}
	
	
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRise() {
		return this.rise;
	}

	public void setRise(int rise) {
		this.rise = rise;
	}

	public int getFall() {
		return this.fall;
	}

	public void setFall(int fall) {
		this.fall = fall;
	}

	public int getRepID() {
		return this.repid;
	}

	public void setRepID(int repid) {
		this.repid = repid;
	}

}

