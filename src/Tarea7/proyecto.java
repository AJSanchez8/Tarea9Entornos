package Tarea7;

import java.util.*;


/**
 * Class proyecto
 */
public class proyecto {

  //
  // Fields
  //

  private String fecha_inicio;
  private String fecha_fin;
  private  Lugar l1;
  //
  // Constructors
  //
  public proyecto () { };

  public proyecto(String fecha_inicio, String fecha_fin, ArrayList<Empleados> listaEmpleados, Lugar l1) {
    this.fecha_inicio = fecha_inicio;
    this.fecha_fin = fecha_fin;
    this.l1 = l1;
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of fecha_inicio
   * @param newVar the new value of fecha_inicio
   */
  public void setFecha_inicio (String newVar) {
    fecha_inicio = newVar;
  }

  /**
   * Get the value of fecha_inicio
   * @return the value of fecha_inicio
   */
  public String getFecha_inicio () {
    return fecha_inicio;
  }

  /**
   * Set the value of fecha_fin
   * @param newVar the new value of fecha_fin
   */
  public void setFecha_fin (String newVar) {
    fecha_fin = newVar;
  }

  /**
   * Get the value of fecha_fin
   * @return the value of fecha_fin
   */
  public String getFecha_fin () {
    return fecha_fin;
  }

  //
  // Other methods
  //

}
