import static org.junit.jupiter.api.Assertions.*;

import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        FizzBuzz.main(null);

        System.setOut(originalOut);

        String[] output = outContent.toString().split("\n");

        for (int i = 1; i <= 100; i++) {
            String expectedOutput;
            if (i % 3 == 0 && i % 5 == 0) {
                expectedOutput = "FizzBuzz";
            } else if (i % 3 == 0) {
                expectedOutput = "Fizz";
            } else if (i % 5 == 0) {
                expectedOutput = "Buzz";
            } else {
                expectedOutput = String.valueOf(i);
            }
            assertEquals(expectedOutput, output[i - 1].trim());
        }
    }
}

