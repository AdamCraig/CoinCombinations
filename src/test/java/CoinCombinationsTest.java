import org.junit.*;
import static org.junit.Assert.*;

public class CoinCombinationsTest {

  @Test
  public void changeMaker_returnChangeString_quarter(){
    CoinCombinations testChange = new CoinCombinations();
    assertEquals("quarter", testChange.changeMaker(25));
  }
}
