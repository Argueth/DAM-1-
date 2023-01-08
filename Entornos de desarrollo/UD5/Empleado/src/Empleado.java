

/**
 *Clase empleado contiene información de cada empleado
 * @author pablo
 * @author <a href="mailto:pablogb2@hotmail.com">pablogb2@hotmail.com</a>
 * @version 27.04
 */
public class Empleado {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    
/**
 *  
 * @param sueldoPlus cantidad en euros que se suma al salario
 * @return <ul> 
 *            <li>True: se suma el plus al sueldo</li> 
 *            <li>False: no se suma el plus al sueldo</li> 
 *         </ul>
*/
    public boolean plus(double sueldoPlus) {
        boolean aumento = false;
        if (edad > 40 && compruebaNombre()) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }
    
    //metodos privados
    private boolean compruebaNombre() {
        if (nombre.equals("")) {
            return false;
        }
        return true;
    }
    
    /**
     * Constructores
     * Constructor por Defecto. 
     */
    public Empleado() {
        this("", "", 0, 0);
    }

/**
 * Constructor con 4 parámetros.
 * Crea objeto empleado, con nombre, apellidos, edad y salario.
 * @param nombre Nombre del empleado
 * @param apellido Apellidos del empleado
 * @param edad Edad del empleado
 * @param salario Salario del empleado
 */    
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario= salario;
    }
}
