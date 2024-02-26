import java.util.Random;

public class Dummy {
    public static void main(String[] args) {
//        int i , k =1;
//        i = k + 2;
//
//        System.out.println(i);
//        int i = 1;
//        boolean b = (boolean)i;
//        System.out.println(56 % 6);
//        System.out.println(78 % -4);
//        System.out.println(-37 % -5);
//        System.out.println(-7 % 3);
//        System.out.println((2 + 100)% 7);

//        Scanner input = new Scanner(System.in);
//        System.out.println(" Enter a score number");
//        double score = input.nextDouble();
//        double pay = 10;
//
//        if (score > 90){
//            System.out.println( pay + (pay * 0.9));
//        } else
//            System.out.println(pay + (pay * 0.1));

//        for (int i = 0; i < 10; i++)
//            for (int j = 0; j < i; j++)
//                System.out.println(i * j);
        //generate a random  singl-digit interger (between 0 and 9)
//        int number1 = (int)(Math.random() * 10);
//        System.out.println("number1 is " + number1);
//        int number2 = (int)(Math.random() * 21);
//        System.out.println("Number2 is " + number2);

//        how to generate a random integer i such that 0<= i < 20?
//        Random random = new Random();
//
//        // Generate a random integer between 0 (inclusive) and 20 (exclusive)
//        int i = random.nextInt(20);
//
//        System.out.println("Random integer: " + i);

 //       how to generate a random integer i such that 10<= i < 20?
//        Random random = new Random();
//
//        // Generate a random integer between 10 (inclusive) and 20 (exclusive)
//        int i = random.nextInt(10) + 10;
//
//        System.out.println("Random integer: " + i);

//       How  to generate a random  integer  i such that 10 <= i <= 50?

         Random random = new Random();
         int i = random.nextInt(50) ;

         System.out.println("Random integer: " + i);

    }
}
