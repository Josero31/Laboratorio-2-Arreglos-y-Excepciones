public class Pais {
    private int idPais;
    private String ubicacion;

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Pais(int idPais, String ubicacion) {
        this.idPais = idPais;
        this.ubicacion = ubicacion;
    }

}