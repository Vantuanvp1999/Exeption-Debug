public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a<=0 || b<=0 || c<=0) {
            throw new IllegalTriangleException("Các cạnh tam giác phải là số dương ");
        }
        if (a+b<c ||a+c<b ||b+c<a ) {
            throw new IllegalTriangleException(" Tổng hai cạnh tam giác phải lớn hơn cạnh còn lại");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
