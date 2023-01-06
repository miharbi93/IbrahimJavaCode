public class Car{
    private int speed;
    private double regularPrice;
    private String color;

    Car(int speed,double regularPrice,String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalesPrice(){
        return regularPrice;
    }


    public class Truck extends Car{
        public int weight;

        Truck(int speed,double regularPrice,String color,int weight){
            super(speed,regularPrice,color);
            
            this.weight = weight;
        }
        @Override
        public double getSalesPrice(){
            if(weight > 2000){
                return regularPrice * 0.9;
            }else{
                return regularPrice * 0.8;
            }
        }
    }

    private class Ford extends Car{
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

    public class Sedan extends Car{
        public int length;

        public Sedan(int speed,double regularPrice,String color,int length){
            super(speed,regularPrice,color);

            this.length = length;
        }


        public double getSalesPrice(){
            if(length > 20){
                return regularPrice * 0.95;
            }else{
                return regularPrice * 0.9;
            }
        }

    }
}