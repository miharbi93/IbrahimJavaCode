public class Ford extends Car{
    private int year;
    private int manufactureDiscount;

    public Ford(int speed,double regularPrice,String color,int year,int manufactureDiscount){
        super(speed,regularPrice,color);

        this.year = year;

        this.manufactureDiscount = manufactureDiscount;
        }

    public double getSalesPrice(){
        return super.getSalesPrice() - manufactureDiscount;
        }
    }