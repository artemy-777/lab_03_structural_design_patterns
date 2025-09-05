package ejercicio_01.solucion;

public abstract class GameFactory {
    public GameFactory() {
    }

    public abstract Game createGame();

    public static Game GameCreator(String genre) {
        Game game = null;
        if ("RPG".equals(genre)) {
            game = new RPGFactory().createGame();
        }
        if ("FPS".equals(genre)) {
            game = new FPSFactory().createGame();
        }
        if ("Puzzle".equals(genre)) {
            game = new PuzzleFactory().createGame();
        }
        return game;
    }

    public void playGame() {
        Game game = createGame();
        System.out.println(game.getInfo());
        game.start();
    }
    
}
