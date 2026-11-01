package lms.app.course.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import lms.app.course.entity.LessonEntity;

// @Repository 
public interface LessonRepository extends JpaRepository<LessonEntity, UUID>{

}
