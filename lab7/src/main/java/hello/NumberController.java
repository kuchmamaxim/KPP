package hello;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/number/decs")
    public String showByDec(@RequestParam("dec") int dec, @ModelAttribute Number number) {
        number.setDecNum(dec);
        return "number";
    }

    @GetMapping("/number/bins")
    public String showByBin(@RequestParam("bin") String bin, @ModelAttribute Number number) {
        number.setBinNum(bin);
        return "number";
    }
}
