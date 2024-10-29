package com.practice.hibernate.repo.onetomany;

import com.practice.hibernate.models.onetomany.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}