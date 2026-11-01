package lms.app.assesment.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lms.app.advert.enums.QuestionType;

@Entity
@Table(name = "questions")
public class QuestionEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private QuizEntity quiz;

    private String questionText;

    @Enumerated(EnumType.STRING)
    private QuestionType type;
}

