package sujith.quizmaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sujith.quizmaster.repository.QuestionRepository;
import sujith.quizmaster.entity.ChoiceEntity;
import sujith.quizmaster.entity.QuestionEntity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
class QuestionService {

    private QuestionRepository qr;

    @Autowired
    public QuestionService(QuestionRepository questionRepository){
        this.qr = questionRepository;
    }

    public void storeQuestion(){

        UUID questionId =  UUID.randomUUID();
        ChoiceEntity choiceEntity = new ChoiceEntity(UUID.randomUUID(),
                questionId, "Narendra Modi", true);

        Set<ChoiceEntity> set = new HashSet<>();
        set.add(choiceEntity);

        QuestionEntity qe =
                new QuestionEntity(questionId,
                        "Who is the prime minister of india",
                        true, set);
        qr.save(qe);
    }

    public void deleteQuestion() {
       UUID uuid = UUID.fromString("7f98e313-18f4-4562-8768-91b8b7a68f4f");
       qr.deleteById(uuid);
    }
}
