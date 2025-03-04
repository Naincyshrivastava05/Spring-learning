package bridgelabs.springlearning.uc2;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
    @GetMapping("/web")
    public String helloWeb() {
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message", "This is a custom message");
        return "message";
    }
}
