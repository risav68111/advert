package lms.app.user.entity;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lms.app.user.enums.UserRole;
import lms.app.user.enums.UserStatus;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;

    private String fullName;
    private String phone;
    private String avatarUrl;
    private String bio;
    private String address;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    private Instant createdAt;
    private Instant updatedAt;
    private Instant lastLogin;

}
