package kata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordShould {

    private Password pass = new Password();

    @ParameterizedTest
    @ValueSource( strings = {"abcde","abcd1"})
    void beNotValidifLessThenThan6Characters(String password) {
        assertThat(pass.isValidRule1(password)).isFalse();
    }

    @ParameterizedTest
    @ValueSource( strings = {"ZYXWVU","abCDef","abCDef","abcDefg","ab@de1"})
    void beValidIfAtLeast6Characters(String password) {
        assertThat(pass.isValidRule1(password)).isTrue();
    }

    @ParameterizedTest
    @ValueSource( strings = {"bc"} )
    void beNotValidIfWithoutAnyNumber(String password) {
        assertThat(pass.isValidRule2(password)).isFalse();
    }

    @ParameterizedTest
    @ValueSource( strings = {"1","12345","a1","2b","1cz2","xz33ee"} )
    void beValidIfContainsAtLeastOneNumber(String password) {
        assertThat(pass.isValidRule2(password)).isTrue();
    }

    @ParameterizedTest
    @ValueSource( strings = {"a","alpha","a1","1P2"} )
    void beValidIfContainsAtLeastOneLetter(String password) {
        assertThat(pass.isValidRule3(password)).isTrue();
    }

    @ParameterizedTest
    @ValueSource( strings = {"beta1", "123", "abC" } )
    void beNotValidIfWeak(String password) {
        assertThat(pass.isStrong(password)).isFalse();
    }

    @ParameterizedTest
    @ValueSource( strings = {"alpha1", "1bcDefg", "abCDef1" } )
    void beValidIfStrong(String password) {
        assertThat(pass.isStrong(password)).isTrue();
    }

    @ParameterizedTest
    @ValueSource( strings = {"ZYXWVU"})
    void beValidIfAtLeast10Characters(String password) {
        assertThat(pass.isValidRule10CarMin(password)).isTrue();
    }


}
