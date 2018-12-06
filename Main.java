
public class Main {
    public static boolean module = false;
    public static void main(String[] args) {
        System.out.println("perfect square:");

        int a = 0;
        while (a < 10) {
            a++;
            double answer = Math.pow(a, 2);
            System.out.println(answer);
        }
        System.out.println("Perfect Cubes:");

        int e = 0;
        while (e < 10) {
            e++;
            double answer = Math.pow(e, 3);
            System.out.println(answer);
        }
        System.out.println("\nFibonacci Sequence");
        {
            System.out.println("\nPrime Numbers");

            int p = 2;
            int i = p/2;
            
            do {
                p++;

                int h = p % i ;

                if (h == 0) {
                    module = true;

                break;}


                if (!module)
                    System.out.printf("%d ", h);
            }while (p<30);
            System.out.println();
    }


    }
}