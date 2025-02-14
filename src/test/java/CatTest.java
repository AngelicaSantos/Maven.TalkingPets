import io.zipcoder.polymorphism.Cat;
import io.zipcoder.polymorphism.Pet;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

@Test
public void testSpeak() {
//Given
    Cat cat = new Cat("lula");
//When:
    String expected = "meow";
    String actual = cat.speak();

//Then:
    Assert.assertEquals(expected, actual);

}


@Test
public void getType() {

//Given:
Cat cat = new Cat("lila");

//When:
    String expected = "cat";
    String actual = cat.getType();

//Then:
    Assert.assertEquals(expected, actual);

}







}
