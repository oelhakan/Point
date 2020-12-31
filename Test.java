public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(5,5);
        Point point2 = new Point(10,10);
        System.out.println("Distance between point (" + point1.getX() + "," + point1.getY() + ") and (0,0) is : " + point1.distance());
        System.out.println("Distance between point (" + point1.getX() + "," + point1.getY() + ") and (2,2) is : " + point1.distance(2,2));
        System.out.println("Distance between point (" + point1.getX() + "," + point1.getY() + ") and (" + point2.getX() + "," + point2.getY() +
                ") is : " + point1.distance(point2));

    }
}
