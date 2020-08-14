package sujith.quizmaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    public ResponseEntity getHealth()
    {
        return new ResponseEntity(HttpStatus.OK);
    }
}
