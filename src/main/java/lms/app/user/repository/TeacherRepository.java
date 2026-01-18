package lms.app.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lms.app.user.entity.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity, String> {
  
}
