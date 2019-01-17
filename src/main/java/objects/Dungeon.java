package objects;

import objects.character.GameCharacter;
import objects.event.Fight;
import objects.location.Location;
import objects.location.room.FightRoom.FightRoom;
import objects.location.room.FightRoom.RatRoom;

public class Dungeon {
    private GameCharacter[] party;
    private Location  actualRoom;

    public Dungeon(GameCharacter[] party) {
        this.party = party;
        actualRoom = new RatRoom();
    }

    public Location getActualRoom() {
        return actualRoom;
    }

    public void setActualRoom(Location actualRoom) {
        this.actualRoom = actualRoom;
    }

    public GameCharacter[] getParty() {
        return party;
    }

    public Fight startFight() {
        return ((FightRoom) actualRoom).fight(party);
    }
}
