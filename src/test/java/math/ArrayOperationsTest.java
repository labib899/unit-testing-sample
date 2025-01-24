package math;

import io.FileIO;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class ArrayOperationsTest {

    private FileIO fileio = new FileIO();
    private MyMath myMath = new MyMath();
    private ArrayOperations arrayOperations = new ArrayOperations();

    @Test
    public void testFindPrimesInFile_AllPrimes() throws IOException {
        String testFilePath = "test_all_primes.txt";
        try (FileWriter writer = new FileWriter(testFilePath)) {
            writer.write("2\n3\n5\n7");
        }
        
        int[] primes = arrayOperations.findPrimesInFile(fileio, testFilePath, myMath);
        int[] expected = {2, 3, 5, 7};
        assertArrayEquals(expected, primes);

        new File(testFilePath).delete();
    }

    @Test
    public void testFindPrimesInFile_NoPrimes() throws IOException {
        String testFilePath = "test_no_primes.txt";
        try (FileWriter writer = new FileWriter(testFilePath)) {
            writer.write("4\n6\n8\n10");
        }

        int[] primes = arrayOperations.findPrimesInFile(fileio, testFilePath, myMath);
        int[] expected = {};
        assertArrayEquals(expected, primes);

        new File(testFilePath).delete();
    }

    @Test
    public void testFindPrimesInFile_MixedPrimesAndNonPrimes() throws IOException {
        String testFilePath = "test_mixed_primes.txt";
        try (FileWriter writer = new FileWriter(testFilePath)) {
            writer.write("2\n4\n5\n6");
        }

        int[] primes = arrayOperations.findPrimesInFile(fileio, testFilePath, myMath);
        int[] expected = {2, 5};
        assertArrayEquals(expected, primes);

        new File(testFilePath).delete();
    }
}
