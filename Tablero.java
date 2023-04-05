package juegoproyecto;

public class Tablero {

    private Figura figura;  //clase Figura
    private int tablero[][];
    private boolean caer = true;
    private int posMaximaX, posMaximaY;
    private int fila, columna;

    public Tablero(int fila, int columna) { //24 12
        tablero = new int[fila][columna];
        posMaximaX = 24;
        posMaximaY = 12;

    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public boolean getCaer() {
        return caer;
    }

    public void setCaer(boolean caer) {
        this.caer = caer;
    }

    public int getPosMaximaX() {
        return posMaximaX;
    }

    public void setPosMaximaX(int posMaximaX) {
        this.posMaximaX = posMaximaX;
    }

    public int getPosMaximaY() {
        return posMaximaY;
    }

    public void setPosMaximaY(int posMaximaY) {
        this.posMaximaY = posMaximaY;
    }

//    public void siguienteFigura(Figura figura) {
//
//    }
    public int obtenerPosX(int pos, Figura figura) {
        return figura.getFiguraPos()[pos].getPosX();
    }

    public int obtenerPosY(int pos, Figura figura) {
        return figura.getFiguraPos()[pos].getPosY();
    }

    //haciendo metodo con herencia
    public void agregar(Figura figura) {
        for (int i = 0; i < figura.getFiguraPos().length; i++) {
            tablero[obtenerPosX(i, figura)][obtenerPosY(i, figura)] = 1;

        }

    }

//    public void alturaMaxima(Figura figura) {
//        posMaximaX = figura.getFiguraPos()[0].getPosX();
//        System.out.println(figura.getFiguraPos()[0].getPosX());
//        posMaximaY = figura.getFiguraPos()[0].getPosY();
//
//    }
//    public boolean fondo(int pos) {
//        return pos + 1 == tablero.length;
//
//    }
    public void desciende(Figura figura) {
        for (int i = figura.getFiguraPos().length - 1; i >= 0; i--) {

            tablero[obtenerPosX(i, figura)][obtenerPosY(i, figura)] = 0; //pinta en la gui
            tablero[obtenerPosX(i, figura) + 1][obtenerPosY(i, figura)] = 1;  //pinta en la gui

            figura.getFiguraPos()[i].setPosX(obtenerPosX(i, figura) + 1);

            if (tope(figura, i) || validar(figura)) {  //cuando llega a la ultima linea //obtenerPosX(i, figura) + 1 == tablero.length
                //la posicion es con el i
                caer = false;

                //  if (obtenerPosX(i, figura) + 1 == tablero.length  )
                //tablero.length ||obtenerPosX(i, figura) + 2 == tablero.length se detiene una fila antes
                //  obtenerPosX(i, figura) + 1 == tablero.length se detine en la ultima fila
            }
        }

    }

    public boolean tope(Figura figura, int posicion) { //la figura entra        
        if (obtenerPosX(posicion, figura) + 1 == tablero.length) { //con el mas uno es el siguiente
            return true;

        }

        return false;
    }

    public boolean validar(Figura figura) {
        boolean salida = false;

        for (int i = 0; i < figura.getFiguraPos().length; i++) {
            if (obtenerPosX(i, figura) + 1 < 24) {

                if (tablero[obtenerPosX(i, figura) + 1][obtenerPosY(i, figura)] == 0) {
                    salida = false;
                } else {
                    salida = true;
                }
            }
        }
        return salida;
    }

    public void moverFigura(Figura figura) {  //la clase se mueve como un parametro
        for (int i = 0; i < figura.getFiguraPos().length; i++) {

            tablero[obtenerPosX(i, figura)][obtenerPosY(i, figura)] = 0; //busca y borra
            tablero[obtenerPosX(i, figura)][obtenerPosY(i, figura) + 1] = 1;  //modifica el tablero pero no la figura

            figura.getFiguraPos()[i].setPosY(obtenerPosY(i, figura) + 1);  //sirve para cualquier figura

            //ya puedo mover y debo borrar del tablero.
        }

    }
    
     public void moverFiguraIzquierda(Figura figura) {  //la clase se mueve como un parametro
        for (int i = 0; i < figura.getFiguraPos().length; i++) {

            tablero[obtenerPosX(i, figura)][obtenerPosY(i, figura)] = 0; //busca y borra
            tablero[obtenerPosX(i, figura)][obtenerPosY(i, figura) - 1] = 1;  //modifica el tablero pero no la figura

            figura.getFiguraPos()[i].setPosY(obtenerPosY(i, figura) - 1);  //sirve para cualquier figura

            //ya puedo mover y debo borrar del tablero.
        }

    }
    
    

    public String imprimir() {
        String salida = "";
        for (int[] tablero1 : tablero) {
            for (int j = 0; j < tablero[0].length; j++) {
                salida += "[" + tablero1[j] + "]";
            }
            salida += "\n";
        }
        return salida;
    }

    public static void main(String[] args) {
        Tablero t = new Tablero(24, 12);
        Figura f = new Figura();
        System.out.println(t.imprimir());
        f.crearFigura();
        // t.agregarFigura(f);
        System.out.println(t.imprimir());
        while (t.getCaer()) {// t.getCaer()
            t.desciende(f);
            t.moverFigura(f);
            System.out.println(t.imprimir());

        }
    }

}
