package io.github.brunobaiano;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
public class JoiningCollectorTest {

    private static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        public String name() {
            return name;
        }
    }

    public static Stream<Arguments> persons() {
        return Stream.of(
                Arguments.of(List.of(
                                new Person("John"),
                                new Person("Mary"),
                                new Person("Peter"),
                                new Person("Paul"),
                                new Person("Mark"),
                                new Person("Luke"),
                                new Person("James"),
                                new Person("Jude"),
                                new Person("Thomas"),
                                new Person("Simon")
                        )
                ));
    }


    @ParameterizedTest
    @MethodSource("persons")
    @DisplayName("Joining collector with a comma as delimiter")
    void testJoiningCollectorWithDelimiter(List<Person> persons) {

        var names = persons.stream().map(Person::name).collect(Collectors.joining(","));

        //assert that the result is a string with 10 names separated by a comma
        assertThat(names).isEqualTo("John,Mary,Peter,Paul,Mark,Luke,James,Jude,Thomas,Simon");
    }

    @ParameterizedTest
    @MethodSource("persons")
    @DisplayName("Joining collector without delimiter")
    void testJoiningCollector(List<Person> persons) {

        var names = persons.stream().map(Person::name).collect(Collectors.joining());

        //assert that the result is a string with 10 names separated by a comma
        assertThat(names).isEqualTo("JohnMaryPeterPaulMarkLukeJamesJudeThomasSimon");
    }

    @ParameterizedTest
    @MethodSource("persons")
    @DisplayName("Joining collector with delimiter and prefix and suffix")
    void testJoiningCollectorWithPrefixSuffix(List<Person> persons) {

        var names = persons.stream().map(Person::name).collect(Collectors.joining(",", "(", ")"));

        //assert that the result is a string with 10 names separated by a comma
        assertThat(names).isEqualTo("(John,Mary,Peter,Paul,Mark,Luke,James,Jude,Thomas,Simon)");
    }
}
