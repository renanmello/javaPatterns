package strategy;

public class AgressiveBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Agressive move");
    }
}
