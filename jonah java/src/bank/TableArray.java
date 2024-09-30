package bank;

public class TableArray {
    public int [][] tableDisplay(int [][] array) {

        for (int index = 0; index < array.length; index++) {
            for (int column = 0; column < array[index].length; column++) {
                if (array[index][column] == 1) {
                    array[index][column] = Integer.parseInt("*");
                } else if(array[index][column] == 0) {
                    array[index][column] = Integer.parseInt(" ");
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int [][] array = {
                {1,1,0},
                {0,1,0},
                {1,1,0}
        };
            TableArray ta = new TableArray();
            ta.tableDisplay(array);
    }
}
