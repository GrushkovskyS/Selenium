import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    int a = 4;
    int b = 5;
    int c = 3;

    static Logger logger = (Logger) LoggerFactory.getLogger(TriangleTest.class);

    @Test
    @DisplayName("Все три значения сторон целые числа ")
    void triangleIntTest() {
        logger.info("Инфо");
        Assertions.assertSame(a, 4, "Не целое число");
        Assertions.assertSame(b, 5, "Не целое число");
        Assertions.assertSame(c, 3, "Не целое число");

    }

    @Test
    @DisplayName("Все три значения сторон не Null ")
    void triangleNotNullTest() {
        logger.info("Инфо");
        Assertions.assertNotNull(a, "Null");
        Assertions.assertNotNull(b, "Null");
        Assertions.assertNotNull(c, "Null");
    }

    @Test
    @DisplayName("Одна из сторон треугольника 0 ")
    void triangleNullTest() {
        logger.info("Инфо");
        Assertions.assertAll(
                () -> assertEquals(0, a, "Сторона треугольника не может быть 0"),
                () -> assertEquals(5, b, "Сторона треугольника не может быть 0"),
                () -> assertEquals(3, c, "Сторона треугольника не может быть 0")

        );
    }

    @Test
    @DisplayName("Одна из сторон треугольника Строка ")
    void triangleStringTest() {
        logger.info("Инфо");
        Assertions.assertAll(
                () -> assertEquals("Привет", a, "Сторона треугольника не может быть строкой"),
                () -> assertEquals(5, b, "Сторона треугольника не может быть строкой"),
                () -> assertEquals(3, c, "Сторона треугольника не может быть строкой")
        );
    }

    //assertThrows Куда в этом тесте примостить что бы работало? Так и не понял...
    @Test
    @DisplayName("Одна из сторон треугольника Строка ")
    void triangleTest() {
        Assertions.assertThrows(NullPointerException.class,()-> assertEquals(4, a, "нет исключения"));
       assertEquals("Привет", a, "Сторона треугольника не может быть строкой");
    }

}
