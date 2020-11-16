package com.byaj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Resume zwres = new Resume();
        zwres.setName("Zakiyah Walker");
        zwres.setPhone("5551212");
        zwres.setEmail("z@walker.com");
        zwres.setLinkedin("linkedin.com/zwalk");
        Job j = new Job("CISO","NSA","2020-2022","Laurel, Maryland");
        zwres.addExperience(j);
        j = new Job("CISO","NBC Universal","2022-2024","Hollywood, CA");
        zwres.addExperience(j);
        System.out.println(zwres);
    }
}
