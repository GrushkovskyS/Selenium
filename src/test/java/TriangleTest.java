import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {

   static Logger logger =LoggerFactory.getLogger(TriangleTest.class);

    @Test
    @DisplayName("Все три значения сторон целые числа")
     public void triangleTest() {
        logger.error("Ошибка");
        assertTrue(true);

    }

}