package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource 
public interface algoInter extends CrudRepository <algoTB, Integer> {

	List<algoTB> findByid(int id);
	List<algoTB> findByRise(int rise);
	List<algoTB> findByFall(int fall);
	List<algoTB> findByRepid(int repid);

	@Query(value = "SELECT ALGO.* FROM algotb AS ALGO JOIN accessptb ACCESS "
			+"ON ALGO.id = ACCESS.algoID Where ACCESS.name = :qid", nativeQuery=true)
	List<algoTB> findByAccesspointnam(@Param("qid") String rando);
	
	@Query(value = "SELECT ALGO.* FROM algotb AS ALGO JOIN accessptb ACCESS "
			+"ON ALGO.id = ACCESS.algoID Where ACCESS.id = :qid", nativeQuery=true)
	List<algoTB> findByAccesspointid(@Param("qid") int rando);
	
	@Query(value="SELECT COUNT(*) FROM algoTB")
	int getcount();
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO algotb (rise, fall, repID) VALUES (:rise, :fall, :repID)", nativeQuery = true)
	void postNewalgo(int rise, int fall, int repID);
	
	@Modifying
	@Transactional
	@Query(value = "select * from algotb", nativeQuery = true)
	List<algoTB> allalgo();
	
}
