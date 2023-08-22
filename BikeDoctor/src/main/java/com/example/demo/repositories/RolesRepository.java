package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;
import com.example.demo.entities.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles,Integer> {
	@Query("select r from Roles r where id= :roleid")
	public Optional<Roles> getRoles(int roleid);
}
