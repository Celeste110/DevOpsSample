import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by katherine_celeste on 11/27/16.
 */

@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }

}
