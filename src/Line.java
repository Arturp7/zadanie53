import static java.lang.Math.sqrt;

public  class Line{

    double pointX1;
    double pointX2;
    double pointY1;
    double pointY2;

    Line(double pointX1, double pointX2, double pointY1, double pointY2   ){
        this.pointX1 = pointX1;
        this.pointX2 = pointX2;
        this.pointY1 = pointY1;
        this.pointY2= pointY2;

    }

    double lineLenght (){
        double result = sqrt((pointX2 -pointX1)*(pointX2 - pointX1)+(pointY2 - pointY1)*(pointY2 - pointY1));
        return result;
    }

}
