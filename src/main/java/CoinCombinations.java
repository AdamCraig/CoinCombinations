import java.util.Map;
import java.util.HashMap;

  public class CoinCombinations {
    public static String changeMaker (Integer change){
      String changeMade = "";
      Integer quartersDispensed = 0;
      Integer dimesDispensed = 0;
      Integer nickelsDispensed = 0;
      Integer penniesDispensed = 0;

      while (change > 0) {
        if (change - 25 >= 0) {
          change -= 25;
          quartersDispensed++;
        } else if (change - 10 >= 0) {
          change -= 10;
          dimesDispensed++;
        } else if (change - 5 >= 0) {
          change -= 5;
          nickelsDispensed++;
        } else if (change - 1 >= 0) {
          change -= 1;
          penniesDispensed++;
        }
      }

      changeMade = quartersDispensed + " quarter(s). " + dimesDispensed + " dime(s). " + nickelsDispensed + " nickel(s). " + penniesDispensed + " pennie(s). ";

      return changeMade;

      // while (change > 0){
      //
      // }

    }
  }
