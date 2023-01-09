class MyOwnAutoShop{
    public static void main(String[] args){

        Car gari = new Car(30,2234,"Black");

        System.out.println(gari.getSalesPrice());

        //Ford fodi = new Ford();

        Ford fodi = new Ford(56,4000,"White",1999,577);

        Truck tr = new Truck(15,55.0,"Silver",55);

        gari.getSalesPrice();

        System.out.println(gari.getSalesPrice());
        System.out.println(fodi.getSalesPrice());
        System.out.println(tr.getSalesPrice());
    }
}