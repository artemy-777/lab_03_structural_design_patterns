package ejercicio_02.solucion;

public class MobileFactory implements GameElementFactory {
    @Override
    public Character createWarrior() {
        return new MobileWarrior();
    }

    @Override
    public Weapon createWeapon() {
        return new MobileSword();
    }
}
