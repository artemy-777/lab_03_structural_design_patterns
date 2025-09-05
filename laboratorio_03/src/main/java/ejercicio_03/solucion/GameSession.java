package ejercicio_03.solucion;

public class GameSession {

    private static GameSession instance;
    private GameConfig config;

    private GameSession() {
        this.config = GameConfig.getInstance();
        config.setMaxPlayers(50);
    }

    public static GameSession getInstance() {
                if (instance == null) {
            synchronized (GameSession.class) {
                if (instance == null) {
                    instance = new GameSession();
                }
            }
        }
        return instance;
    }

    public void startSession() {
        System.out.println("Iniciando sesión...");
        System.out.println("Máximo jugadores: " + config.getMaxPlayers());
        System.out.println("Debug mode: " + config.isDebugMode());
    }
}
