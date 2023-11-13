package com.tekup.project_erh.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tekup.project_erh.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findRoleByLibelle(String libelle);
}
