package objects;

import objects.character.GameCharacter;
import objects.location.Location;
import objects.location.room.FightRoom.RatRoom;

public class Dungeon {
    private GameCharacter[] party;
    private Location  actualRoom;

    public Dungeon(GameCharacter[] party) {
        this.party = party;
        actualRoom = new RatRoom();
    }
}
