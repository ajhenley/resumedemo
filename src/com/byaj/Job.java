package com.byaj;

public class Job {
    private String title;
    private String organization;
    private String timeperiod;
    private String location;



    public Job(String title, String organization, String timeperiod, String location) {
        this.title = title;
        this.organization = organization;
        this.timeperiod = timeperiod;
        this.location = location;
    }

    public Job() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getTimeperiod() {
        return timeperiod;
    }

    public void setTimeperiod(String timeperiod) {
        this.timeperiod = timeperiod;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
