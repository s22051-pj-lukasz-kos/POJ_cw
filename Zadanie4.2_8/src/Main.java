public class Main {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1, 2, 3, 4);
        System.out.println("Input data");
        System.out.println(mp.toString());
        mp.moveUp();
        mp.moveRight();
        System.out.println("After moveUp and moveRight");
        System.out.println(mp.toString());
    }
}
