package com.practice.hibernate.repo.manytomany;

import com.practice.hibernate.models.manytomany.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}