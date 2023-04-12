package strategy;

public class TestStrategy {
    public static void main (String[] args){
        NormalBehavior normal = new NormalBehavior();
        DefenseBehavior defense = new DefenseBehavior();
        AgressiveBehavior agressive = new AgressiveBehavior();

        Robot robot = new Robot();
        robot.setStrategy(normal);
        robot.move();
        robot.setStrategy(defense);
        robot.move();
        robot.setStrategy(agressive);
        robot.move();

    }
}
