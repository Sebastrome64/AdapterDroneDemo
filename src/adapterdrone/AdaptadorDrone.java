package adapterdrone;
public class AdaptadorDrone implements Pato {

    private Drone drone;

    public AdaptadorDrone(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void cuaquear() {
        drone.beep();
    }

    @Override
    public void volar() {
        drone.despegar();
        drone.girarRotor();
    }
}