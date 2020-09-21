package tpenney;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;

public class DummyStockServiceTest {
    Timestamp timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
    StockTransaction stockTransaction = new StockTransaction(new BigDecimal(100),StockSymbolType.APPL,timestamp);

    @Test
    public void testStockTransaction(){
        assertNotNull("testStockTransactionConstruction failed", stockTransaction);
    }

}
