package lms.app.course.entity;


import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "modules")
public class ModuleEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private CourseEntity course;

    private String title;
    private int orderIndex;
}

