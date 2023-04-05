package juegoproyecto;

public class Figura {

    private Coordenada[] posicion;  // VECTOR tip oobjeto
    private int eligeFigura;

    public Figura() {
        posicion = new Coordenada[4];  //figura con 4 posiciones
        eligeFigura = 0;
    }

    //figura cuadrado no hay que darle vuelta
    public void cuadrado() {

        posicion[0] = new Coordenada(0, 0); //ingresa las coordenadas x y por arreglo 
        posicion[1] = new Coordenada(0, 1);
        posicion[2] = new Coordenada(1, 0);
        posicion[3] = new Coordenada(1, 1);
    }

    public void cuadradoUnoUno() {

        posicion[0] = new Coordenada(0, 1);
        posicion[1] = new Coordenada(0, 2);
        posicion[2] = new Coordenada(1, 1);
        posicion[3] = new Coordenada(1, 2);
    }

    public void cuadradoUnoDos() {

        posicion[0] = new Coordenada(0, 2);
        posicion[1] = new Coordenada(0, 3);
        posicion[2] = new Coordenada(1, 2);
        posicion[3] = new Coordenada(1, 3);
    }

    public void cuadradoUnoTres() {

        posicion[0] = new Coordenada(0, 3);
        posicion[1] = new Coordenada(0, 4);
        posicion[2] = new Coordenada(1, 3);
        posicion[3] = new Coordenada(1, 4);
    }

    public void cuadradoUnoCuatro() {

        posicion[0] = new Coordenada(0, 4);
        posicion[1] = new Coordenada(0, 5);
        posicion[2] = new Coordenada(1, 4);
        posicion[3] = new Coordenada(1, 5);
    }

    public void cuadradoUnoCinco() {

        posicion[0] = new Coordenada(0, 5);
        posicion[1] = new Coordenada(0, 6);
        posicion[2] = new Coordenada(1, 5);
        posicion[3] = new Coordenada(1, 6);
    }

    public void cuadradoUnoSeis() {

        posicion[0] = new Coordenada(0, 6);
        posicion[1] = new Coordenada(0, 7);
        posicion[2] = new Coordenada(1, 6);
        posicion[3] = new Coordenada(1, 7);
    }

    public void cuadradoUnoSiete() {

        posicion[0] = new Coordenada(0, 7);
        posicion[1] = new Coordenada(0, 8);
        posicion[2] = new Coordenada(1, 7);
        posicion[3] = new Coordenada(1, 8);
    }

    public void cuadradoUnoOcho() {

        posicion[0] = new Coordenada(0, 8);
        posicion[1] = new Coordenada(0, 9);
        posicion[2] = new Coordenada(1, 8);
        posicion[3] = new Coordenada(1, 9);
    }

    public void cuadradoUnoNueve() {

        posicion[0] = new Coordenada(0, 9);
        posicion[1] = new Coordenada(0, 10);
        posicion[2] = new Coordenada(1, 9);
        posicion[3] = new Coordenada(1, 10);
    }

    public void cuadradoUnoDiez() {

        posicion[0] = new Coordenada(0, 10);
        posicion[1] = new Coordenada(0, 11);
        posicion[2] = new Coordenada(1, 10);
        posicion[3] = new Coordenada(1, 11);
    }

    //empieza a mover la figura en todas las posiciones de 0
    public void figuraVertical() {
        posicion[0] = new Coordenada(0, 0);
        posicion[1] = new Coordenada(1, 0);
        posicion[2] = new Coordenada(2, 0);
        posicion[3] = new Coordenada(3, 0);

    }

    /*
    Figura invertida Vertical
     */
    public void figuraInvertida() {

        posicion[0] = new Coordenada(0, 0);
        posicion[1] = new Coordenada(0, 1);
        posicion[2] = new Coordenada(0, 2);
        posicion[3] = new Coordenada(0, 3);
    }

    public void figuraInvertidaDos() {

        posicion[0] = new Coordenada(0, 3);
        posicion[1] = new Coordenada(0, 4);
        posicion[2] = new Coordenada(0, 5);
        posicion[3] = new Coordenada(0, 6);
    }

    public void figuraInvertidaTres() {

        posicion[0] = new Coordenada(0, 6);
        posicion[1] = new Coordenada(0, 7);
        posicion[2] = new Coordenada(0, 8);
        posicion[3] = new Coordenada(0, 9);
    }

    public void figuraVerticalUno() {
        posicion[0] = new Coordenada(0, 1);
        posicion[1] = new Coordenada(1, 1);
        posicion[2] = new Coordenada(2, 1);
        posicion[3] = new Coordenada(3, 1);

    }

    public void figuraVerticalDos() {
        posicion[0] = new Coordenada(0, 2);
        posicion[1] = new Coordenada(1, 2);
        posicion[2] = new Coordenada(2, 2);
        posicion[3] = new Coordenada(3, 2);

    }

    public void figuraVerticalTres() {
        posicion[0] = new Coordenada(0, 3);
        posicion[1] = new Coordenada(1, 3);
        posicion[2] = new Coordenada(2, 3);
        posicion[3] = new Coordenada(3, 3);

    }

    public void figuraVerticalCuatro() {
        posicion[0] = new Coordenada(0, 4);
        posicion[1] = new Coordenada(1, 4);
        posicion[2] = new Coordenada(2, 4);
        posicion[3] = new Coordenada(3, 4);

    }

    public void figuraVerticalCinco() {
        posicion[0] = new Coordenada(0, 5);
        posicion[1] = new Coordenada(1, 5);
        posicion[2] = new Coordenada(2, 5);
        posicion[3] = new Coordenada(3, 5);

    }

    public void figuraVerticalSeis() {
        posicion[0] = new Coordenada(0, 6);
        posicion[1] = new Coordenada(1, 6);
        posicion[2] = new Coordenada(2, 6);
        posicion[3] = new Coordenada(3, 6);

    }

    public void figuraVerticalSiete() {
        posicion[0] = new Coordenada(0, 7);
        posicion[1] = new Coordenada(1, 7);
        posicion[2] = new Coordenada(2, 7);
        posicion[3] = new Coordenada(3, 7);

    }

    public void figuraVerticalOcho() {
        posicion[0] = new Coordenada(0, 8);
        posicion[1] = new Coordenada(1, 8);
        posicion[2] = new Coordenada(2, 8);
        posicion[3] = new Coordenada(3, 8);

    }

    public void figuraVerticalNueve() {
        posicion[0] = new Coordenada(0, 9);
        posicion[1] = new Coordenada(1, 9);
        posicion[2] = new Coordenada(2, 9);
        posicion[3] = new Coordenada(3, 9);

    }

    public void figuraVerticalDiez() {
        posicion[0] = new Coordenada(0, 9);
        posicion[1] = new Coordenada(1, 9);
        posicion[2] = new Coordenada(2, 9);
        posicion[3] = new Coordenada(3, 9);

    }

    //inicia otra figura
    public void figuraTres() {
        posicion[0] = new Coordenada(0, 0);
        posicion[1] = new Coordenada(1, 0);
        posicion[2] = new Coordenada(1, 1);
        posicion[3] = new Coordenada(1, 2);

    }

    public void figuraTresUno() {
        posicion[0] = new Coordenada(0, 1);
        posicion[1] = new Coordenada(1, 1);
        posicion[2] = new Coordenada(1, 2);
        posicion[3] = new Coordenada(1, 3);

    }

    public void figuraTresDos() {
        posicion[0] = new Coordenada(0, 2);
        posicion[1] = new Coordenada(1, 2);
        posicion[2] = new Coordenada(1, 3);
        posicion[3] = new Coordenada(1, 4);

    }

    public void figuraTresCuatro() {
        posicion[0] = new Coordenada(0, 3);
        posicion[1] = new Coordenada(1, 3);
        posicion[2] = new Coordenada(1, 4);
        posicion[3] = new Coordenada(1, 5);

    }

    public void figuraTresCinco() {
        posicion[0] = new Coordenada(0, 4);
        posicion[1] = new Coordenada(1, 4);
        posicion[2] = new Coordenada(1, 5);
        posicion[3] = new Coordenada(1, 6);

    }

    public void figuraTresSeis() {
        posicion[0] = new Coordenada(0, 5);
        posicion[1] = new Coordenada(1, 5);
        posicion[2] = new Coordenada(1, 6);
        posicion[3] = new Coordenada(1, 7);

    }

    public void figuraTresSiete() {
        posicion[0] = new Coordenada(0, 6);
        posicion[1] = new Coordenada(1, 6);
        posicion[2] = new Coordenada(1, 7);
        posicion[3] = new Coordenada(1, 8);

    }

    public void figuraTresOcho() {
        posicion[0] = new Coordenada(0, 7);
        posicion[1] = new Coordenada(1, 7);
        posicion[2] = new Coordenada(1, 8);
        posicion[3] = new Coordenada(1, 9);

    }

    public void figuraTresNueve() {
        posicion[0] = new Coordenada(0, 8);
        posicion[1] = new Coordenada(1, 8);
        posicion[2] = new Coordenada(1, 9);
        posicion[3] = new Coordenada(1, 10);

    }

    public void figuraTresDiez() {
        posicion[0] = new Coordenada(0, 9);
        posicion[1] = new Coordenada(1, 9);
        posicion[2] = new Coordenada(1, 10);
        posicion[3] = new Coordenada(1, 11);

    }

    //dibuja 4
    public void figuraCuatro() {
        posicion[0] = new Coordenada(0, 1);
        posicion[1] = new Coordenada(0, 2);
        posicion[2] = new Coordenada(1, 0);
        posicion[3] = new Coordenada(1, 1);

    }

    public void figuraCuatroUno() {
        posicion[0] = new Coordenada(0, 2);
        posicion[1] = new Coordenada(0, 3);
        posicion[2] = new Coordenada(1, 1);
        posicion[3] = new Coordenada(1, 2);

    }

    public void figuraCuatroDos() {
        posicion[0] = new Coordenada(0, 3);
        posicion[1] = new Coordenada(0, 4);
        posicion[2] = new Coordenada(1, 2);
        posicion[3] = new Coordenada(1, 3);

    }

    public void figuraCuatroTres() {
        posicion[0] = new Coordenada(0, 4);
        posicion[1] = new Coordenada(0, 5);
        posicion[2] = new Coordenada(1, 3);
        posicion[3] = new Coordenada(1, 4);

    }

    public void figuraCuatroCuatro() {
        posicion[0] = new Coordenada(0, 5);
        posicion[1] = new Coordenada(0, 6);
        posicion[2] = new Coordenada(1, 4);
        posicion[3] = new Coordenada(1, 5);

    }

    public void figuraCuatroCinco() {
        posicion[0] = new Coordenada(0, 6);
        posicion[1] = new Coordenada(0, 7);
        posicion[2] = new Coordenada(1, 5);
        posicion[3] = new Coordenada(1, 6);

    }

    public void figuraCuatroSeis() {
        posicion[0] = new Coordenada(0, 7);
        posicion[1] = new Coordenada(0, 8);
        posicion[2] = new Coordenada(1, 6);
        posicion[3] = new Coordenada(1, 7);

    }

    public void figuraCuatroSiete() {
        posicion[0] = new Coordenada(0, 8);
        posicion[1] = new Coordenada(0, 9);
        posicion[2] = new Coordenada(1, 7);
        posicion[3] = new Coordenada(1, 8);

    }

    public void figuraCuatroOcho() {
        posicion[0] = new Coordenada(0, 9);
        posicion[1] = new Coordenada(0, 10);
        posicion[2] = new Coordenada(1, 8);
        posicion[3] = new Coordenada(1, 9);

    }

    //iniciafiguraCinco
    public void figuraCinco() {
        posicion[0] = new Coordenada(0, 1);
        posicion[1] = new Coordenada(0, 1);
        posicion[2] = new Coordenada(1, 1);
        posicion[3] = new Coordenada(1, 2);

    }

    public void figuraCincoUno() {
        posicion[0] = new Coordenada(0, 0);
        posicion[1] = new Coordenada(0, 0);
        posicion[2] = new Coordenada(1, 1);
        posicion[3] = new Coordenada(1, 2);

    }

    public void figuraCincoDos() {
        posicion[0] = new Coordenada(0, 2);
        posicion[1] = new Coordenada(0, 2);
        posicion[2] = new Coordenada(1, 2);
        posicion[3] = new Coordenada(1, 3);

    }

    public void figuraCincoTres() {
        posicion[0] = new Coordenada(0, 3);
        posicion[1] = new Coordenada(0, 3);
        posicion[2] = new Coordenada(1, 3);
        posicion[3] = new Coordenada(1, 4);

    }

    public void figuraCincoCuatro() {
        posicion[0] = new Coordenada(0, 4);
        posicion[1] = new Coordenada(0, 4);
        posicion[2] = new Coordenada(1, 4);
        posicion[3] = new Coordenada(1, 5);

    }

    public void figuraCincoCinco() {
        posicion[0] = new Coordenada(0, 5);
        posicion[1] = new Coordenada(0, 5);
        posicion[2] = new Coordenada(1, 5);
        posicion[3] = new Coordenada(1, 6);

    }

    public void figuraCincoSeis() {
        posicion[0] = new Coordenada(0, 6);
        posicion[1] = new Coordenada(0, 6);
        posicion[2] = new Coordenada(1, 6);
        posicion[3] = new Coordenada(1, 7);

    }

    public void figuraCincoSiete() {
        posicion[0] = new Coordenada(0, 7);
        posicion[1] = new Coordenada(0, 7);
        posicion[2] = new Coordenada(1, 7);
        posicion[3] = new Coordenada(1, 8);

    }

    public void figuraCincoOcho() {
        posicion[0] = new Coordenada(0, 8);
        posicion[1] = new Coordenada(0, 8);
        posicion[2] = new Coordenada(1, 8);
        posicion[3] = new Coordenada(1, 9);

    }

    public void figuraSeis() {
        posicion[0] = new Coordenada(0, 0);
        posicion[1] = new Coordenada(1, 0);
        posicion[2] = new Coordenada(2, 0);
        posicion[3] = new Coordenada(2, 1);

    }

    public void figuraSeisUno() {
        posicion[0] = new Coordenada(0, 1);
        posicion[1] = new Coordenada(1, 1);
        posicion[2] = new Coordenada(2, 1);
        posicion[3] = new Coordenada(2, 2);

    }

    public void figuraSeisDos() {
        posicion[0] = new Coordenada(0, 2);
        posicion[1] = new Coordenada(1, 2);
        posicion[2] = new Coordenada(2, 2);
        posicion[3] = new Coordenada(2, 3);

    }

    public void figuraSeisTres() {
        posicion[0] = new Coordenada(0, 3);
        posicion[1] = new Coordenada(1, 3);
        posicion[2] = new Coordenada(2, 3);
        posicion[3] = new Coordenada(2, 4);

    }

    public void figuraSeisCuatro() {
        posicion[0] = new Coordenada(0, 4);
        posicion[1] = new Coordenada(1, 4);
        posicion[2] = new Coordenada(2, 4);
        posicion[3] = new Coordenada(2, 5);

    }

    public void figuraSeisCinco() {
        posicion[0] = new Coordenada(0, 5);
        posicion[1] = new Coordenada(1, 5);
        posicion[2] = new Coordenada(2, 5);
        posicion[3] = new Coordenada(2, 6);

    }

    public void figuraSeisSeis() {
        posicion[0] = new Coordenada(0, 6);
        posicion[1] = new Coordenada(1, 6);
        posicion[2] = new Coordenada(2, 6);
        posicion[3] = new Coordenada(2, 7);

    }

    public void figuraSeisSiete() {
        posicion[0] = new Coordenada(0, 7);
        posicion[1] = new Coordenada(1, 7);
        posicion[2] = new Coordenada(2, 7);
        posicion[3] = new Coordenada(2, 8);

    }

    public void figuraSeisOcho() {
        posicion[0] = new Coordenada(0, 8);
        posicion[1] = new Coordenada(1, 8);
        posicion[2] = new Coordenada(2, 8);
        posicion[3] = new Coordenada(2, 9);

    }

    public void figuraSeisNueve() {
        posicion[0] = new Coordenada(0, 9);
        posicion[1] = new Coordenada(1, 9);
        posicion[2] = new Coordenada(2, 9);
        posicion[3] = new Coordenada(2, 10);

    }

    public void figuraSiete() {
        posicion[0] = new Coordenada(0, 1);
        posicion[1] = new Coordenada(1, 1);
        posicion[2] = new Coordenada(2, 1);
        posicion[3] = new Coordenada(2, 0);

    }

    public void figuraSieteUno() {
        posicion[0] = new Coordenada(0, 2);
        posicion[1] = new Coordenada(1, 2);
        posicion[2] = new Coordenada(2, 2);
        posicion[3] = new Coordenada(2, 1);

    }

    public void figuraSieteDos() {
        posicion[0] = new Coordenada(0, 3);
        posicion[1] = new Coordenada(1, 3);
        posicion[2] = new Coordenada(2, 3);
        posicion[3] = new Coordenada(2, 2);

    }

    public void figuraSieteTres() {
        posicion[0] = new Coordenada(0, 4);
        posicion[1] = new Coordenada(1, 4);
        posicion[2] = new Coordenada(2, 4);
        posicion[3] = new Coordenada(2, 3);

    }

    public void figuraSieteCuatro() {
        posicion[0] = new Coordenada(0, 5);
        posicion[1] = new Coordenada(1, 5);
        posicion[2] = new Coordenada(2, 5);
        posicion[3] = new Coordenada(2, 4);

    }

    public void figuraSieteCinco() {
        posicion[0] = new Coordenada(0, 6);
        posicion[1] = new Coordenada(1, 6);
        posicion[2] = new Coordenada(2, 6);
        posicion[3] = new Coordenada(2, 5);

    }

    public void figuraSieteSeis() {
        posicion[0] = new Coordenada(0, 7);
        posicion[1] = new Coordenada(1, 7);
        posicion[2] = new Coordenada(2, 7);
        posicion[3] = new Coordenada(2, 6);

    }

    public void figuraSieteSiete() {
        posicion[0] = new Coordenada(0, 8);
        posicion[1] = new Coordenada(1, 8);
        posicion[2] = new Coordenada(2, 8);
        posicion[3] = new Coordenada(2, 7);

    }

    public void figuraSieteOcho() {
        posicion[0] = new Coordenada(0, 9);
        posicion[1] = new Coordenada(1, 9);
        posicion[2] = new Coordenada(2, 9);
        posicion[3] = new Coordenada(2, 8);

    }

    public void figuraSieteNueve() {
        posicion[0] = new Coordenada(0, 10);
        posicion[1] = new Coordenada(1, 10);
        posicion[2] = new Coordenada(2, 10);
        posicion[3] = new Coordenada(2, 9);

    }

    public int Aleatorio() {
        return (int) (Math.random() * (8 - 1)) + 1;
    }

    public void crearFigura() {
        eligeFigura = Aleatorio();
        switch (eligeFigura) {
            case 1:
                int aleatorio = (int) (Math.random() * 12);

                if (aleatorio == 0) {
                    cuadrado();

                }
                if (aleatorio == 1) {
                    cuadradoUnoUno();

                }
                if (aleatorio == 2) {
                    cuadradoUnoDos();

                }
                if (aleatorio == 3) {
                    cuadradoUnoTres();

                }
                if (aleatorio == 4) {
                    cuadradoUnoCuatro();
                }
                if (aleatorio == 5) {
                    cuadradoUnoCinco();

                }
                if (aleatorio == 6) {
                    cuadradoUnoSeis();

                }
                if (aleatorio == 7) {
                    cuadradoUnoSiete();

                }
                if (aleatorio == 8) {
                    cuadradoUnoOcho();

                }
                if (aleatorio == 9) {
                    cuadradoUnoNueve();

                }
                if (aleatorio == 10) {
                    cuadradoUnoDiez();

                }

                break;

            case 2:

                int aleatorioDos = (int) (Math.random() * 12);

                if (aleatorioDos == 0) {
                    figuraVertical();
                    figuraInvertida();

                }
                if (aleatorioDos == 1) {
                    figuraVerticalUno();
                    figuraInvertidaDos();
                }
                if (aleatorioDos == 2) {
                    figuraVerticalDos();
                    figuraInvertidaTres();
                }
                if (aleatorioDos == 3) {
                    figuraVerticalTres();

                }
                if (aleatorioDos == 4) {
                    figuraVerticalCuatro();

                }
                if (aleatorioDos == 5) {
                    figuraVerticalCinco();

                }
                if (aleatorioDos == 6) {
                    figuraVerticalSeis();

                }
                if (aleatorioDos == 7) {
                    figuraVerticalSiete();

                }
                if (aleatorioDos == 8) {
                    figuraVerticalOcho();

                }
                if (aleatorioDos == 9) {
                    figuraVerticalNueve();

                }
                if (aleatorioDos == 10) {
                    figuraVerticalDiez();

                }

                break;
            case 3:

                int aleatorioTres = (int) (Math.random() * 12);

                if (aleatorioTres == 0) {
                    figuraTres();
                }
                if (aleatorioTres == 1) {
                    figuraTresUno();
                }
                if (aleatorioTres == 2) {
                    figuraTresDos();
                }
                if (aleatorioTres == 3) {
                    figuraTresCuatro();
                }
                if (aleatorioTres == 4) {
                    figuraTresCinco();
                }
                if (aleatorioTres == 5) {
                    figuraTresSeis();
                }
                if (aleatorioTres == 6) {
                    figuraTresSiete();
                }
                if (aleatorioTres == 7) {
                    figuraTresOcho();
                }
                if (aleatorioTres == 8) {
                    figuraTresNueve();
                }
                if (aleatorioTres == 9) {
                    figuraTresDiez();
                }

                break;
            case 4:
                // figuraCuatro();
                int aleatorioCuatro = (int) (Math.random() * 12);

                if (aleatorioCuatro == 0) {
                    figuraCuatro();
                }
                if (aleatorioCuatro == 1) {
                    figuraCuatroUno();
                }
                if (aleatorioCuatro == 2) {
                    figuraCuatroDos();
                }
                if (aleatorioCuatro == 3) {
                    figuraCuatroTres();
                }
                if (aleatorioCuatro == 4) {
                    figuraCuatroCuatro();
                }
                if (aleatorioCuatro == 5) {
                    figuraCuatroCinco();
                }
                if (aleatorioCuatro == 6) {
                    figuraCuatroSeis();
                }
                if (aleatorioCuatro == 7) {
                    figuraCuatroSiete();
                }
                if (aleatorioCuatro == 8) {
                    figuraCuatroOcho();
                }

                break;

            case 5:

                int aleatorioDosCinco = (int) (Math.random() * 12);

                if (aleatorioDosCinco == 1) {
                    figuraCinco();
                }
                if (aleatorioDosCinco == 2) {
                    figuraCincoUno();
                }
                if (aleatorioDosCinco == 3) {
                    figuraCincoDos();
                }
                if (aleatorioDosCinco == 4) {
                    figuraCincoTres();
                }
                if (aleatorioDosCinco == 5) {
                    figuraCincoCuatro();
                }
                if (aleatorioDosCinco == 6) {
                    figuraCincoCinco();
                }
                if (aleatorioDosCinco == 7) {
                    figuraCincoSeis();
                }
                if (aleatorioDosCinco == 8) {
                    figuraCincoSiete();
                }
                if (aleatorioDosCinco == 9) {
                    figuraCincoOcho();
                }

                break;
            case 6:

                int aleatorioSeis = (int) (Math.random() * 12);

                if (aleatorioSeis == 1) {
                    figuraSeis();
                }
                if (aleatorioSeis == 2) {
                    figuraSeisUno();
                }
                if (aleatorioSeis == 3) {
                    figuraSeisDos();
                }
                if (aleatorioSeis == 4) {
                    figuraSeisTres();
                }
                if (aleatorioSeis == 5) {
                    figuraSeisCuatro();
                }
                if (aleatorioSeis == 6) {
                    figuraSeisCinco();
                }
                if (aleatorioSeis == 7) {
                    figuraSeisSeis();
                }
                if (aleatorioSeis == 8) {
                    figuraSeisSiete();
                }
                if (aleatorioSeis == 9) {
                    figuraSeisOcho();
                }

                break;
            case 7:

                int aleatorioSiete = (int) (Math.random() * 12);

                if (aleatorioSiete == 1) {
                    figuraSiete();
                }
                if (aleatorioSiete == 2) {
                    figuraSieteUno();
                }
                if (aleatorioSiete == 3) {
                    figuraSieteDos();
                }
                if (aleatorioSiete == 4) {
                    figuraSieteTres();
                }
                if (aleatorioSiete == 5) {
                    figuraSieteCuatro();
                }
                if (aleatorioSiete == 6) {
                    figuraSieteCinco();
                }
                if (aleatorioSiete == 7) {
                    figuraSieteSeis();
                }
                if (aleatorioSiete == 8) {
                    figuraSieteSiete();
                }
                if (aleatorioSiete == 9) {
                    figuraSieteOcho();
                }

                break;
        }
    }

    public Coordenada[] getFiguraPos() {
        return posicion;
    }

    public void setFiguraPos(Coordenada[] figuraPos) {
        this.posicion = figuraPos;
    }

    public int getnFiguras() {
        return eligeFigura;
    }

    public void setnFiguras(int nFiguras) {
        this.eligeFigura = nFiguras;
    }

    public String imprimir() {
        String salida = "";
        for (int i = 0; i < posicion.length; i++) {
            salida += posicion[i];

        }
        return salida;
    }

    public static void main(String[] args) {
        Figura f = new Figura();
        f.crearFigura();

        System.out.println(f.imprimir());
    }

}
