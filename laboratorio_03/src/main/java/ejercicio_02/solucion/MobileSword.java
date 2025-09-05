package ejercicio_02.solucion;

public class MobileSword extends Weapon {
    public MobileSword() {
        this.name = "Mobile Sword";
        this.platform = "Mobile";
    }

    @Override
    public void use() {
        System.out.println("Mobile Sword activada!");
    }
}
