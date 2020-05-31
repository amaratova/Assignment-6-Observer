package com.assign6observer;

import java.util.ArrayList;

public class PostOffice implements Subject {
    private ArrayList<Paper> papers;
    private ArrayList<Observer> observers;

    public PostOffice()
    {
        papers = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addPaper(Paper p){
        papers.add(p);
        notifyObservers();
    }

    public ArrayList<Paper> getState() {
        return papers;
    }

    public void attach(Observer ob) {
        observers.add(ob);
    }

    public void detach(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++)
            observers.get(i).update(this);
    }
}
