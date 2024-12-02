import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double codigoEmpleado, horasTrabajadas, valorHora, retencionFuente, porcentajeRetencion, salarioBruto, salarioNeto;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el codigo del empleado: ");
        codigoEmpleado = sc.nextDouble();
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = sc.next();
        System.out.print("Ingrese las horas trabajadas por el empleado: ");
        horasTrabajadas = sc.nextDouble();
        System.out.print("Ingrese el valor de hora: ");
        valorHora = sc.nextDouble();
        System.out.print("Ingrese el porcentaje de retencion en la fuente: ");
        porcentajeRetencion = sc.nextDouble();

        salarioBruto = valorHora * horasTrabajadas;
        retencionFuente = (porcentajeRetencion / 100) * salarioBruto;
        salarioNeto = salarioBruto - retencionFuente;

        System.out.println("El código del empleado es: " + codigoEmpleado);
        System.out.println("El nombre del empleado es: " + nombre);
        System.out.println("El salario bruto del empleado es: " + salarioBruto);
        System.out.println("El salario neto del empleado es: " + salarioNeto);

    }
}