
package exemplo;

public class mamifero extends Animal {
private String pelo;

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
    @Override
    public void locomover() {
        System.out.println("CORRENDO"); 
    }

    @Override
    public void som() {
        System.out.println("AUUUUUUUUU AHHHHHHH");
    }

    @Override
    public void alimento() {
        System.out.println("Mamando");
        
        
    }
    public void caco(){
            System.out.println("caçamdo");    
    }
}
