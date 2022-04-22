import static org.junit.Assert.*;  //imports the JUnit assert method
import org.junit.*;                //imports JUnit
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Path;
import java.io.IOException;

		
public class MarkdownParseTest {   //creates the class for testing
@Test						       //indicates that this is a test block
    public void addition() {	   //creates a test method that tests different cases
    assertEquals(2, 1 + 1);		   //checks if the first input is equal to the second input
    } 

@Test 
    public void testGetLinks() {
        Path filePath = Path.of("test-file.md");
        try {
            String file = Files.readString(filePath);
            List<String> result = MarkdownParse.getLinks(file);
            List<String> expected = List.of("https://something.com", "some-thing.html");
            assertEquals("Lists should be equal", expected, result);
        }

        catch (Exception e) {
            System.out.println("Exception was thrown and caught in test 1");
        }
    }

@Test
    public void testGetLinks2() {
        Path filePath = Path.of("test-file2.md");
        try {
            String file = Files.readString(filePath);
            List<String> result = MarkdownParse.getLinks(file);
            List<String> expected = List.of("https://something.com", "some-thing.html");
            assertEquals("Lists should be equal", expected, result);
        }

        catch (Exception e) {
            System.out.println("Exception was thrown and caught in test 2");
        }
    }

@Test
    public void testGetLinks3() {
        Path filePath = Path.of("test-file3.md");
        try {
            String file = Files.readString(filePath);
            List<String> result = MarkdownParse.getLinks(file);
            List<String> expected = List.of("https://something.com", "some-thing.html");
            assertEquals("Lists should be equal", expected, result);
        }


        catch (IOException e) {
            System.out.println("Exception was thrown and caught in test 3");
        }
    }


}
