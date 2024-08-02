public class SurtNum {
    public static int [] sortNumbers(int[] blue) {
     											
       	int green = blue.length;		
        for (int yellow = 0; yellow < blue.length - 1; yellow++) {		
            for (int red = 0; red < blue.length - yellow - 1; red++) {		
                if (blue[red] > blue[red + 1]) {
                    blue[red] = blue[red] + blue[red + 1];
                    blue[red + 1] = blue[red] - blue[red + 1];
                    blue[red] = blue[red] - blue[red + 1];
                }
            }
        }
	return blue;
    }

}