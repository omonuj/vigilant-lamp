package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockTest {

    @Test
    public void test() {
        Stock oracleStock = new Stock("ORCL", "Oracle Corporatio");
        oracleStock.setPreviousClosingPrice(34.5);
        oracleStock.setCurrentPrice(35.5);
        assertEquals(1.0, oracleStock.getChangePercent());

        System.out.println(oracleStock);
        System.out.println("The price change is: " + oracleStock.getChangePercent());
    }

}
