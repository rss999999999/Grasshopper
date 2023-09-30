import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class MoveTest {
    @Test
    public void basicTests() {
        assertEquals(8, Move.move(0, 4));
        assertEquals(15, Move.move(3, 6));
        assertEquals(12, Move.move(2, 5));
    }

    private int sol(int position, int roll) {
        return position + roll * 2;
    }

    @Test
    public void randomTests() {
        for (int i = 0; i < 100; i++) {
            int roll = (int) (Math.random() * 6 + 1);
            int position = (int) (Math.random() * 20 + 1);
            assertEquals(sol(roll, position), Move.move(roll, position));
        }
    }
}