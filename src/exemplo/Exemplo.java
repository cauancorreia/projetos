
package exemplo;

public class Exemplo {

    public static void main(String[] args) {
        mamifero cachorro= new mamifero();
        ave galinha= new ave();
        REPTEIS jacare= new REPTEIS();
        
        cachorro.setNome("marley");
        cachorro.setIdade(4);
        cachorro.setPeso(10.7);
        cachorro.setPelo("marron");
        cachorro.alimento();
        cachorro.locomover();
        
          galinha.setNome("jurema");
          galinha.setIdade(10);
          galinha.getPeso(8.8);
          galinha.setPenacor("verde");
          galinha.alimento();
          galinha.locomover();
          
          jacare.setNome("lacoste");
          jacare.setIdade(15);
          jacare.alimento();
          jacare.locomover();
          
          
          
    }
    
}
