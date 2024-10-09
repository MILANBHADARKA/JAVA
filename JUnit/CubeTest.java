import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.javapoint.logic.Cube;

public class CubeTest {

    @Test
    public void testCubee() {
        assertEquals(225, Cube.cubee(5));
    }
}
