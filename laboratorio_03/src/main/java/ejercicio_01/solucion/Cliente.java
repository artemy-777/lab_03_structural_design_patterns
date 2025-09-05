package ejercicio_01.solucion;

public class Cliente {
    public static void main(String[] args) {

        Game rpg = GameFactory.GameCreator("RPG");
        System.out.println(rpg.getInfo());
        rpg.start();
        System.out.println();

        Game fps = GameFactory.GameCreator("FPS");
        System.out.println(fps.getInfo());
        fps.start();
        System.out.println();

        Game puzzle = GameFactory.GameCreator("Puzzle");
        System.out.println(puzzle.getInfo());
        puzzle.start();
        System.out.println();
    }
}