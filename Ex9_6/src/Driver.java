public class Driver{
    public static void main(String[] args){

        Truck t = new Truck(3.1,3.4,"leehyoungwook","honggill",3);
        Truck t1= new Truck(3.1,3.4,"leeHyoungWook","HongGill",3);
        t.writeOutput();
        t1.writeOutput();
        System.out.println(t.equals(t1));
    }
}