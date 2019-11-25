package com.example.demo;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource 
public interface accessInter extends CrudRepository <accessPTB, Integer> {
	
	List<accessPTB> findByid(int id);
	List<accessPTB> findByName(String name);	
	List<accessPTB> findByRivermiles(int rivermiles);
	List<accessPTB> findByBoatramp(Boolean boatramp);
	List<accessPTB> findByRegdescript(String regdescript);
	List<accessPTB> findByAlgoid(int algoid);
	List<accessPTB> findByPhotos(String photos);
	List<accessPTB> findByDescript(String descript);
	List<accessPTB> findByDamid(int damid);
	List<accessPTB> findByRegs(Boolean regs);
	

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO accessPTB (name, rivermiles, boatramp, regdescript,  photos, descript, damid, regs) "
			+ "VALUES(:newname, :newrivermiles, :newboatramp, :newregdescript, :newphotos, :newdescript, "
			+ ":newdamid, :newregs)", nativeQuery = true)
	void postNewaccesspt(String newname, int newrivermiles, boolean newboatramp, String newregdescript, String newphotos,
			String newdescript, int newdamid, boolean newregs);

	
	@Modifying
	@Transactional
	@Query(value = "UPDATE accessPTB SET name= :newname, rivermiles= :newrivermiles, boatramp= :newboatramp, "
			+ "regdescript= :newregdescript, photos= :newphotos, descript= :newdescript, "
			+ "damid= :newdamid, regs= :newregs WHERE id= :updateid", nativeQuery = true)
	void updateNewaccessptb(String newname, int newrivermiles, boolean newboatramp, String newregdescript, String newphotos,
			String newdescript, int newdamid, boolean newregs, int updateid);
	
	@Modifying
	@Transactional
	@Query(value = "select top 1 id from accessptb order by id desc", nativeQuery = true)
		int accessidcount();
	
	@Modifying
	@Transactional
	@Query(value = "select * from accessptb", nativeQuery = true)
	List<accessPTB> allaccess();
	
}


