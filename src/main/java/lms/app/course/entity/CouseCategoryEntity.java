package lms.app.course.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_categories")
public class CouseCategoryEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;
}

