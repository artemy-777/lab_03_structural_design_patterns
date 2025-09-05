package ejercicio_03.solucion;

public class Cliente {

    public static void main(String[] args) {

        GameConfig config = GameConfig.getInstance();
        DatabaseManager database = DatabaseManager.getInstance();
        NetworkManager network = NetworkManager.getInstance();
        GameSession session = GameSession.getInstance();

        config.setDebugMode(true);

        session.startSession();    // maxPlayers = 50, debug = false
        network.connect();         // debug = true (inconsistente!)
        database.saveData();       // databaseUrl diferente (inconsistente!)

        GameConfig config2 = GameConfig.getInstance();
        System.out.println("\nPrueba de Singleton:");
        System.out.println("¿Misma instancia de GameConfig? " + (config == config2));
    }
    
}
