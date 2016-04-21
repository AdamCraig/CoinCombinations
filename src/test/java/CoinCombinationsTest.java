import org.junit.*;
import static org.junit.Assert.*;

public class CoinCombinationsTest {

  @Test
  public void changeMaker_returnChangeString_oneQuarter(){
    CoinCombinations testChange = new CoinCombinations();
    assertEquals("1 quarter(s). 0 dime(s). 0 nickel(s). 0 pennie(s). ", testChange.changeMaker(25));
  }

  @Test
  public void changeMaker_returnChangeString_oneDime(){
    CoinCombinations testChange = new CoinCombinations();
    assertEquals("0 quarter(s). 1 dime(s). 0 nickel(s). 0 pennie(s). ", testChange.changeMaker(10));
  }

  @Test
  public void changeMaker_returnChangeString_oneNickel(){
    CoinCombinations testChange = new CoinCombinations();
    assertEquals("0 quarter(s). 0 dime(s). 1 nickel(s). 0 pennie(s). ", testChange.changeMaker(5));
  }

  @Test
  public void changeMaker_returnChangeString_onePenny(){
    CoinCombinations testChange = new CoinCombinations();
    assertEquals("0 quarter(s). 0 dime(s). 0 nickel(s). 1 pennie(s). ", testChange.changeMaker(1));
  }

  @Test
  public void changeMaker_returnChangeString_oneQuarterOneNickel(){
    CoinCombinations testChange = new CoinCombinations();
    assertEquals("1 quarter(s). 0 dime(s). 1 nickel(s). 0 pennie(s). ", testChange.changeMaker(30));
  }

  @Test
  public void changeMaker_returnChangeString_threeQuartersOneDimeFourPennies(){
    CoinCombinations testChange = new CoinCombinations();
    assertEquals("3 quarter(s). 1 dime(s). 0 nickel(s). 4 pennie(s). ", testChange.changeMaker(89));
  }

}
