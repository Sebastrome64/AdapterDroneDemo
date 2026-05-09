package adapterdrone;
public class AdaptadorDroneDemo {
    public static void main(String[] args) {
        Pato pato = new PatoReal();

        Drone drone = new SuperDrone();
        Pato adaptadorDrone = new AdaptadorDrone(drone);

        System.out.println("El pato dice:");
        testPato(pato);

        System.out.println("\nEl drone adaptado como pato dice:");
        testPato(adaptadorDrone);
    }

    public static void testPato(Pato pato) {
        pato.cuaquear();
        pato.volar();
    }
}