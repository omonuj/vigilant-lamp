package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TableArrayTest {
    

    @Test
    public void test() {
        TableArray blue = new TableArray();
        int [][] array = {
            {1,0,1},
            {1,0,1},
            {1,0,1}
        };
        int [][] exact = blue.tableDisplay(array);
        String [][] expect = {{"*", "  ", "*"}, {"*", "  ", "*"}, {"*", "  ", "*"}};
        assertArrayEquals(expect, exact);


    }

}
