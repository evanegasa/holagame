package BusinessLogic;

public class ControlJuego {
    
    public static int rollDie() {
        return (int) (Math.random() * 6 + 1);
    }
    
    public static int rollDice() {
        return ui.GameFrame.roll();
    }

}
