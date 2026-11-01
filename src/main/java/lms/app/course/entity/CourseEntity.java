package lms.app.course.entity;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lms.app.course.enums.CourseLevel;
import lms.app.course.enums.CourseStatus;
import lms.app.user.entity.UserEntity;

@Entity
@Table(name = "courses")
public class CourseEntity {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String description;

    @ManyToOne
    private UserEntity instructor;

    @Enumerated(EnumType.STRING)
    private CourseLevel level;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private CourseStatus status;

    private String thumbnailUrl;
    private Instant createdAt;
    private Instant updatedAt;
}

