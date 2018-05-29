
package datos;


public class Materias {
   private String nombre;
   private String nivel;

    public Materias(String nombre, String nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Materias: " + nombre + "-" + nivel ;
    }
   
   
}
