import java.util.Map;
import java.util.HashMap;

  public class CoinCombinations {
    public static String changeMaker (Integer change){
      String changeMade = "";
      HashMap<Integer, String> coin = new HashMap<Integer, String>();
      coin.put(25,"quarter");
      coin.put(10,"dime");
      coin.put(5,"nickel");
      coin.put(1,"penny");

      changeMade = coin.get(change);

      return changeMade;

      // while (change > 0){
      //
      // }

    }
  }
