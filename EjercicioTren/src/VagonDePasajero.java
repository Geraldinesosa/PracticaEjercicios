public class VagonDePasajero implements Vagon{

    public Integer cantidadDePasajeros;
    private Integer largoMetro;
    private Integer anchoMetro;

    public VagonDePasajero(Integer anchoMetro, Integer largoMetro) {
        this.anchoMetro = anchoMetro;
        this.largoMetro = largoMetro;
    }

    public Integer cantidadDePasajeros() {
        if (anchoMetro <= 2.5) {
            return anchoMetro*8;
        } else {
            return largoMetro*10;
        }
    }

    public Integer pesoMaximo() {
        return cantidadDePasajeros()*80;
    }






}