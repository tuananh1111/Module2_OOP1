public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB(double b) {
        return this.b;
    }

    public void setC() {
        this.c = c;
    }

    public double getC(double c) {
        return this.c;
    }

    public double getDiscriminant(double a, double b, double c) {
        double delta = this.b*this.b - 4 *this.a *this.c;
        System.out.println("Delta = "+delta);
        return delta;
    }

    public void getRoots(double delta) {
        double x1;
        double x2;
        if (delta > 0) {
            x1 = (double)((-this.b - Math.sqrt(delta)) / (2 * this.a));
            x2 =(double) ((-this.b + Math.sqrt(delta)) / (2 * this.a));
            System.out.println("Roots of the equation is: x1="+x1+ " x2= "+x2);
            return ;
        } else if (delta == 0) {
            x1 =(double) (-this.b / (2 * this.a));
            System.out.println("Roots of the equation is: x1=x2= "+x1);
            return;
        } else {
            System.out.println("The equation has no roots");
            return;
        }
    }

}
