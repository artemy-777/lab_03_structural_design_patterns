package ejercicio_01.solucion;

public class PuzzleGame extends Game {
    public PuzzleGame() {
        this.name = "Puzzle Master";
        this.genre = "Puzzle";
    }

    @Override
    public void start() {
        System.out.println("Cargando tablero de rompecabezas...");
        System.out.println("Elige el nivel de dificultad");
    }
}