package juegoproyecto;

public class Coordenada {

    private int coordenadaX;
    private int coordenadaY;

    public Coordenada(int X, int Y) {
        this.coordenadaX = X;
        this.coordenadaY = Y;
    }

    public int getPosX() {
        return coordenadaX;
    }

    public void setPosX(int X) {
        this.coordenadaX = X;
    }

    public int getPosY() {
        return coordenadaY;
    }

    public void setPosY(int Y) {
        this.coordenadaY = Y;
    }

    @Override
    public String toString() {
        return "Posiciones{" + "X=" + coordenadaX + ", X" + coordenadaY + '}';
    }

}
