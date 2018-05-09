package tank;

/*Создать класс танк, описать его возможные методы, создать и вывести в классе Main*/

public class TankMain {

    public static void main(String[] args) {
        Tank myTank = new Tank();

        myTank.moveForward();
        myTank.moveBack();
        myTank.moveLeft();
        myTank.moveRight();
        myTank.fire();
    }
}
