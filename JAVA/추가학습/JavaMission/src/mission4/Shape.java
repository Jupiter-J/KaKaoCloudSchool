package mission4;

public abstract class Shape {
    protected Point point;

    public Shape() {
    }

    public Shape(Point point) {
        super(); //사용한 이유는? - 상위클래스 생성자 호출
        this.point = point;
    }

    public abstract double getArea();

    public abstract double getCircumference();

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
