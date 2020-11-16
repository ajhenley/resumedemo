package com.byaj;

import java.util.ArrayList;

public class Resume {
    private String name;
    private String phone;
    private String email;
    private String linkedin;
    private ArrayList<Job> experience = new ArrayList<Job>();
    private ArrayList<Education> education = new ArrayList<Education>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public ArrayList<Job> getExperience() {
        return experience;
    }

    public void setExperience(ArrayList<Job> experience) {
        this.experience = experience;
    }

    public void addExperience(Job job)
    {
        this.experience.add(job);
    }

    public ArrayList<Education> getEducation() {
        return education;
    }

    public void setEducation(ArrayList<Education> education) {
        this.education = education;
    }
}
