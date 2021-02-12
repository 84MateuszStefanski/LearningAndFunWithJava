package wzorceprojektowe.konstrukcyjne.builder.builderwewnatrzklasy;

import java.util.List;

public class WeaponUsage {
    public static void main(String[] args) {
        final Weapon laserGun = new Weapon.Builder()
                .withName("Beretta")
                .withDamage(100)
                .withDurability(1000L)
                .withPerks(List.of("Color : red"))
                .build();
        final Weapon railGun = new Weapon.Builder()
                .withDamage(1000)
                .withDurability(1000L)
                .withName("Rail Gun")
                .withType("Hand gun")
                .withPerks(List.of("Color : red"))
                .build();

        System.out.println(laserGun.getDamage() + railGun.getType());
        laserGun.setType("Hand laser gun");
        System.out.println(laserGun.getType());


    }
}
