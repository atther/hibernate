package com.practice.hibernate.repo.onetomany;


import com.practice.hibernate.models.onetomany.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}