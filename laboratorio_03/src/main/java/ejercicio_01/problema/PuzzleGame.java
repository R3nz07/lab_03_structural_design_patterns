package ejercicio_01.problema;


public class PuzzleGame extends Game {
    public PuzzleGame() {
        this.name = "Puzzle Game";
        this.genre = "Puzzle";
    }
    
    @Override
    public void start() {
        System.out.println("Cargando puzzle...");
        System.out.println("Resolviendo puzzle...");
    }
}
