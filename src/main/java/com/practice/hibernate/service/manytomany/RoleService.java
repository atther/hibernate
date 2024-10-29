package com.practice.hibernate.service.manytomany;

import com.practice.hibernate.models.manytomany.Role;
import com.practice.hibernate.repo.manytomany.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElseThrow(() -> new RuntimeException("Role Not Found!"));
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

}
