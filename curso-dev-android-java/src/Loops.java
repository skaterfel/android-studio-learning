public class Loops {
    public static void main(String[] args){
        int u = 0;
        while (u < 10) {
            System.out.println("Num: " + (u + 1));
            ++u;
        }

        System.out.println("-");
        System.out.println("-");

        for (int i = 0; i < 10; i++){
            System.out.println("Num: " + (i + 1));
            System.out.println("for--------------\");");

        }

        int w = 1;
        while(w<=5){
            System.out.println("-----: " + w);
            System.out.println("while--------------");
            w++;
        }

        w = 1;

        do {
            System.out.println("-----: " + w);
            System.out.println("do while--------------");
            w++;  
            

        } while (w<=5);




        for(int h = 1;h<=5;h++){
            System.out.println("fiz o for corretamente");
        }
    }
 
}
