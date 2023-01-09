public class Car{
    public int speed;
    public double regularPrice;
    public String color;

    Car(int speed,double regularPrice,String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalesPrice(){
        return regularPrice;
    }

}