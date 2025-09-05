package ejercicio_01.solucion;

public class Cliente {
    public static void main(String[] args) {
        GameCreator creator = new GameCreator();

        Game rpg = creator.createGame("RPG");
        System.out.println(rpg.getInfo());
        rpg.start();
        System.out.println();

        Game fps = creator.createGame("FPS");
        System.out.println(fps.getInfo());
        fps.start();
        System.out.println();

        Game puzzle = creator.createGame("Puzzle");
        System.out.println(puzzle.getInfo());
        puzzle.start();
        System.out.println();
    }
}