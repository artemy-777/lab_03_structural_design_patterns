package ejercicio_02.solucion;


public class GameElementCreator {

    public Character createCharacter(String platform, String type) {
        Character character = null;

        if (type.equals("Warrior")) {
            character = new Warrior(platform);
        }

        return character;
    }

    public Weapon createWeapon(String platform, String type) {
        Weapon weapon = null;

        if (type.equals("Sword")) {
            weapon = new Sword(platform);
        }

        return weapon;
    }
}
