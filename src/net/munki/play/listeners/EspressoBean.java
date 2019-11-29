package net.munki.play.listeners;

import java.beans.*;

public class EspressoBean {
    private int strength = 90;
    private final PropertyChangeSupport pcs =
        new PropertyChangeSupport(this);

    public int getStrength() {
        return strength;
    }
    
    public void setStrength(final int s) {
        final int oldStrength = strength;
        strength = s;
        pcs.firePropertyChange("strength",
                                   oldStrength, s);
    }

    public void
    addPropertyChangeListener(final PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }
    
    public void
    removePropertyChangeListener(final PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}
