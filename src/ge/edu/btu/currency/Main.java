package ge.edu.btu.currency;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;
import org.apache.log4j.Logger;

public class Main  {
    final static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
CurrencyService currencyService = new CurrencyServiceImpl();
        currencyService.setExchangeRate(3);
        System.out.println(currencyService.convert(4));
        logger.info("კონვერტაციის შედეგია " +currencyService.convert(20));
        System.out.println(currencyService.convert(50));

        logger.info("კონვერტაციის შედეგია " +currencyService.convert(100));
    }
}
