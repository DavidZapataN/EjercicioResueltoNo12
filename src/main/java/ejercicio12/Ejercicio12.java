
package ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {
        double Ingresohora = 5000;
        double Ingresosemana = Ingresohora*48;
        double Porcentajeretencion =((Ingresosemana*12.5)/100);
        double Salarioneto = Ingresosemana-Porcentajeretencion;
        System.out.println("Salario bruto del empleado es: $"+Ingresosemana);
        System.out.println("La retención  en la fuente es: $"+Porcentajeretencion);
        System.out.println("Salario bruto del empelado es: $"+Salarioneto);
        
        
        
                
    }
}
