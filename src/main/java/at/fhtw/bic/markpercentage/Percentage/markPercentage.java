package at.fhtw.bic.markpercentage.Percentage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class markPercentage {
    @GetMapping("/markPercentage")

    public String getMark(int percentage) {
        int mark;


        return "";
    }
}
