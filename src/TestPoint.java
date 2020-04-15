public class TestPoint {

    public static void main(String[] args) {

        MoveAblePoint moveAblePoint1 = new MoveAblePoint(0,0,10,5);

        moveAblePoint1.move();
        System.out.println(moveAblePoint1.getX()+","+moveAblePoint1.getY());
    }
}
