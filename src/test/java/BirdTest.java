import io.zipcoder.polymorphism.Bird;
import io.zipcoder.polymorphism.Pet;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

@Test
public void testSpeakMethod() {
//Given:
    Pet bird = new Bird("lou");
//When:
    String expected = "lala";
    String actual = bird.speak();

//Then:
    Assert.assertEquals(expected,actual);

}

@Test
public void testTypeofPet() {
//Given:
    Pet bird = new Bird("louie");
//When:
    String expected = "bird";
    String actual = bird.getType();

//Then:

    Assert.assertEquals(expected,actual);
}

}
