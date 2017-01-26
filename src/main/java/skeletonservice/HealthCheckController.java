package skeletonservice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HealthCheckController {
    
    @RequestMapping("/health")
    public String index() {
        return "Alive!";
    }
    
}
