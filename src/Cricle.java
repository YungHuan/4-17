public class Cricle extends Shape {
    double redius;
    public Cricle(double r){
        redius=r;
    }
    public void Area(){
        System.out.println("Area="+(PI*redius*redius));
    }
    public void Perimeter(){
        System.out.println("Perimeter="+(2*redius)*PI);
    }
}
