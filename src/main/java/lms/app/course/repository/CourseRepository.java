package lms.app.course.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import lms.app.course.entity.CourseEntity;

// @Repository 
public interface CourseRepository extends JpaRepository<CourseEntity, UUID>{

}
