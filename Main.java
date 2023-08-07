
package programacion.proyecto;

import javax.swing.JOptionPane;

public class Main {
//menu
    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 4) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione una opción:\n"
                    + "1. Ingresar datos del Ganado\n"
                    + "2. Ingresar datos de la Finca\n"
                    + "3. Ingresar datos del Potrero\n"
                    + "4. Salir"
            ));

            switch (opcion) {
                case 1:
                    ingresarDatosGanado();
                    break;
                case 2:
                    ingresarDatosFinca();
                    break;
                case 3:
                    ingresarDatosPotrero();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        }
    }

    public static void ingresarDatosGanado() {
        while (true) {
            int cantGanado = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de ganado: "));
            Ganado[] ganado = new Ganado[cantGanado];

            for (int i = 0; i < cantGanado; i++) {
                ganado[i] = new Ganado(0, "", "", 0, "", "");
                ganado[i].pedirinfoGanado();
            }

            for (int i = 0; i < cantGanado; i++) {
                JOptionPane.showMessageDialog(null,
                        "\nCodigo del animal: " + ganado[i].getCodAnimal()
                        + "\nNombre del animal: " + ganado[i].getNombre()
                        + "\nFecha de nacimiento del animal: " + ganado[i].getNacimiento()
                        + "\nUlitmo peso del animal: " + ganado[i].getUltimoPeso()
                        + "\nSexo del animal: " + ganado[i].getSexo()
                        + "\nRaza del animal: " + ganado[i].getRaza());
            }

            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar más datos de ganado?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion != JOptionPane.YES_OPTION) {
                break; // Sale del bucle para regresar al menú principal
            }
        }
    }

   public static void ingresarDatosFinca() {
    while (true) {
        int cantidadFincas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de fincas: "));
        Finca[] fincas = new Finca[cantidadFincas];

        for (int i = 0; i < cantidadFincas; i++) {
            fincas[i] = new Finca("", "", "", "", 0, 0, 0, 0.0, 0);
            fincas[i].pedirinfoFinca();
        }

        for (int i = 0; i < cantidadFincas; i++) {
            JOptionPane.showMessageDialog(null,
                    "\nTipo de Ganado: " + fincas[i].getTipoGanado()
                    + "\nNombre de la finca: " + fincas[i].getNombre()
                    + "\nUbicacion de la finca: " + fincas[i].getUbicacion()
                    + "\nNombre del encargado: " + fincas[i].getNombEncargado()
                    + "\nCedula del encargado: " + fincas[i].getCedEncargado()
                    + "\nTelefono del encargado: " + fincas[i].getTelEncargado()
                    + "\nCantidad de potreros de la finca: " + fincas[i].getCantPotreros()
                    + "\nTamaño de la finca: " + fincas[i].getTamañoFinca()
                    + "\nTotal de animales de la finca: " + fincas[i].getTotAnimales());
        }

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar más datos de fincas?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opcion != JOptionPane.YES_OPTION) {
            break; // Sale del bucle para regresar al menú principal
        }
    }
}

public static void ingresarDatosPotrero() {
    while (true) {
        int cantPotrero = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de potreros: "));
        Potrero[] potrero = new Potrero[cantPotrero];

        for (int i = 0; i < cantPotrero; i++) {
            potrero[i] = new Potrero(0, "", "", 0, 0, 0, false, "");
            potrero[i].pedirinfoPotrero();
        }

        for (int i = 0; i < cantPotrero; i++) {
            JOptionPane.showMessageDialog(null,
                    "\nCodigo del potrero: " + potrero[i].getCodPotrero()
                    + "\nNombre del potrero: " + potrero[i].getNombre()
                    + "\nEstado del potrero: " + potrero[i].getEstado()
                    + "\nFecha de entrada del animal: " + potrero[i].getFechaEntrada()
                    + "\nFecha de salida del animal: " + potrero[i].getFechaSalida()
                    + "\nCantidad de animales en el potrero: " + potrero[i].getCantAnimales()
                    + "\nEstado del agua: " + potrero[i].isAgua()
                    + "\nTerreno del potrero: " + potrero[i].getTerreno());
        }

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar más datos de potreros?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opcion != JOptionPane.YES_OPTION) {
            break; // Sale del bucle para regresar al menú principal
        }
    }
}
}
