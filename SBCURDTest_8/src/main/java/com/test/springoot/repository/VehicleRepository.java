package com.test.springoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.springoot.model.Document;
import com.test.springoot.model.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

	void save(Document doc);

}
