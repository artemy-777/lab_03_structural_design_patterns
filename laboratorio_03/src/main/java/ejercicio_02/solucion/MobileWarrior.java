package ejercicio_02.solucion;

public class MobileWarrior extends Character {
    public MobileWarrior() {
        this.name = "Mobile Warrior";
        this.platform = "Mobile";
    }

    @Override
    public void attack() {
        System.out.println("Mobile Warrior atacando!");
    }    
}
