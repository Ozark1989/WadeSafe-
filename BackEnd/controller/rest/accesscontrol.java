package com.example.demo.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.*;

@RestController
public class accesscontrol {

	@Autowired 
	accessInter aptb;  

	@Autowired 
	algoInter algtb;   

	@Autowired 
	reportInter rptb;  

	
//Access Point Controls 
//==========================================================================================================================================================
	//This creates a new access point and algo at the same DAM time 
	@CrossOrigin(origins="*")
	@PostMapping(value = "/NewAccess&Algo/{name}/{rivermiles}/{boatramp}/{regdescript}/{photos}/{descript}/{damid}/{regs}/{rise}/{fall}/{repID}")
	public boolean postNewaccessptb(@PathVariable("name")String name, @PathVariable("rivermiles")int rivermiles, @PathVariable("boatramp")
	boolean boatramp, @PathVariable("regdescript") String regdescript, @PathVariable("photos")String photos, @PathVariable("descript") String descript,
	@PathVariable("damid")int damid, @PathVariable("regs") boolean regs, @PathVariable("rise") int rise, @PathVariable("fall") int fall, 
	@PathVariable("repID") int repID) {
		aptb.postNewaccesspt(name, rivermiles, boatramp, regdescript, photos, descript, damid, regs);
		algtb.postNewalgo(rise, fall, repID);
		return true;
	}


	//This allows you to update all values in a access point by id (the 11th variable)
	@CrossOrigin(origins="*")
	@PutMapping(value = "/UpdateAccess/{name}/{rivermiles}/{boatramp}/{regdescript}/{photos}/{descript}/{damid}/{regs}/{id}")
	public boolean updateNewaccessptb(@PathVariable("name")String name, @PathVariable("rivermiles")int rivermiles, @PathVariable("boatramp")
	boolean boatramp, @PathVariable("regdescript") String regdescript, @PathVariable("photos")String photos,
	@PathVariable("descript")String descript, @PathVariable("damid")int damid,@PathVariable("regs")boolean regs, @PathVariable("id")int id) {
		aptb.updateNewaccessptb(name, rivermiles, boatramp, regdescript, photos, descript, damid, regs, id);
		return true;
	}


	//This allows you to find an access point by name
	@CrossOrigin(origins="*")
	@GetMapping(value = "/name/{rando}")
	public List<accessPTB> accessPTBname(@PathVariable String rando) {
		return aptb.findByName(rando);
	}


	//This allows you to find an access point by dam id 
	//The only input is 15 (GFD = 15) This is a future proofing function, for dealing with multiple rivers in the future
	@CrossOrigin(origins="*")
	@GetMapping(value = "/dam/{rando}")
	public List<accessPTB> accessPTBdamid(@PathVariable int rando) {
		return aptb.findByDamid(rando);	
	}


	//This allows you to get the entire data-set in the accessPTB table 
	@CrossOrigin(origins="*")
	@GetMapping(value = "/accessPTB")
	public List<accessPTB> rando() {
		return aptb.allaccess();
	}

	
//Algo Controls 
//=======================================================================================================================================================
	
	//This allows you to select an algo by the access point name 
	@CrossOrigin(origins="*")
	@GetMapping(value = "/findAPName/{rando}")
	public List<algoTB> findByAccesspointnam(@PathVariable String rando) {
		return algtb.findByAccesspointnam(rando);

	}

	//This allows you to select an algo by the access point id 
	@CrossOrigin(origins="*")
	@GetMapping(value = "/findAPID/{rando}")
	public List<algoTB> findByAccesspointid(@PathVariable int rando) {
		return algtb.findByAccesspointid(rando);

	}

	//This allows you to select an algo by id	
	@CrossOrigin(origins="*")  
	@GetMapping(value = "/findAlgoID/{rando}")
	public List<algoTB> findByid(@PathVariable("rando") int rando) {
		return algtb.findByid(rando);
	}
	//This allows you to get the entire data-set in the algoTB table 
	@CrossOrigin(origins="*")
	@GetMapping(value = "/algoTB")
	public List<algoTB> rando2() {
		return algtb.allalgo();
	}	

	
//Report Controls 
//=====================================================================================================================================================
		
	//This allows you to post another report in the report table 
	@CrossOrigin(origins="*")
	@PostMapping(value= "/NewReport/{hour}/{units}/{date}/{damid}")
	public boolean postNewReport(@PathVariable("hour") int hour, @PathVariable("units") int units, @PathVariable("date") int date, @PathVariable("damid") int damid) {
		rptb.postNewReport(hour, units, date, damid);
		return true;
	}


	//This allows you to update the hour and units by id 
	@CrossOrigin(origins="*")
	@PutMapping(value = "/UpdateReport/{hour}/{units}/{id}")
	public boolean updateReport(@PathVariable("hour")int hour, @PathVariable("units")int units, @PathVariable("id")int id) {
		rptb.updateReportVars(hour, units, id);
		return true;
	}

	
	//This allows you to get the entire data-set in the reportTB table 
	@CrossOrigin(origins="*")
	@GetMapping(value = "/reportTB")
	public List<reportTB> rando1() {
		return rptb.allreport();
	}
	
	//This allows you to get the latest 48 hours for the "MATHING"
	@CrossOrigin(origins="*")
	@GetMapping(value = "/last48")
	public List<reportTB> rando48() {
		return rptb.getLast48();
	}
	
	//This allows you to delete a row in the reportTB table by id 
	@CrossOrigin(origins="*")
	@DeleteMapping(value = "/delreportTB/{newid}")
	public void rando3(@PathVariable("newid") Float newid) {
		rptb.deleteReport(newid);
	}
	
}

