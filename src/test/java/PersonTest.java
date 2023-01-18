import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PersonTest {
@DataProvider(name = "ageDataProvider")
Object[][] ageDataProvider() {
        return new Object[][] {
        {-5, false},
        {0, false},
        {4, false},
        {13, true},
        {15, true},
        {19, true},
        {25, false}
        };
        }

@Test (dataProvider = "ageDataProvider")
    public void testPerson (int age, boolean expected) {
        boolean result = Person.isTeenager(age);
        System.out.println(result);
        assertEquals(result, expected);
    }
}
