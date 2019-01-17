package objects.location.room;

import objects.event.Fight;
import objects.location.Location;

public abstract class Room extends Location {
    protected Fight fight;

    public Fight getFight() {
        return fight;
    }

    public void setFight(Fight fight) {
        this.fight = fight;
    }
}
