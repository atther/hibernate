package com.practice.hibernate.repo.onetone;


import com.practice.hibernate.models.onetoone.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
