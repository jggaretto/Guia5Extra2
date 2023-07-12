/*
 En un nuevo proyecto, nos piden modelar e implementar en Java una aplicación que permita
llevar un Registro del promedio mensual de lluvias para las localidades de San Luis, Merlo y Villa
Mercedes; registrando como Dato milímetros promedio caídos; apellido y nombre de la persona
que hizo ese registro. El Registro debe permitir agregar un Dato para un mes y localidad
determinada; obtener el promedio más alto registrado y otro comportamiento es el de permitir
obtener el promedio más alto registrado por localidad. El siguiente gráfico representaría el
Registro de lluvias:

----------------------------------------------------------------------------------------------
          San Luis      Merlo     Villa Mercedes
	   ________________________________                ___________ 
enero     |__________|__________|__________|              | apellido  | 
febrero   |__________|__________|__________|              | nombre    |
marzo     |__________|__________|__________|------------> | milimetros|
abril     |__________|__________|__________|              |___________|
mayo      |__________|__________|__________|
junio     |__________|__________|__________|           |_________________|
julio     |__________|__________|__________|                    |
agosto    |__________|__________|__________|                  Dato
septiembre|__________|__________|__________|
octubre   |__________|__________|__________| 
noviembre |__________|__________|__________|
diciembre |__________|__________|__________|

          |________________________________|
                          |
             Matriz Registro de lluvias
----------------------------------------------------------------------------------------------

Modele e implemente las clases Java con los métodos necesarios para poder resolver este
problema. Luego realice las pruebas necesarias desde el método main de la clase principal del
proyecto.
 */
package guia5extra2;


public class Guia5Extra2 {

   
    /*public static void main(String[] args) {
        RegistroLluvias registro = new RegistroLluvias();

        // Agregar datos de lluvias
        registro.agregarDato("San Luis", "enero", 50.0);
        registro.agregarDato("Merlo", "enero", 40.0);
        registro.agregarDato("Villa Mercedes", "enero", 60.0);

        registro.agregarDato("San Luis", "febrero", 30.0);
        registro.agregarDato("Merlo", "febrero", 35.0);
        registro.agregarDato("Villa Mercedes", "febrero", 25.0);

        // Obtener promedio más alto registrado
        double promedioMasAlto = registro.obtenerPromedioMasAlto();
        System.out.println("Promedio más alto registrado: " + promedioMasAlto);

        // Obtener promedio más alto registrado por localidad
        String localidadSanLuis = "San Luis";
        String localidadMerlo = "Merlo";
        String localidadVillaMercedes = "Villa Mercedes";

        double promedioMasAltoSanLuis = registro.obtenerPromedioMasAltoPorLocalidad(localidadSanLuis);
        double promedioMasAltoMerlo = registro.obtenerPromedioMasAltoPorLocalidad(localidadMerlo);
        double promedioMasAltoVillaMercedes = registro.obtenerPromedioMasAltoPorLocalidad(localidadVillaMercedes);

        System.out.println("--------------------------------------------------");
        System.out.println("Registro de Lluvias");
        System.out.println("--------------------------------------------------");

        // Imprimir encabezado de las localidades
        System.out.print("           ");
        for (String localidad : registro.getLocalidades()) {
            System.out.print(String.format("%-12s", localidad));
        }
        System.out.println();

        // Imprimir filas de datos
        for (String mes : registro.getMeses()) {
            System.out.printf("%-12s", mes);
            for (String localidad : registro.getLocalidades()) {
                double dato = registro.obtenerDato(localidad, mes);
                System.out.printf("|%-12.1f", dato);
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Promedios más altos por localidad");
        System.out.println("--------------------------------------------------");
        System.out.println("Promedio más alto en " + localidadSanLuis + ": " + promedioMasAltoSanLuis);
        System.out.println("Promedio más alto en " + localidadMerlo + ": " + promedioMasAltoMerlo);
        System.out.println("Promedio más alto en " + localidadVillaMercedes + ": " + promedioMasAltoVillaMercedes);
    }
*/


    public static void main(String[] args) {
        RegistroLluvias registroLluvias = new RegistroLluvias();

        // Agregar datos de lluvias
        registroLluvias.agregarDato("San Luis", "enero", 50.0);
        registroLluvias.agregarDato("Merlo", "enero", 60.0);
        registroLluvias.agregarDato("Villa Mercedes", "enero", 70.0);

        registroLluvias.agregarDato("San Luis", "febrero", 40.0);
        registroLluvias.agregarDato("Merlo", "febrero", 55.0);
        registroLluvias.agregarDato("Villa Mercedes", "febrero", 65.0);

        // Obtener promedio más alto registrado en todas las localidades y meses
        double promedioMasAlto = registroLluvias.obtenerPromedioMasAlto();

        // Obtener promedio más alto registrado por localidad
        String[] localidades = registroLluvias.getLocalidades();

        // Crear tabla de resultados
        System.out.printf("%-15s", ""); // Espacio en blanco para alinear la tabla
        for (String localidad : localidades) {
            System.out.printf("%-15s", localidad);
        }
        System.out.println();

        String[] meses = registroLluvias.getMeses();
        for (String mes : meses) {
            System.out.printf("%-15s", mes);
            for (String localidad : localidades) {
                double dato = registroLluvias.obtenerDato(localidad, mes);
                System.out.printf("%-15.2f", dato);
            }
            System.out.println();
        }

        // Mostrar promedio más alto
        System.out.println("\nPromedio más alto registrado: " + promedioMasAlto);

        // Mostrar promedio más alto por localidad
        for (String localidad : localidades) {
            double promedioMasAltoLocalidad = registroLluvias.obtenerPromedioMasAltoPorLocalidad(localidad);
            System.out.println("Promedio más alto en " + localidad + ": " + promedioMasAltoLocalidad);
        }
    }
}
