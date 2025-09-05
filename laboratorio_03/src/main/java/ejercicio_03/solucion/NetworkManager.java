package ejercicio_03.solucion;

public class NetworkManager {

    private static NetworkManager instance;
    private GameConfig config;

    private NetworkManager() {
        config = GameConfig.getInstance();
    }

    public static NetworkManager getInstance() {
        if (instance == null) {
            synchronized (NetworkManager.class) {
                if (instance == null) {
                    instance = new NetworkManager();
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conectando a: " + config.getDatabaseUrl());
        System.out.println("Debug mode: " + config.isDebugMode());
    }
}
