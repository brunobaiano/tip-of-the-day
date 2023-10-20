package tipoftheday.tip2;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class StringUtilsTest {

  @InjectMocks
  StringUtils stringUtils;

  public static Stream<Arguments> arguments() {
    return Stream.of(
        Arguments.of(null, -1),
        Arguments.of("", 0),
        Arguments.of("  ", 0),
        Arguments.of("TEST  ", 4),
        Arguments.of("not blank", 9)
    );

  }

  @ParameterizedTest
  @MethodSource("arguments")
  void count(String source, int result) {
    Assertions.assertThat(stringUtils.countValid(source)).isEqualTo(result);
  }
}