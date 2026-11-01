package lms.app.course.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import lms.app.course.entity.CourseEntity;

public interface CourseCategoryRepository extends JpaRepository<CourseEntity, UUID>{
    
}
