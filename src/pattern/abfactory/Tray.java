package pattern.abfactory;

import java.util.ArrayList;

public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();

    public Tray(String captiion) {
        super(captiion);
    }

    public void add(Item item){
        tray.add(item);
    }
}
