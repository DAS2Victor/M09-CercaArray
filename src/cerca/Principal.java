
package cerca;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        try {
            int X = 1000;
            int[] nombres = new int[X];
            Random r = new Random();
            for (int i=0; i<X; i++){
                nombres[i] = r.nextInt(100*X);
            }
            
            int N=10;
            Fil[] fils = new Fil[N];
            for (int i=0;i<N; i++){
                fils[i] = new Fil(i*X/N, (i+1)*X/N-1, nombres);
                fils[i].start();
            }
            
            int[] maxims = new int[N];
            for (int i=0;i<N; i++){
                fils[i].join();
                maxims[i]=fils[i].getMaxim();
            }
            
            Fil ultim = new Fil(0,N-1, maxims);
            ultim.start();
            ultim.join();
            System.out.println(ultim.getMaxim());   

        } catch (InterruptedException ex) {
            
        }
        
    }
    
}
