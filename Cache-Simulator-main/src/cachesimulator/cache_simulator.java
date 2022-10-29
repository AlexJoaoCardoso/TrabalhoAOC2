package cachesimulator;

/**
 * @author willian
 */
public class cache_simulator {

    public static void main(String[] args) {

        Input input = new Input();
        System.out.println("cache_simulator  <nsets>  <bsize>  <assoc>  <substituição>   <flag_saida>  arquivo_de_entrada");
        input.inputCode(); // Pede os valores da cache e um arquivo entrada;
        Cache cache = new Cache(input);
        cache.codeCache();//Inicia o calculo da cache;
        cache.resultado();//Fala o resultado do calculo;
        
    }

}
