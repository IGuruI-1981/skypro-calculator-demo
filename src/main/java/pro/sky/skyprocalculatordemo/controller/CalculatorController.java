package pro.sky.skyprocalculatordemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprocalculatordemo.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/plus")
    public String sumOfNumber(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.sumOfNumber(number1, number2).toString();
    }

    @GetMapping(path = "/minus")
    public String differenceOfNumber(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.differenceOfNumber(number1, number2).toString();
    }

    @GetMapping(path = "/multiply")
    public String compositionOfNumber(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.compositionOfNumber(number1, number2).toString();
    }

    @GetMapping(path = "/divide")
    public String divisionOfNumber(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.divisionOfNumber(number1, number2).toString();
    }
}
