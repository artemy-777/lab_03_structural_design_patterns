package ejercicio_02.solucion;

public class PCSword extends Weapon {
    public PCSword() {
        this.name = "PC Sword";
        this.platform = "PC";
    }

    @Override
    public void use() {
        System.out.println("PC Sword activada!");
    }
    
}
