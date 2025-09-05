package ejercicio_02.solucion;

public class Cliente {
    public static void main(String[] args) {
        // Crear elementos para PC
        GameElementFactory pcFactory = new PCFactory();
        Character pcWarrior = pcFactory.createWarrior();
        Weapon pcSword = pcFactory.createWeapon();

        System.out.println("=== Probando elementos de PC ===");
        pcWarrior.attack();
        pcSword.use();
        System.out.println();

        // Crear elementos para Mobile
        GameElementFactory mobileFactory = new MobileFactory();
        Character mobileWarrior = mobileFactory.createWarrior();
        Weapon mobileSword = mobileFactory.createWeapon();

        System.out.println("=== Probando elementos de Mobile ===");
        mobileWarrior.attack();
        mobileSword.use();
    }
}
