package tpenney;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;


public class StockTransactionTest {

    BigDecimal price;
    Timestamp timestamp;
    StockSymbolType stockSymbol;
    StockTransaction myStockTransaction;


    @Before
    public void setStock(){
        this.price = new BigDecimal(100);
        this.timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
        this.stockSymbol = StockSymbolType.APPL;
        this.myStockTransaction = new StockTransaction(price,stockSymbol,timestamp);
    }

    @Test
    public void getPrice(){
        assertEquals("Verify price is correct", this.price, myStockTransaction.getPrice());
    }

    @Test
    public void getStockSymbol(){
        assertEquals("Verify price is correct", this.stockSymbol, myStockTransaction.getStockSymbol());
    }

    @Test
    public void getTime() {
        assertEquals("Verify timestamp is correct", this.timestamp, myStockTransaction.getTime());
    }


    @Test
    public void getToString(){
        assertNotNull("Verify string is built",myStockTransaction.toString());
    }
}
