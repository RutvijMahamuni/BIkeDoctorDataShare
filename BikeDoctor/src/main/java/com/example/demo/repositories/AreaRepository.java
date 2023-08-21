package com.example.demo.repositories;

import java.awt.geom.Area;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Areas;


@Repository
public interface AreaRepository extends JpaRepository<Areas, Integer> {

}
