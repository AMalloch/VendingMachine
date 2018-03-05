import org.junit.Before;

public class TestDrink {
    private Drink drink;

    @Before
    public void setUp() throws Exception {
        drink = new Drink("Pepsi", 330);
    }
}
