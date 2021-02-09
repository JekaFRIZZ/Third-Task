package com.epam.task.third.observe;

import com.epam.task.third.entities.Quadrilateral;

import java.util.ArrayList;
import java.util.List;

public class QuadrilateralObservable extends Quadrilateral {
    private final List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
        observer.addObservable();
    }

    public void detach(Observer observer) {
        observer.deleteObservable();
        observers.remove(observer);
    }

    private void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }
}
