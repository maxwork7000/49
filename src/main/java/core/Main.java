package core;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {

       public static void main(String[] args) throws Exception {

              String us_currency_symbol = "$";

              String ip_Euro    = "88.191.179.56";

              String ip_Yuan    = "61.135.248.220";

              String ip_Pound   = "92.40.254.196";

              String ip_Hryvnia = "93.183.203.67";

              String ip_Ruble   = "213.87.141.36";

              Logger logger = Logger.getLogger(""); logger.setLevel(Level.OFF);

 
             String url = "https://www.amazon.com/Echo-Dot-3rd-Gen-Sandstone/dp/B07PGL2N7J";

             String title_id = "productTitle";

             String price_id = "priceblock_ourprice";

//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////

       String original_price;
	String rate;
	double eur_price = new BigDecimal(original_price * rate).setScale(2, RoundingMode.HALF_UP).doubleValue();

       String currency_symbol;
	String country_name;
	String product_title;
	System.out.println("Item: " + product_title + "; "

                                   + "US Price: " + us_currency_symbol + original_price + "; "

                                   + "for country: " + country_name + "; "

                                   + "Local Price: " + currency_symbol + eur_price);

    }

}
