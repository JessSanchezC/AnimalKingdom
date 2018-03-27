import java.awt.*;

public class Giant extends Critter{
    private int moves;

    public Giant(){
        moves=1;
        getColor();
    }

    public Color getColor (){
        return Color.GRAY;
    }


    public String toString() {
        //"fee" for 6 moves, then "fie" for 6 moves, then "foe" for 6 moves, then "fum" for 6 moves, then repeat.
        if (moves<=6){
            return "fee";
        } else if (moves<=12){
            return "fie";
        } else if (moves<=18){
            return "foe";
        } else {
            return "fum";
        }
    }

    public Action getMove(CritterInfo info) {
        //always infect if an enemy is in front, otherwise hop if possible, otherwise turn right
        //track moves
        if (info.getFront()==Neighbor.OTHER){
            countMoves();
            return Action.INFECT;
        } else if(info.getFront()==Neighbor.EMPTY){
            countMoves();
            return Action.HOP;
        } else {
            countMoves();
            return Action.RIGHT;
        }
    }

    public void countMoves(){
        if (moves==24){
            moves=1;
        } else {
            moves++;
        }
    }
}
