package lms.app.advert;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping("/api")
    public String isRunning() {
        return "api is running";
    }
}
