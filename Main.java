
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
        int b=0;
        int c=1;
        int d=1;
        while(d<11) {
            int output = b + c;
            System.out.print(output + " ");
            b = c;
            c = output;
            d = d + 1;
        }

            int f=1;
            int g=1;
            System.out.println("\nPrime Numbers");
            while(g<=10){
                while (f<30){
                    f++;
                    boolean primenum= true;
                    int h=1;
                    while (h<=f/3){
                        h=h+1;
                        if (f%h==0){
                            primenum = false;
                            break;
                        }
                    }
                    if (primenum) {
                        System.out.println(f+" ");
                    }
                }
                g=g+1;
            }
            System.out.println("Traingle Numbers");
            int i=1;
            while (i<10){
                int equals= (i*(i+1))/2;
                System.out.println(equals+" ");
                i=i+1;
            }


    }


    }