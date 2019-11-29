package net.munki.play.listeners;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class EspressoListener implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt);
    }
}
