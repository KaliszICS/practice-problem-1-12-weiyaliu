import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class PracticeProblemTest {
    // =========================================================
    // Q1: Input an integer, add 3, output the result.
    // =========================================================

    @Test
    public void testQ1_Positive()
    {
        String data = "7\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q1();

        // 7 + 3 = 10
        assertEquals("Input an integer: 10\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ1_LargePositive()
    {
        String data = "100\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q1();

        // 100 + 3 = 103
        assertEquals("Input an integer: 103\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ1_Zero()
    {
        String data = "0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q1();

        // 0 + 3 = 3
        assertEquals("Input an integer: 3\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ1_Negative()
    {
        String data = "-1\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q1();

        // -1 + 3 = 2
        assertEquals("Input an integer: 2\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ1_NegativeResultStaysNegative()
    {
        String data = "-10";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q1();

        // -10 + 3 = -7
        assertEquals("Input an integer: -7\n", bos.toString());
        System.setOut(originalOut);
    }

    // =========================================================
    // Q2: Input a number (string), concatenate "4", convert to
    //     float, add 2, output result.
    // =========================================================

    @Test
    public void testQ2_Positive()
    {
        String data = "5\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q2();

        // "5" + "4" = "54" -> 54.0 + 2 = 56.0
        assertEquals("Input a number: 56.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ2_LargePositive()
    {
        String data = "99\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q2();

        // "99" + "4" = "994" -> 994.0 + 2 = 996.0
        assertEquals("Input a number: 996.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ2_Zero()
    {
        String data = "0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q2();

        // "0" + "4" = "04" -> 4.0 + 2 = 6.0
        assertEquals("Input a number: 6.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ2_Negative()
    {
        String data = "-32\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q2();

        // "-32" + "4" = "-324" -> -324.0 + 2 = -322.0
        assertEquals("Input a number: -322.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ2_NegativeSingleDigit()
    {
        String data = "-1\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q2();

        // "-1" + "4" = "-14" -> -14.0 + 2 = -12.0
        assertEquals("Input a number: -12.0\n", bos.toString());
        System.setOut(originalOut);
    }

    // =========================================================
    // Q3: Input a radius, convert to float, area = 3.14 * r * r
    // =========================================================

    @Test
    public void testQ3_Positive()
    {
        String data = "5.0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q3();

        // 3.14 * 5 * 5 = 78.5
        assertEquals("Input a radius: 78.5\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ3_LargePositive()
    {
        String data = "10\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q3();

        // 3.14 * 10 * 10 = 314.0
        assertEquals("Input a radius: 314.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ3_One()
    {
        String data = "1\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q3();

        // 3.14 * 1 * 1 = 3.14
        assertEquals("Input a radius: 3.14\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ3_Zero()
    {
        String data = "0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q3();

        // 3.14 * 0 * 0 = 0.0
        assertEquals("Input a radius: 0.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ3_Negative()
    {
        String data = "-3.0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q3();

        // 3.14 * (-3) * (-3) = 28.26
        assertEquals("Input a radius: 28.26\n", bos.toString());
        System.setOut(originalOut);
    }

    // =========================================================
    // Q4: Input a number, convert to float, multiply by 12,
    //     floor to nearest whole number, output.
    // =========================================================

    @Test
    public void testQ4_Positive()
    {
        String data = "3\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q4();

        // floor(3.0 * 12) = floor(36.0) = 36
        assertEquals("Input a number: 36.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ4_PositiveDecimal()
    {
        String data = "2.5\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q4();

        // floor(2.5 * 12) = floor(30.0) = 30
        assertEquals("Input a number: 30.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ4_PositiveWithFloor()
    {
        String data = "1.9\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q4();

        // floor(1.9 * 12) = floor(22.8) = 22
        assertEquals("Input a number: 22.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ4_Zero()
    {
        String data = "0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q4();

        // floor(0.0 * 12) = floor(0.0) = 0
        assertEquals("Input a number: 0.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ4_Negative()
    {
        String data = "-2\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q4();

        // floor(-2.0 * 12) = floor(-24.0) = -24
        assertEquals("Input a number: -24.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ4_NegativeWithFloor()
    {
        String data = "-1.6\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q4();

        // floor(-1.6 * 12) = floor(-19.2) = -20
        assertEquals("Input a number: -20.0\n", bos.toString());
        System.setOut(originalOut);
    }

}
