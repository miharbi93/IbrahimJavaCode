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