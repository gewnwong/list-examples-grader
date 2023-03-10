import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsA implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("a");
  }
}

public class TestListExamples {

  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testFilter() {
    List<String> s1 = Arrays.asList("a", "b", "c");
    List<String> s2 = Arrays.asList("d", "a");
    List<String> expect = Arrays.asList("a");
    List<String> result1 = ListExamples.filter(s1, new IsA());
    List<String> result2 = ListExamples.filter(s2, new IsA());
    assertEquals(expect, result1);
    assertEquals(expect, result2);
  }
}
