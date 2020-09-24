import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class StringBuildTest {
 @Test
 public void stringBuilderAppendShouldConcatinate() {
 StringBuilder stringBuilder = new StringBuilder();
 stringBuilder.append("Another");
 stringBuilder.append("String");
 stringBuilder.append("Builder");
 stringBuilder.append("Test");
 assertEquals("AnotherStringBuilderTest", stringBuilder.toString());
 }
}

