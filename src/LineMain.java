public class LineMain {
    public static void main(String[] args) {
        LineCompare compare = new LineCompare();

        Line line1 = new Line(1.0,5.0,10.0, 3.0);
        Line line2 = new Line(1.0,15., 5., 5. );

        double length1 = line1.lineLenght();
        double length2 = line2.lineLenght();

        System.out.println(length1);
        System.out.println(line2.lineLenght());

        compare.compareLines(length1,length2);






    }
}
