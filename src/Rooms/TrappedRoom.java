package Rooms;

import Game.Runner;
import People.Person;

public class TrappedRoom extends Room
{
    public TrappedRoom(int x, int y)
    {
        super(x, y);
    }
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("The room was trapped. You died.");
        Runner.gameOff();
    }
}
