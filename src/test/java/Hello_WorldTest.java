import org.junit.Test;

import static org.junit.Assert.*;

public class Hello_WorldTest {

    @Test
    public void main() {
    }

    @Test
    public void plus()
    {
        assertEquals(12, new Hello_World().plus(6,6));
    }
}
