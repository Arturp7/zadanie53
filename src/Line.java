import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Line {
    double pointX1;
    double pointX2;
    double pointY1;
    double pointY2;

    public Line(double pointA, double pointB, double pointC, double pointD) {
        this.pointX1 = pointA;
        this.pointX2 = pointB;
        this.pointY1 = pointC;
        this.pointY2 = pointD;
    }

    double lineLenght (){
        double result = sqrt((pointX2 - pointX1)*(pointX2 - pointX1)+(pointY2 - pointY1)*(pointY2 - pointY1));
        return result;
      }




}