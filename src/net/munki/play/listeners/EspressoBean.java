package net.munki.play.listeners;

import java.beans.*;

public class EspressoBean {
    private int strength = 90;
    private PropertyChangeSupport pcs =
        new PropertyChangeSupport(this);

    public int getStrength() {
        return strength;
    }
    
    public void setStrength(int s) {
        int oldStrength = strength;
        strength = s;
        pcs.firePropertyChange("strength",
                                   oldStrength, s);
    }

    public void
    addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }
    
    public void
    removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}
