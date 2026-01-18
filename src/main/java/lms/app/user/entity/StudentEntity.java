package lms.app.user.entity;

import java.time.Instant;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "user_student")
@Entity
@Data
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private String phone;
    private String email;

    @Column(name="avatar_url")
    private String avatarUrl;
    private LocalDate dob;

    @Column(name="bio", length=500)
    private String bio;

    private Instant lastLogin;

}
