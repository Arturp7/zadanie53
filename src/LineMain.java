public class LineMain {
    public static void main(String[] args) {
        LineCompare compare = new LineCompare();

        Point pointA = new Point(155.0,3.0);
        Point pointB = new Point(4.0,2.0);
        Point pointC = new Point(6.0,8.0);
        Point pointD = new Point(17.0,10.0);


        Line line1 = new Line(pointA.coordinateX1,pointA.coordinateX2,pointB.coordinateX1,pointB.coordinateX2);
        Line line2 = new Line(pointC.coordinateX1,pointC.coordinateX2,pointD.coordinateX1,pointD.coordinateX2);


        double length1 = line1.lineLenght();
        double length2 = line2.lineLenght();

        System.out.println(length1);
        System.out.println(line2.lineLenght());

        compare.compareLines(length1,length2);






    }
}
