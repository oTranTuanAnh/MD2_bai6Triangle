public class Triangle extends Shape{
    private double size1, size2, size3;

    public Triangle() {
        this.size1 = 1;
        this.size2 = 1;
        this.size3 = 1;
    }

    public Triangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public double getPerimeter(){
        if (((this.size1+this.size2)>this.size3)&&
                (this.size2+this.size3)>this.size1&&
                (this.size1+this.size3)>this.size2){
            return (this.size1 + this.size2 + this.size3);
        } else {
            return -1;
        }

    }
    public double getArea(){
        double p = this.getPerimeter()/2;
        if (p>0){
        return Math.sqrt(p*(p-this.size1)*(p-this.size2)*(p-this.size3));
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "size1=" + size1 +
                ", size2=" + size2 +
                ", size3=" + size3 +
                ", color= " + super.getColor()+
                "} \n" + "Perimeter = "+ this.getPerimeter()+ "\n" +
                "Area = " + this.getArea();
    }
}
