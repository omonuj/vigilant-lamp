package bank;



public class PollingApp {

    private static final int[][] RESPONSES= new int[5][10];
    private static final String[] TOPICS = {"Peternity", "Electric", "Finance", "Actual", "Most"};

    public String[] getTopics() {
        return TOPICS;
    }

    public int[][] getResponses() {
        return RESPONSES;
    }

    public void RateIssue(int issue, int rating) {
       issue -= 1;
       int [] issueToRate = RESPONSES[issue];
       rating -= 1;
       issueToRate[rating] = ++issueToRate[issue];


    }
}
