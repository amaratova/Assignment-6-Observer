package com.assign6observer;

import java.util.ArrayList;

public class Subscribers implements Observer {
    String name;

    public Subscribers(String name) {
        this.name = name;
    }

    public void checkPaper(ArrayList<Paper> p) {
        for (Paper paper : p)
            if (name.compareTo(paper.receiverName) == 0)
                System.out.println("from Publisher's house to " + name + ": " + paper.content);
    }

    public void update(Object obj) {
        if (obj instanceof PostOffice) {
            PostOffice po = (PostOffice) obj;
            checkPaper(po.getState());
        }
    }
}
