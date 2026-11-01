package lms.app.course.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import lms.app.course.entity.ModuleEntity;

// @Repository 
public interface ModuleRepository extends JpaRepository<ModuleEntity, UUID> {

}
