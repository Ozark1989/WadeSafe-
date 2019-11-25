package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource 
public interface reportInter extends CrudRepository <reportTB, Integer> {

	List<reportTB> findByid(int id);
	List<reportTB> findByHour(int hour);
	List<reportTB> findByUnits(int units);
	List<reportTB> findByDate(int date);
	List<reportTB> findByDamid(int damid);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO reportTB (hour, units, date, damid) "
			+ "VALUES(:newhour, :newunits, :newdate, :newdamid)", nativeQuery = true)
	void postNewReport(int newhour, int newunits, int newdate, int newdamid);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE reportTB SET hour= :newhour, units= :newunits WHERE id = :newid", nativeQuery = true)
	void updateReportVars(int newhour, int newunits, int newid);
	
	@Modifying
	@Transactional
	@Query(value = "SELECT TOP(48) * FROM reporttb ORDER BY date DESC ", nativeQuery = true)
	List<reportTB> getLast48();
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM reporttb WHERE id = :newid", nativeQuery = true)
	void deleteReport(Float newid);
	
	@Modifying
	@Transactional
	@Query(value = "SELECT * FROM reporttb", nativeQuery = true)
	List<reportTB> allreport();
	
}
