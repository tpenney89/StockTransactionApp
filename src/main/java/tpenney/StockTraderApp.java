package tpenney;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Client code for the StockService application.
 */
public class StockTraderApp {

    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
        Timestamp fromDate = new Timestamp(Calendar.getInstance().getTimeInMillis());
        Timestamp untilDate = new Timestamp(Calendar.getInstance().getTimeInMillis());
        StockTransaction stockTransactionQuote = new DummyStockService().getQuote(StockSymbolType.APPL,timestamp);
        List<StockTransaction> stockTransactionArray = new ArrayList<>();
    }
}
