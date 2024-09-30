package bank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PollingTest {

    PollingApp pollingApp = new PollingApp();


    @Test
    public void testThatPollingClassExists() {
        assertNotNull(pollingApp);
    }

    @Test
    public void testThatPollingAppHas5Issues () {
        String[] topics = pollingApp.getTopics();
        System.out.println(Arrays.toString(topics));
        assertEquals(5, topics.length);
    }

    @Test
    public void testThatPollingAppIssuesExist () {
        String[] topics = pollingApp.getTopics();
        for (String topic : topics) {
            assertNotNull(topic);
        }
    }

    @Test
    @DisplayName("Polling app has 5 by 10 table for responses")
    public void testThatPollingAppHas5By10TableForStoringResponses() {
        int[][] responses = pollingApp.getResponses();
        int numberOfRows = responses.length;
        assertEquals(5, numberOfRows);
        for (int [] response : responses) {
            assertEquals(10, response.length);
        }
    }

    @Test
    public void testThatPollingAppCanStorePollingRatings () {
        pollingApp.RateIssue(5, 8);
        pollingApp.RateIssue(3, 2);
        pollingApp.RateIssue(4, 1);
        int[][] responses = pollingApp.getResponses();
        int fifthIssueResponse = responses[4][7];
        assertEquals(1, fifthIssueResponse);
        int thirdIssueResponse = responses[2][1];
        assertEquals(1, thirdIssueResponse);
        int fourthIssueResponse = responses[3][0];
        assertEquals(1, fourthIssueResponse);

        pollingApp.RateIssue(5, 8);


    }

}
