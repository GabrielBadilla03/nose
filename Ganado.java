
package programacion.proyecto;

import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ganado {
    public int codAnimal;
    public String nombre;
    public String nacimiento; // Cambiado el tipo de dato de int a String
    public double ultimoPeso;
    public String sexo;
    public String raza;

    public Ganado(int codAnimal, String nombre, String nacimiento, double ultimoPeso, String sexo, String raza) {
        this.codAnimal = codAnimal;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.ultimoPeso = ultimoPeso;
        this.sexo = sexo;
        this.raza = raza;
    }

    public void pedirinfoGanado() {
        this.codAnimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el codigo del animal: "));
        this.nombre = JOptionPane.showInputDialog(null, "Digite el nombre del animal: ");
        this.nacimiento = pedirFechaNacimiento(); // Pedimos la fecha usando un método separado
        this.ultimoPeso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el ultimo peso del animal: "));
        this.sexo = JOptionPane.showInputDialog(null, "Digite el sexo del animal: ");
        this.raza = JOptionPane.showInputDialog(null, "Digite la raza del animal: ");
    }

    public String pedirFechaNacimiento() {
        String dateString = JOptionPane.showInputDialog(null, "Digite la fecha de nacimiento del animal (dd/MM/yyyy): ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateOfBirth = null;
        try {
            dateOfBirth = dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Error al ecribir la fecha (dd/MM/yyyy).");
        }
        return dateString;
    }

    // Cambiados los tipos de datos de int a String
    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getCodAnimal() {
        return codAnimal;
    }

    public void setCodAnimal(int codAnimal) {
        this.codAnimal = codAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getUltimoPeso() {
        return ultimoPeso;
    }

    public void setUltimoPeso(double ultimoPeso) {
        this.ultimoPeso = ultimoPeso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}