package pro.sky.skyprocalculatordemo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {



    public Integer sumOfNumber(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public Integer differenceOfNumber(int number1, int number2) {
        int difference = number1 - number2;
        return difference;
    }

    public Integer compositionOfNumber(int number1, int number2) {
        int composition = number1 * number2;
        return composition;
    }

    public Integer divisionOfNumber(int number1, int number2) {
        int division;
        if (number2 != 0) {
            division = number1 / number2;
            return division;
        } else
            throw new IllegalArgumentException("На ноль делить нельзя!");
    }
}
