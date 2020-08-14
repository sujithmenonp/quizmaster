package sujith.quizmaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

    @Autowired
    QuestionService questionService;

    @GetMapping("/create")
    public void create(){
        questionService.storeQuestion();
    }

    @DeleteMapping("/delete")
    public void delete(){
        questionService.deleteQuestion();
    }
}
