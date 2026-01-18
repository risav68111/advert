package lms.app.user.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lms.app.user.entity.AdminEntity;

@Repository
public interface AdminRepository extends  JpaRepository<AdminEntity, String> {
  
}
