package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NumberController {

    @GetMapping("/number")
    public String numberForm(Model model) {
        model.addAttribute("number", new Number());
        return "number";
    }

    @PostMapping("/number")
    public String numberSubmit(@ModelAttribute Number number) {
        number.setBinNum();
        return "number";
    }

    @GetMapping("/number/{num}")
    public String showConvert(@PathVariable("num") int dec, @ModelAttribute Number number) {
        number.setDecNum(dec);
        return "number";
    }

}
