
package datos;

import java.util.Objects;


public class Datos {
private String nombre;
private int edad;
private Materias materias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Datos other = (Datos) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.materias, other.materias)) {
            return false;
        }
        return true;
    }
    
    
//toString
     @Override
    public String toString() {
        return "Datos=" + "Nombre: " + nombre + ", Edad: " + edad + ",  Materias: "+ materias;
    }
   
    
}
