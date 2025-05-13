package com.ems.Event.Management.System.dto;

import java.time.LocalDateTime;

public class RegistrationDTO {
    private Long registrationId;
    private String userName;
    private String eventName;
    private LocalDateTime registrationDate;

    // Constructor
    public RegistrationDTO(Long registrationId, String userName, String eventName, LocalDateTime registrationDate) {
        this.registrationId = registrationId;
        this.userName = userName;
        this.eventName = eventName;
        this.registrationDate = registrationDate;
    }

    // Getters and Setters
    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }
}
