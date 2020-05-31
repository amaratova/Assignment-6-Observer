package com.assign6observer;

public class Main {

    public static void main(String[] args) {
        PostOffice postoffice = new PostOffice();
        Subscribers s1 = new Subscribers("Akniyet");
        Paper p = new Paper("Akniyet", "Semey", "There is a new magazine for you");

        postoffice.attach(s1);

        postoffice.addPaper(p);
    }
}
