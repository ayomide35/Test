import java.util.Random;
public class Ay {
    public static void main(String [] args){
        Random random = new Random();

        int age;
        double price;
        age= random.nextInt(1 , 6);
        price = random.nextDouble(1.0 , 6.0);
        System.out.println(age);
        System.out.println(price);


    }
}
