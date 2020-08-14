package sujith.quizmaster

import org.apache.catalina.core.ApplicationContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification
import sujith.quizmaster.Main

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MainSpec extends Specification{

    @Autowired(required = false)
    ApplicationContext context

    def "load app context"(){
        expect: "app context is loaded successfully"
        context!=null
    }
}
