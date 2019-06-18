import io.zipcoder.polymorphism.Dog;
import io.zipcoder.polymorphism.Pet;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speak() {
        //Given:
        Pet dog = new Dog("fluffy");

        //When:
        String expected = "Bark";
        String actual = dog.speak();

        //Then:
        Assert.assertEquals(expected, actual);

        }

     @Test
    public void typeOfPet() {
        //Given:
         Pet dog = new Dog("frenchie");

         //When:
        String expected = "dog";
        String actual = dog.getType();

        //Then:
        Assert.assertEquals(expected,actual);
     }













    }


