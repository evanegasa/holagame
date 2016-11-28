package Data;

public class Casilla {

    private final String squareName;
    private final int positionControl;
    private final int turnControl;
    private final String actionDescription;
    private final boolean isCreature;

    public Casilla(String squareName, int positionControl, int turnControl, String actionDesciption, boolean isCreature) {
        this.squareName = squareName;
        this.positionControl = positionControl;
        this.turnControl = turnControl;
        this.actionDescription = actionDesciption;
        this.isCreature = isCreature;
    }
    
    public String getSquareName() {
        return squareName;
    }

    public int getPositionControl() {
        return positionControl;
    }

    public int getTurnControl() {
        return turnControl;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public boolean isCreature() {
        return isCreature;
    }
}
