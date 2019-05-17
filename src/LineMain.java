public class LineMain {
    public static void main(String[] args) {
        LineCompare compare = new LineCompare();

        Line line1 = new Line(1,10);
        Line line2 = new Line(1,15);

        int length1 = line1.lineLenght();
        int length2 = line2.lineLenght();

        System.out.println(length1);
        System.out.println(line2.lineLenght());

        compare.compareLines(length1,length2);






    }
}
