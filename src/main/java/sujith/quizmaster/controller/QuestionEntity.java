package sujith.quizmaster.controller;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.awt.*;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name="question")
public class QuestionEntity {

    @Id
    @Column(name = "question_id")
    private UUID questionId;

    @Column(name = "question")
    private String question;

    @Column(name = "is_active")
    private boolean isActive;

    @OneToMany(targetEntity = ChoiceEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id", referencedColumnName = "question_id")
    private Set<ChoiceEntity> choiceEntities;

    public QuestionEntity(UUID questionId, String question,
                          boolean isActive, Set<ChoiceEntity> choices){
        this.question = question;
        this.questionId = questionId;
        this.isActive = isActive;
        this.choiceEntities = choices;
    }

    public QuestionEntity(){

    }
}
