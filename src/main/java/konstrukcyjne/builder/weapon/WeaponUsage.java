package konstrukcyjne.builder.weapon;


import java.util.List;

public class WeaponUsage {
    public static void main(String[] args) {
        final Weapon laserGun = new Weapon.Builder()
                .withDamage(123)
                .withName("LaserGun")
                .withPerks(List.of("Color:red"))
                .withDurability(50L)
                .build();

        System.out.println(laserGun);
    }
}
