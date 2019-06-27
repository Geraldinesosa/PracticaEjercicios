public class VagonDeCarga implements Vagon{


    Integer cargaMaxima;

    public Integer cantidadDePasajeros() {
        return 0;
    }

    public Integer pesoMaximo() {
        return cargaMaxima + 160;
    }
}



