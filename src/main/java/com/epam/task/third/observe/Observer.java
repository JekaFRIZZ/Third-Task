package com.epam.task.third.observe;

import com.epam.task.third.entities.Quadrilateral;

public interface Observer {
    void update(Quadrilateral quadrilateral);
    void addObservable();
    void deleteObservable();
}
