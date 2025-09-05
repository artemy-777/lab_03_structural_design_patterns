package ejercicio_02.solucion;

public class PCWarrior extends Character {
    public PCWarrior() {
        this.name = "PC Warrior";
        this.platform = "PC";
    }

    @Override
    public void attack() {
        System.out.println("PC Warrior atacando!");
    }
}