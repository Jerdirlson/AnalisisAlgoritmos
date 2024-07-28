package interfaces.categories;

public class Categoria {
    private String nombre;
    // private int id;

    public Categoria(String nombre) {
        // this.id = id;/
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // public int getId(){
    //     return id;
    // }

    @Override
    public String toString() {
        return nombre;
    }
}
