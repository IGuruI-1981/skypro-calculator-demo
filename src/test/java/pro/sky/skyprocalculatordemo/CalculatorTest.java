package pro.sky.skyprocalculatordemo;

import org.junit.jupiter.api.Test;
import pro.sky.skyprocalculatordemo.service.CalculatorServiceImpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CalculatorTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void sumOfNumberTest() {

        Integer actual = calculatorService.sumOfNumber(4, 6);
        assertThat(actual).isEqualTo(10);

        actual = calculatorService.sumOfNumber(-3, 6);
        assertThat(actual).isEqualTo(3);
    }

    @Test
    public void differenceOfNumberTest() {
        Integer actual = calculatorService.differenceOfNumber(4, 6);
        assertThat(actual).isEqualTo(-2);

        actual = calculatorService.differenceOfNumber(-3, 6);
        assertThat(actual).isEqualTo(-9);
    }

    @Test
    public void compositionOfNumberTest() {
        Integer actual = calculatorService.compositionOfNumber(4, 6);
        assertThat(actual).isEqualTo(24);

        actual = calculatorService.compositionOfNumber(-3, 6);
        assertThat(actual).isEqualTo(-18);
    }

    @Test
    public void divisionOfNumberPozitivTest() {
        Integer actual = calculatorService.divisionOfNumber(24, 6);
        assertThat(actual).isEqualTo(4);

        actual = calculatorService.divisionOfNumber(18, -6);
        assertThat(actual).isEqualTo(-3);

        actual = calculatorService.divisionOfNumber(0, -6);
        assertThat(actual).isEqualTo(0);
    }

    @Test
        public void divisionOfNumberNegativTest(){

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> calculatorService.divisionOfNumber(18, 0))
                .withMessage("На ноль делить нельзя!");

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> calculatorService.divisionOfNumber(-18, 0))
                .withMessage("На ноль делить нельзя!");
    }
}

