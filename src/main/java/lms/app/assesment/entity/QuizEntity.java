package lms.app.assesment.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lms.app.course.entity.LessonEntity;

@Entity
@Table(name = "quizzes")
public class QuizEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    private LessonEntity lesson;

    private String title;
    private int passScore;
    private String[] options;
    private int correctOptionIndex;
}

