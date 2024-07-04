
package exemplo;

public class ave extends Animal {
private String penacor;

    public String getPenacor() {
        return penacor;
    }

    public void setPenacor(String penacor) {
        this.penacor = penacor;
    }
    @Override
    public void locomover() {
        System.out.println("VOANDO");
    }

    @Override
    public void som() {
        System.out.println("COCORICOOO");
    }

    @Override
    public void alimento() {
        System.out.println("pequenos insetos e filhotes de animais");
    }
    
    public void planar (){
        System.out.println("planando no ar");
    }

    void getPeso(double d) {
    }
}
