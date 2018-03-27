import java.awt.*;

public class WhiteTiger extends Tiger {
    boolean hasInfected;

    public WhiteTiger(){
        hasInfected=false;
    }


    public Color getColor() {
        //Always Color.WHITE.
        return Color.WHITE;
    }


    public String toString() {
        //"tgr" if it hasn’t infected another Critter yet, “TGR” if it has infected.
        if (hasInfected){
            return super.toString();
        } else {
            return "tgr";
        }
    }


    public Action getMove(CritterInfo info) {
        //Same as a Tiger.
        // Note: you’ll have to override this method to figure out if it has infected another Critter.
        if (info.getFront()==Neighbor.OTHER){
            hasInfected=true;
        }
        return super.getMove(info);

    }
}
