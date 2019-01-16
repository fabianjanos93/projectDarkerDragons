package objects.location.room.FightRoom;

import objects.character.GameCharacter;
import objects.location.room.Room;

public class FightRoom extends Room {
    GameCharacter[] enemyParty = new GameCharacter[4];

    public FightRoom(){
    }

    public FightRoom(GameCharacter[] enemyPart) {
        this.enemyParty = enemyPart;
    }


}
