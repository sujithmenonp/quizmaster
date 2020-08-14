package sujith.quizmaster.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name="question_choice")
public class ChoiceEntity {

    @Id
    @Column(name = "choice_id")
    private UUID choiceId;

    @Column(name = "question_id")
    private UUID questionId;

    @Column(name = "choice")
    private String choice;

    @Column(name = "is_correct")
    private boolean isCorrect;

    public ChoiceEntity(UUID choiceId, UUID questionId, String choice, boolean isCorrect){
        this.choiceId =choiceId;
        this.questionId = questionId;
        this.choice = choice;
        this.isCorrect = isCorrect;
    }
    public ChoiceEntity(){

    }
}
