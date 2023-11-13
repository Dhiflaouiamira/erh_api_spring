package com.tekup.project_erh.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.project_erh.model.Role;
import com.tekup.project_erh.repos.RoleRepository;

@Service
public class RoleServicesImpl implements RoleServices {

	
	@Autowired
	private RoleRepository roleRepository;
	
	
	@Override
	public Role saveRole(Role R) {
		return roleRepository.save(R);
	}
	@Override
	public String deleteRole(Role R) {
	    if(roleRepository.existsById(R.getId())) {
	        roleRepository.delete(R);
	        return "Role deleted successfully";
	    } else {
	        return "Role does not exist";
	    }
	}

	@Override
	public Role updateRole(Role updatedRole) {
	    Role existingRole = roleRepository.findById(updatedRole.getId()).orElse(null);
	    if (existingRole != null) {
	        existingRole.setLibelle(updatedRole.getLibelle());
	        return roleRepository.save(existingRole);
	    } else {
	        throw new IllegalArgumentException("Role not found with ID: " + updatedRole.getId());
	    }
	}
	@Override
	public Role getRole(Long id) {
		return roleRepository.findById(id).get();
	}

	@Override
	public List<Role> getAllRole() {
		return roleRepository.findAll();
	}

}
