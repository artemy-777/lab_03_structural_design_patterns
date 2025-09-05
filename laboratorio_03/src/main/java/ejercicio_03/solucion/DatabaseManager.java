package ejercicio_03.solucion;

public class DatabaseManager {

    private GameConfig config;
    private static DatabaseManager instance;

    private DatabaseManager() {
        config = GameConfig.getInstance();
    }

    public static DatabaseManager getInstance() {
        if (instance == null) {
            synchronized (DatabaseManager.class) {
                if (instance == null) {
                    instance = new DatabaseManager();
                }
            }
        }
        return instance;
    }

    public void saveData() {
        System.out.println("Guardando en: " + config.getDatabaseUrl());
        System.out.println("Máximo jugadores permitidos: " + config.getMaxPlayers());
    }
}
