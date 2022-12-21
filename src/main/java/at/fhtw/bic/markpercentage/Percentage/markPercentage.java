package at.fhtw.bic.markpercentage.Percentage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class markPercentage {
    @GetMapping("/markPercentage")

    public String getMark(@RequestParam int percentage) {   //Das wird vom Client eingegeben: api/mark?percentage=90 → 1
        int mark;
        if (percentage >= 88) {
            return "1";
        } else if (percentage >= 75) {
            return "2";
        } else if (percentage >= 63) {
            return "3";
        } else if (percentage >= 50) {
            return "4";
        } else if (percentage < 50) {
            return "5";
        } else {
            return "No valid percentage. Please enter again.";
        }
    }
}
