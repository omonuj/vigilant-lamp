package Practise;

import java.time.LocalDateTime;

public class Emergency {

    private String callerName;
    private String callerPhoneNumber;
    private String emergencyLocation;
    private LocalDateTime reportTime;
    private String emergencyType;
    private String responseType;
    private String responseStatus;
    private String psapLocation;
    private double latitude;
    private double longitude;
    private int priorityLevel;
    private String emergencyDescription;
    private int responseTimeEstimate;
    private boolean isWirelessCell;

    public Emergency(String callerName, String callerPhoneNumber, String emergencyLocation, String emergencyType, String responseType, String emergencyDescription) {
        this.callerName = callerName;
        this.callerPhoneNumber = callerPhoneNumber;
        this.emergencyLocation = emergencyLocation;
        this.reportTime = LocalDateTime.now();
        this.emergencyType = emergencyType;
        this.responseType = responseType;
        this.responseStatus = "Reported";
        this.emergencyDescription = emergencyDescription;
    }

    public String getCallerName() {
        return callerName;
    }
}
