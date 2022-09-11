package pro.sky.skyprocalculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String hello() {
        return "hello SkyPRO";
    }


    public String helloCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }


    public String sumOfNumber(int number1, int number2) {
        int sum = number1 + number2;
        return "<b>" + number1 + " + " + number2 + " = " + sum + "</b>";
    }

    public String differenceOfNumber(int number1, int number2) {
        int difference = number1 - number2;
        return "<b>" + number1 + " - " + number2 + " = " + difference + "</b>";
    }

    public String compositionOfNumber(int number1, int number2) {
        int composition = number1 * number2;
        return "<b>"+ number1 + " * " + number2 + " = " + composition + "</b>";
    }

    public String divisionOfNumber(int number1, int number2) {
        int division;
        if (number2 != 0) {
            division = number1 / number2;
            return "<b>" + number1 + " / " + number2 + " = " + division + "</b>";
        } else return "На ноль делить нельзя ";
    }
}
