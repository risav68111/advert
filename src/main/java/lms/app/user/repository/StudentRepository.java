package lms.app.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lms.app.user.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, String> {
  
}
