package net.munki.play.listeners;

public class EspressoDemo {

    public static void main(String args[]) {
        EspressoBean eb = new EspressoBean();
        eb.addPropertyChangeListener(new EspressoListener());
        eb.setStrength(100);
    }
}