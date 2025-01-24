package io;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;


public class FileIOTest {

    private FileIO fileIO = new FileIO();

    @Test
    public void testReadFile_ValidFile() throws IOException {
        String testFilePath = "src/test/resources/grades_valid.txt";
        int[] result = fileIO.readFile(testFilePath);
        int[] expected = {3, 9, 0, 2, 10, 9, 3, 8, 0, 3};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testReadFile_FileWithInvalidLines() throws IOException {
        String testFilePath = "src/test/resources/grades_invalid.txt";
        int[] result = fileIO.readFile(testFilePath);
        int[] expected = {3, 9, 2, 10, 8, 0, 3};
        assertArrayEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadFile_EmptyFile() throws IOException {
        String testFilePath = "src/resources/empty_file.txt";
        fileIO.readFile(testFilePath);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadFile_FileDoesNotExist() {
        fileIO.readFile("non_existent_file.txt");
    }
}
