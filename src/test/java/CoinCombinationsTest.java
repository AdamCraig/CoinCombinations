import org.junit.*;
import org.fluentlenium.adapter.FluentTest;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class CoinCombinationsTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Please enter your change");
  }

  @Test public void resultTest() {
    goTo("http://localhost:4567/");
    fill("#changeInput").with("25");
    submit(".btn");
    assertThat(pageSource()).contains("1 quarter(s). 0 dime(s). 0 nickel(s). 0 pennie(s). ");
  }

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
