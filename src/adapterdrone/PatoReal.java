package adapterdrone;

public class PatoReal implements Pato {

    @Override
    public void cuaquear() {
        System.out.println("Cua Cua");
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando");
    }
}