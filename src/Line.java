import static java.lang.Math.abs;

public class Line {
    int pointA;
    int pointB;

    public Line(int pointA, int pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    int lineLenght (){
        int result = abs(pointA - pointB);
        return result;
      }


}