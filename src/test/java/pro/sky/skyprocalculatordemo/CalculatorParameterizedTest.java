package pro.sky.skyprocalculatordemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.skyprocalculatordemo.service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.InstanceOfAssertFactories.stream;

public class CalculatorParameterizedTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("forSum")
    public void sumOfNumberTest(Integer a, Integer b, Integer expected) {
        assertThat(calculatorService.sumOfNumber(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("forDifference")
    public void differenceOfNumberTest(Integer a, Integer b, Integer expected) {
        assertThat(calculatorService.differenceOfNumber(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("forComposition")
    public void compositionOfNumberTest(Integer a, Integer b, Integer expected) {
        assertThat(calculatorService.compositionOfNumber(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("forDivision")
    public void divisionOfNumberTest(Integer a, Integer b, Integer expected) {
        if (b==0) {
            assertThatExceptionOfType(IllegalArgumentException.class)
                    .isThrownBy(() -> calculatorService.divisionOfNumber(a, b))
                    .withMessage("На ноль делить нельзя!");
        } else
        assertThat(calculatorService.divisionOfNumber(a, b)).isEqualTo(expected);
    }

    public static Stream<Arguments> forSum() {
        return Stream.of(
                Arguments.of(4, 7, 11),
                       Arguments.of(6, -3, 3)
        );
    }

    public static Stream<Arguments> forDifference() {
        return Stream.of(
                Arguments.of(4, 7, -3),
                Arguments.of(6, -3, 9)
        );
    };

    public static Stream<Arguments> forComposition() {
        return Stream.of(
                Arguments.of(4, 7, 28),
                Arguments.of(6, -3, -18)
        );
    }

    public static Stream<Arguments> forDivision() {
        return Stream.of(
                Arguments.of(49, 7, 7),
                Arguments.of(6, -3, -2),
                Arguments.of(0, 7, 0),
                Arguments.of(49, 0,null)
        );
    }
}
