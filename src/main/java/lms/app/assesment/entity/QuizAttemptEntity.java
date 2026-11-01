package lms.app.assesment.entity;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lms.app.user.entity.UserEntity;

@Entity
@Table(name = "quiz_attempts")
public class QuizAttemptEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private UserEntity user;

    @ManyToOne
    private QuizEntity quiz;

    private int score;
    private Instant attemptedAt;
}

