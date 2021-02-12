package powtorkasda.obiektowe.dziedziczenie;

public class MachineGun extends Gun{

    public void autoShot(){
        singleShot();
        System.out.println("Tratatatata");
    }

    public static void main(String[] args) {
        MachineGun gun = new MachineGun();
        gun.autoShot();
        gun.singleShot();
    }
}
