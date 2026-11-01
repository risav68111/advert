package lms.app.course.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lms.app.course.enums.LessonContentType;

@Entity
@Table(name = "lessons")
public class LessonEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private ModuleEntity module;

    private String title;

    @Enumerated(EnumType.STRING)
    private LessonContentType contentType;

    private String contentUrl;
    private int durationMinutes;
    private int orderIndex;
}

