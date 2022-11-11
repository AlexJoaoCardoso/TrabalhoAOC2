package cachesimulator;

import java.util.Scanner;

/**
 * @author willian
 * @author Alexandre
 */
public class cache_simulator {

    public static void main(String[] args) {
        int flag = 0;//flag para o menu
        Scanner s = new Scanner(System.in);
        Input input = new Input();
        System.out.println("--------------Cache Simulator--------------");
        System.out.println("Digite sua entrada de acordo com a seguinte regra");
        System.out.println("cache_simulator <nsets> <bsize> <assoc> <substituição> <flag_saida> arquivo_de_entrada");
        while(flag == 0){
            input.inputCode();
            Cache cache = new Cache(input);
            cache.codeCache();
            cache.resultado();
            System.out.println("\nDeseja colocar mais uma entrada? 0 = SIM ; 1 = NAO");
            flag = s.nextInt();
            System.out.println("----------------------------");
        }
        
     
        
    }

}
