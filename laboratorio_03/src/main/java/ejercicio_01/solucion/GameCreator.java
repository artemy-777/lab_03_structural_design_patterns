
package ejercicio_01.solucion;

public class GameCreator {

    public Game createGame(String type) {
        Game game = null;

        if (type.equals("RPG")) {
            game = new RPGGame();
        } else if (type.equals("FPS")) {
            game = new FPSGame();
        } else if (type.equals("Puzzle")) {
            game = new PuzzleGame();
        } else {
            throw new IllegalArgumentException("Tipo de juego no soportado: " + type);
        }

        return game;
    }
}