package prac.basics.java.codes.designprinciples;

public abstract class OCP_Shape {

    abstract void calculateArea();
}


class OCP_Circle extends OCP_Shape {

    double r = 5;

    @Override
    void calculateArea() {

        double area = 3.24 * r * r;

    }
}


class OCP_Rectanlge extends OCP_Shape {

    int l = 3;
    int b = 5;

    @Override
    void calculateArea() {

        int area = l * b;

    }
}
