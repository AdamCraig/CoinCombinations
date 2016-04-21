import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main (String[] args){
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template" ,"templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      HashMap model = new HashMap();
      CoinCombinations testChange = new CoinCombinations();
      String changeString = request.queryParams("changeInput");
      Integer changeInteger = Integer.parseInt(changeString);
      model.put("change", testChange.changeMaker(changeInteger));
      model.put("template", "templates/result.vtl");
      return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
    }
}
