package pro.sky.skyprocalculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping

    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/calculator")
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String sumOfNumber(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.sumOfNumber(number1, number2);
    }

    @GetMapping(path = "/calculator/minus")
    public String differenceOfNumber(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.differenceOfNumber(number1, number2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String compositionOfNumber(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.compositionOfNumber(number1, number2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divisionOfNumber(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.divisionOfNumber(number1, number2);
    }
}
