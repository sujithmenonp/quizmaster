package sujith.quizmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sujith.quizmaster.entity.QuestionEntity;

import java.util.UUID;

public interface QuestionRepository extends JpaRepository<QuestionEntity, UUID> {
}
