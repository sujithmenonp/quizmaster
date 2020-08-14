package sujith.quizmaster

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import spock.lang.Specification
import sujith.quizmaster.controller.HealthController

public class HealthControllerSpec extends Specification  {

    def "test health controller"(){
        given:
        HealthController controller = new HealthController()
        expect:
        controller.getHealth().statusCode == HttpStatus.OK
    }
}
