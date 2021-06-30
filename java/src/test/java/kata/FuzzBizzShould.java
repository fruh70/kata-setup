package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FuzzBizzShould {

    @ParameterizedTest
    @ValueSource(ints = {3, 9, 999})
    void beFizz(int number) {
        assertThat(fizzbuzz(number)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10})
    void beBuzz(int number) {
        assertThat(fizzbuzz(number)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    void beFizzBuzz(int number) {
        assertThat(fizzbuzz(number)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 7})
    void beNumber(int number) {
        assertThat(fizzbuzz(number)).isEqualTo(String.valueOf(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -3})
    void beEmtpy(int number) {
        assertThat(fizzbuzz(number)).isEqualTo("");
    }

    private String fizzbuzz(int number) {
        boolean isBeforeOne = number <= 0;
        boolean isDivisibleBy5 = (number % 5 == 0);
        boolean isDivisibleBy3 = (number % 3 == 0);

        if (isBeforeOne) {
            return "";
        }

        String result = "";
        if (isDivisibleBy3) {
            result += "Fizz";
        }
        if (isDivisibleBy5) {
            result += "Buzz";
        }
        if (!"".equals(result)) {
            return result;
        }
        return String.valueOf(number);
    }
}
