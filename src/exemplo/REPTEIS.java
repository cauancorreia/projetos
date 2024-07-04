package exemplo;

public class REPTEIS extends Animal {
private String escamas;

    

    public void setEscamas(String escamas) {
        this.escamas = escamas;
    }
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void som() {
        System.out.println("shishishisisisi");
    }

    @Override
    public void alimento() {
        System.out.println("frutas e vegetais"); 
    }
    public void porlingua(){
        System.out.println("pondo a lingua de fora");
    }

    public String getEscamas() {
        return escamas;
    }

    

}
