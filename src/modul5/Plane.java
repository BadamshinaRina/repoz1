package modul5;

public class Plane {
    private int x, y, z;
    private int countBombs;
    private int fuel;
    private int dir = 0;

    public Plane() {
        this.x = 100;
        this.y = 100;
        this.z = 100;
        this.fuel = 100;
        this.countBombs = 5;
    }

    public Plane(int x, int y, int z, int countBombs, int fuel) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.countBombs = countBombs;
        this.fuel = fuel;
    }

    public void flyStraight(int i) { //указать на кол-во единиц прямо
        switch (dir) {
            case 0:
                this.x += i;
                break;
            case 1:
                this.y -= i;
                break;
            case 2:
                this.x -= i;
                break;
            case 3:
                this.y += i;
                break;
            default:
                System.out.println("Что то пошло не так");
                break;
        }
        this.fuel--;
        if (this.fuel <= 0 && this.z > 0) {
            System.out.println("Кончилось топливо(. Игра окончена");
        } else {
            System.out.println("Вы пролетели прямо и сейчас находитесь на координатах: x= " + this.x + ", y= " + this.y + ", z= " + this.z + ". Топлива осталось= " + this.fuel);
        }
    }

    private void flyStraightNonForPlayer(int i) { //указать на кол-во единиц прямо
        switch (dir) {
            case 0:
                this.x += i;
                break;
            case 1:
                this.y -= i;
                break;
            case 2:
                this.x -= i;
                break;
            case 3:
                this.y += i;
                break;
            default:
                System.out.println("Что то пошло не так");
                break;
        }
        fuel--;
    }

    public void flyUp(int up, int i) { //указать кол-во единиц вверх и кол-во единиц вперед
        flyStraightNonForPlayer(i);
        this.z += up;

        if (this.fuel <= 0 && this.z > 0) {
            System.out.println("Кончилось топливо(. Игра окончена");
        } else {
            System.out.println("Вы поднялись ввысь и сейчас находитесь на координатах: x= " + this.x + ", y= " + this.y + ", z= " + this.z + ". Топлива осталось= " + this.fuel);
        }
    }

    public void flyDown(int down, int i) { //указать кол-во единиц вверх и кол-во единиц вперед
        flyStraightNonForPlayer(i);
        this.z -= down;

        if (this.z <= 0) {
            this.z = 0;
            System.out.println("Самолет приземлился)))");
        } else {
            System.out.println("Вы опустились ниже и сейчас находитесь на координатах: x= " + this.x + ", y= " + this.y + ", z= " + this.z + ". Топлива осталось= " + this.fuel);
        }

    }

    public void fillFuel() {
        if (this.z > 0) {
            System.out.println("Нельзя заправляться в воздухе");
        } else {
            this.fuel += 100;
            if (this.fuel > 100) {
                this.fuel = 100;
            }
            System.out.println("Вы заправились. Сейчас топлива= " + this.fuel
            );
        }
    }

    public void dropBombs() {
        if (countBombs > 0) {
            countBombs--;
            System.out.println("Самолет сбросил бомбы по координатам x=" + this.x + ", y=" + this.y + ". Кол-во бомб= " + this.countBombs);
        } else {
            System.out.println("Нет ни одной бомбы");
        }
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) {
            dir = 3;
        }
        System.out.println("Вы повернули налево");
    }

    public void turnRight() {
        dir++;
        if (dir == 4) {
            dir = 0;
        }
        System.out.println("Вы повернули направо");
    }
    public void ShowFuel() {
        System.out.println("ТОплива осталось" + fuel);
    }
}
class PlaneTest {
    public static void main(String[] args) {

        Plane p1 = new Plane(100, 200, 300, 5, 3);
        p1.flyDown(50, 100);
        p1.turnLeft();
        p1.turnRight();
        p1.flyUp(50, 100);
        p1.flyDown(250,100);
        p1.ShowFuel();
        p1.dropBombs();
        p1.flyStraight(50);
        p1.fillFuel();
        p1.flyDown(400, 50);
        p1.fillFuel();


    }
}
