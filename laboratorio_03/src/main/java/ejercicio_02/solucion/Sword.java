package ejercicio_02.solucion;


public class Sword extends Weapon {

    public Sword(String platform) {
        this.name = "Espada";
        this.platform = platform;
    }

    @Override
    public void use() {
        if (platform.equals("PC")) {
            System.out.println("Espada PC con gráficos detallados");
        } else {
            System.out.println("Espada Mobile con gráficos simples");
        }
    }
}
