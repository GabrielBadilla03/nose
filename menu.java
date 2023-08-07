package proyecto;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
public class menu {
    Finca finca = new Finca(null, null, null, null, 0, 0, 0, 0, 0);
    Ganado ganado = new Ganado(0, 0, null, null, 0, null, null);
    Potrero potrero = new Potrero(0, null, null, 0, 0, 0, false, null);

    Finca[] arrfincas = new Finca[4];

    Potrero[] arrpotrerofinca0 = new Potrero[arrfincas[0].getCantPotreros()];
    Potrero[] arrpotrerofinca1 = new Potrero[arrfincas[1].getCantPotreros()];
    Potrero[] arrpotrerofinca2 = new Potrero[arrfincas[2].getCantPotreros()];
    Potrero[] arrpotrerofinca3 = new Potrero[arrfincas[3].getCantPotreros()];

    Ganado[] arrganadofinca0 = new Ganado[arrpotrerofinca0[0].getCantAnimales()];
    Ganado[] arrganadofinca1 = new Ganado[arrpotrerofinca1[0].getCantAnimales()];
    Ganado[] arrganadofinca2 = new Ganado[arrpotrerofinca2[0].getCantAnimales()];
    Ganado[] arrganadofinca3 = new Ganado[arrpotrerofinca3[0].getCantAnimales()];

    Potrero[] arrrotapotrero0 = new Potrero[arrfincas[0].getCantPotreros()];
    Potrero[] arrrotapotrero1 = new Potrero[arrfincas[1].getCantPotreros()];
    Potrero[] arrrotapotrero2 = new Potrero[arrfincas[2].getCantPotreros()];
    Potrero[] arrrotapotrero3 = new Potrero[arrfincas[3].getCantPotreros()];


    public void informacion(){
    int cantidadFincas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de fincas: "));
        for(int i = 0;i<cantidadFincas;i++){
            finca.pedirinfoFinca();
            arrfincas[i] = new Finca(finca.getTipoGanado(), finca.getNombre(), finca.getUbicacion(), finca.getNombEncargado(), finca.getCedEncargado(), finca.getTelEncargado(), finca.getCantPotreros(), finca.getTamañoFinca(),finca.getTotAnimales());
            if(i == 0){
                for(int a = 0;a<arrfincas[i].getCantPotreros();i++){
                    potrero.pedirinfoPotrero();
                    arrpotrerofinca0[a] = new Potrero(potrero.getCodPotrero(), potrero.getNombre(), potrero.getEstado(), potrero.getFechaEntrada(), potrero.getFechaSalida(), potrero.getCantAnimales(), potrero.isAgua(), potrero.getTerreno());
                    if(a == 0){
                        arrrotapotrero0[a] = new Potrero(arrpotrerofinca0[a].getCodPotrero(), "en este potrero se encuentra el ganado", "ocupado", arrpotrerofinca0[a].getFechaEntrada(), arrpotrerofinca0[a].getFechaSalida(), 0, false, null);
                    }else{
                        arrrotapotrero0[a] = new Potrero(arrpotrerofinca0[a].getCodPotrero(), "este potrero esta vacio", arrpotrerofinca0[a].getEstado(), arrpotrerofinca0[a].getFechaEntrada(), arrpotrerofinca0[a].getFechaSalida(), 0, false, null);
                    }
                }
                for(int b = 0;b<potrero.getCantAnimales();i++){
                    ganado.pedirinfoGanado();
                    arrganadofinca0[b] = new Ganado(arrpotrerofinca0[b].getCodPotrero(), ganado.getCodAnimal(), ganado.getNombre(), ganado.getNacimiento(), ganado.getUltimoPeso(), ganado.getSexo(), ganado.getRaza());
                }
            }
            
            if(i == 1){
                for(int a = 0;a<arrfincas[i].getCantPotreros();i++){
                    potrero.pedirinfoPotrero();
                    arrpotrerofinca1[a] = new Potrero(potrero.getCodPotrero(), potrero.getNombre(), potrero.getEstado(), potrero.getFechaEntrada(), potrero.getFechaSalida(), potrero.getCantAnimales(), potrero.isAgua(), potrero.getTerreno());
                    if(a == 1){
                        arrrotapotrero1[a] = new Potrero(arrpotrerofinca1[a].getCodPotrero(), "en este potrero se encuentra el ganado", "ocupado", arrpotrerofinca1[a].getFechaEntrada(), arrpotrerofinca1[a].getFechaSalida(), 0, false, null);
                    }else{
                        arrrotapotrero1[a] = new Potrero(arrpotrerofinca1[a].getCodPotrero(), "este potrero esta vacio", arrpotrerofinca1[a].getEstado(), arrpotrerofinca1[a].getFechaEntrada(), arrpotrerofinca1[a].getFechaSalida(), 0, false, null);
                    }
                }
                for(int b = 0;b<potrero.getCantAnimales();i++){
                    ganado.pedirinfoGanado();
                    arrganadofinca1[b] = new Ganado(arrpotrerofinca1[b].getCodPotrero(), ganado.getCodAnimal(), ganado.getNombre(), ganado.getNacimiento(), ganado.getUltimoPeso(), ganado.getSexo(), ganado.getRaza());
                    
                }
            }
            if(i == 2){
                for(int a = 0;a<arrfincas[i].getCantPotreros();i++){
                    potrero.pedirinfoPotrero();
                    arrpotrerofinca2[a] = new Potrero(potrero.getCodPotrero(), potrero.getNombre(), potrero.getEstado(), potrero.getFechaEntrada(), potrero.getFechaSalida(), potrero.getCantAnimales(), potrero.isAgua(), potrero.getTerreno());
                    if(a == 1){
                        arrrotapotrero2[a] = new Potrero(arrpotrerofinca2[a].getCodPotrero(), "en este potrero se encuentra el ganado", "ocupado", arrpotrerofinca2[a].getFechaEntrada(), arrpotrerofinca2[a].getFechaSalida(), 0, false, null);
                    }else{
                        arrrotapotrero2[a] = new Potrero(arrpotrerofinca2[a].getCodPotrero(), "este potrero esta vacio", arrpotrerofinca2[a].getEstado(), arrpotrerofinca2[a].getFechaEntrada(), arrpotrerofinca2[a].getFechaSalida(), 0, false, null);
                    }
                }
                for(int b = 0;b<potrero.getCantAnimales();i++){
                    ganado.pedirinfoGanado();
                    arrganadofinca2[b] = new Ganado(arrpotrerofinca2[b].getCodPotrero(), ganado.getCodAnimal(), ganado.getNombre(), ganado.getNacimiento(), ganado.getUltimoPeso(), ganado.getSexo(), ganado.getRaza());
                }
            }

            if(i == 3){
                for(int a = 0;a<arrfincas[i].getCantPotreros();i++){
                    potrero.pedirinfoPotrero();
                    arrpotrerofinca3[a] = new Potrero(potrero.getCodPotrero(), potrero.getNombre(), potrero.getEstado(), potrero.getFechaEntrada(), potrero.getFechaSalida(), potrero.getCantAnimales(), potrero.isAgua(), potrero.getTerreno());
                    if(a == 1){
                        arrrotapotrero3[a] = new Potrero(arrpotrerofinca3[a].getCodPotrero(), "en este potrero se encuentra el ganado", "ocupado", arrpotrerofinca3[a].getFechaEntrada(), arrpotrerofinca3[a].getFechaSalida(), 0, false, null);
                    }else{
                        arrrotapotrero3[a] = new Potrero(arrpotrerofinca3[a].getCodPotrero(), "este potrero esta vacio", arrpotrerofinca3[a].getEstado(), arrpotrerofinca3[a].getFechaEntrada(), arrpotrerofinca3[a].getFechaSalida(), 0, false, null);
                    }
                }
                for(int b = 0;b<potrero.getCantAnimales();i++){
                    ganado.pedirinfoGanado();
                    arrganadofinca3[b] = new Ganado(arrpotrerofinca3[b].getCodPotrero(), ganado.getCodAnimal(), ganado.getNombre(), ganado.getNacimiento(), ganado.getUltimoPeso(), ganado.getSexo(), ganado.getRaza());
                }
            }   
        }
    }

    public void verinfofinca1(){
        JOptionPane.showMessageDialog(null, "informacion de la finca 1 \n"+arrfincas[0]);
    }
    public void verinfofinca1potre(){    
        JOptionPane.showMessageDialog(null, "informacion de los potreros de la finca 1");
        for(int i = 0;i<arrpotrerofinca0.length;i++){
            JOptionPane.showMessageDialog(null, arrpotrerofinca0[i]);
        }
    }    
    public void verinfofinca1gana(){    
        JOptionPane.showMessageDialog(null, "informacion del ganado de la finca 1");
        for(int i = 0;i<arrganadofinca0.length;i++){
            JOptionPane.showMessageDialog(null, arrganadofinca0[i]);
        }
    }

    public void verinfofinca2(){
        JOptionPane.showMessageDialog(null, "informacion de la finca 2 \n"+arrfincas[1]);
    }
    public void verinfofinca2potre(){
        JOptionPane.showMessageDialog(null, "informacion de los potreros de la finca 2");
        for(int i = 0;i<arrpotrerofinca1.length;i++){
            JOptionPane.showMessageDialog(null, arrpotrerofinca1[i]);
        }
    }
    public void verinfofinca2gana(){    
        JOptionPane.showMessageDialog(null, "informacion del ganado de la finca 2");
        for(int i = 0;i<arrganadofinca1.length;i++){
            JOptionPane.showMessageDialog(null, arrganadofinca1[i]);
        }
    }

    public void verinfofinca3(){
        JOptionPane.showMessageDialog(null, "informacion de la finca 3 \n"+arrfincas[2]);
    }
    public void verinfofinca3potre(){
        JOptionPane.showMessageDialog(null, "informacion de los potreros de la finca 3");
        for(int i = 0;i<arrpotrerofinca2.length;i++){
            JOptionPane.showMessageDialog(null, arrpotrerofinca2[i]);
        }
    }
    public void verinfofinca3gana(){   
        JOptionPane.showMessageDialog(null, "informacion del ganado de la finca 3");
        for(int i = 0;i<arrganadofinca2.length;i++){
            JOptionPane.showMessageDialog(null, arrganadofinca2[i]);
        }
    }

    public void verinfofinca4(){
        JOptionPane.showMessageDialog(null, "informacion de la finca 4 \n"+arrfincas[3]);
    }
    public void verinfofinca4potre(){
        JOptionPane.showMessageDialog(null, "informacion de los potreros de la finca 4");
        for(int i = 0;i<arrpotrerofinca3.length;i++){
            JOptionPane.showMessageDialog(null, arrpotrerofinca3[i]);
        }
    }
    public void verinfofinca4gana(){
        JOptionPane.showMessageDialog(null, "informacion del ganado de la finca 4");
        for(int i = 0;i<arrganadofinca3.length;i++){
            JOptionPane.showMessageDialog(null, arrganadofinca3[i]);
        }
    }

    public void editarinfofinca1(){
        JOptionPane.showMessageDialog(null, "a continuacion se le mostrara la informacion de la finca "+arrfincas[0].getNombre());
        JOptionPane.showMessageDialog(null, arrfincas[0]);
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("que informacion desea cambiar\n1-tipo de ganado\n 2-nombre\n3-ubicacion\n4-nombre del encargado\n5-cedula del encargado\n6-telefono del encargado\7-cantidad de potreros\n8-tamaño\n9-total animales"));
        if(opcion == 1){
            String gana = JOptionPane.showInputDialog("ingrese el nuevo tipo de ganado de la finca:");
            arrfincas[0] = new Finca(gana, arrfincas[0].getNombre(), arrfincas[0].getUbicacion(), arrfincas[0].getNombEncargado(), arrfincas[0].getCedEncargado(), arrfincas[0].getTelEncargado(), arrfincas[0].getCantPotreros(), arrfincas[0].getTamañoFinca(), arrfincas[0].getTotAnimales());
        }
        if(opcion == 2){
            String nom = JOptionPane.showInputDialog("ingrese el nombre nuevo de la finca:");
            arrfincas[0] = new Finca(arrfincas[0].getTipoGanado(), nom, arrfincas[0].getUbicacion(), arrfincas[0].getNombEncargado(), arrfincas[0].getCedEncargado(), arrfincas[0].getTelEncargado(), arrfincas[0].getCantPotreros(), arrfincas[0].getTamañoFinca(), arrfincas[0].getTotAnimales());
        }
        if(opcion == 3){
            String ubi = JOptionPane.showInputDialog("ingrese la nueva ubicacion de la finca:");
            arrfincas[0] = new Finca(arrfincas[0].getTipoGanado(), arrfincas[0].getNombre(), ubi, arrfincas[0].getNombEncargado(), arrfincas[0].getCedEncargado(), arrfincas[0].getTelEncargado(), arrfincas[0].getCantPotreros(), arrfincas[0].getTamañoFinca(), arrfincas[0].getTotAnimales());
        }
        if(opcion == 4){
            String nomenca = JOptionPane.showInputDialog("ingrese el nuevo nombre del encargado de la finca:");
            arrfincas[0] = new Finca(arrfincas[0].getTipoGanado(), arrfincas[0].getNombre(), arrfincas[0].getUbicacion(), nomenca, arrfincas[0].getCedEncargado(), arrfincas[0].getTelEncargado(), arrfincas[0].getCantPotreros(), arrfincas[0].getTamañoFinca(), arrfincas[0].getTotAnimales());
        }
        if(opcion == 5){
            int ceduenca = Integer.parseInt(null, JOptionPane.showConfirmDialog(null, "ingrese la nueva cedula del encargado;"));
            arrfincas[0] = new Finca(arrfincas[0].getTipoGanado(), arrfincas[0].getNombre(), arrfincas[0].getUbicacion(), arrfincas[0].getNombEncargado(), ceduenca, arrfincas[0].getTelEncargado(), arrfincas[0].getCantPotreros(), arrfincas[0].getTamañoFinca(), arrfincas[0].getTotAnimales());
        }
        if(opcion == 6){
            int celenca = Integer.parseInt(null, JOptionPane.showConfirmDialog(null, "ingrese el nuevo telefono del encargado;"));
            arrfincas[0] = new Finca(arrfincas[0].getTipoGanado(), arrfincas[0].getNombre(), arrfincas[0].getUbicacion(), arrfincas[0].getNombEncargado(), arrfincas[0].getCedEncargado(), celenca, arrfincas[0].getCantPotreros(), arrfincas[0].getTamañoFinca(), arrfincas[0].getTotAnimales());
        }
        if(opcion == 7){
            int capotre = Integer.parseInt(null, JOptionPane.showConfirmDialog(null, "ingrese la nueva cantidad de potreros de la finca;"));
            arrfincas[0] = new Finca(arrfincas[0].getTipoGanado(), arrfincas[0].getNombre(), arrfincas[0].getUbicacion(), arrfincas[0].getNombEncargado(), arrfincas[0].getCedEncargado(), arrfincas[0].getTelEncargado(), capotre, arrfincas[0].getTamañoFinca(), arrfincas[0].getTotAnimales());
        }
        if(opcion == 8){
            double tama = Double.parseDouble(JOptionPane.showInputDialog("ingrese el nuevo tamañp de la finca en metros cuadrados:"));
            arrfincas[0] = new Finca(arrfincas[0].getTipoGanado(), arrfincas[0].getNombre(), arrfincas[0].getUbicacion(), arrfincas[0].getNombEncargado(), arrfincas[0].getCedEncargado(), arrfincas[0].getTelEncargado(), arrfincas[0].getCantPotreros(), tama, arrfincas[0].getTotAnimales());
        }
        if(opcion == 9){
            int caani = Integer.parseInt(null, JOptionPane.showConfirmDialog(null, "ingrese la nueva cantidad de animales de la finca;"));
            arrfincas[0] = new Finca(arrfincas[0].getTipoGanado(), arrfincas[0].getNombre(), arrfincas[0].getUbicacion(), arrfincas[0].getNombEncargado(), arrfincas[0].getCedEncargado(), arrfincas[0].getTelEncargado(), arrfincas[0].getCantPotreros(), arrfincas[0].getTamañoFinca(), caani);
        }
    }
    public void editarinfopotrefinca1(){
        
    }
    public void editarinfoganafinca1(){
        
    }

    public void editarinfofinca2(){
        JOptionPane.showMessageDialog(null, "a continuacion se le mostrara la informacion de la finca "+arrfincas[1].getNombre());
        JOptionPane.showMessageDialog(null, arrfincas[1]);
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("que informacion desea cambiar\n1-tipo de ganado\n 2-nombre\n3-ubicacion\n4-nombre del encargado\n5-cedula del encargado\n6-telefono del encargado\7-cantidad de potreros\n8-tamaño\n9-total animales"));
        if(opcion == 1){
            String gana = JOptionPane.showInputDialog("ingrese el nuevo tipo de ganado de la finca:");
            arrfincas[1] = new Finca(gana, arrfincas[1].getNombre(), arrfincas[1].getUbicacion(), arrfincas[1].getNombEncargado(), arrfincas[1].getCedEncargado(), arrfincas[1].getTelEncargado(), arrfincas[1].getCantPotreros(), arrfincas[1].getTamañoFinca(), arrfincas[1].getTotAnimales());
        }
        if(opcion == 2){
            String nom = JOptionPane.showInputDialog("ingrese el nombre nuevo de la finca:");
            arrfincas[1] = new Finca(arrfincas[1].getTipoGanado(), nom, arrfincas[1].getUbicacion(), arrfincas[1].getNombEncargado(), arrfincas[1].getCedEncargado(), arrfincas[1].getTelEncargado(), arrfincas[1].getCantPotreros(), arrfincas[1].getTamañoFinca(), arrfincas[1].getTotAnimales());
        }
        if(opcion == 3){
            String ubi = JOptionPane.showInputDialog("ingrese la nueva ubicacion de la finca:");
            arrfincas[1] = new Finca(arrfincas[1].getTipoGanado(), arrfincas[1].getNombre(), ubi, arrfincas[1].getNombEncargado(), arrfincas[1].getCedEncargado(), arrfincas[1].getTelEncargado(), arrfincas[1].getCantPotreros(), arrfincas[1].getTamañoFinca(), arrfincas[1].getTotAnimales());
        }
        if(opcion == 4){
            String nomenca = JOptionPane.showInputDialog("ingrese el nuevo nombre del encargado de la finca:");
            arrfincas[1] = new Finca(arrfincas[1].getTipoGanado(), arrfincas[1].getNombre(), arrfincas[1].getUbicacion(), nomenca, arrfincas[1].getCedEncargado(), arrfincas[1].getTelEncargado(), arrfincas[1].getCantPotreros(), arrfincas[1].getTamañoFinca(), arrfincas[1].getTotAnimales());
        }
        if(opcion == 5){
            int ceduenca = Integer.parseInt(null, JOptionPane.showConfirmDialog(null, "ingrese la nueva cedula del encargado;"));
            arrfincas[1] = new Finca(arrfincas[1].getTipoGanado(), arrfincas[1].getNombre(), arrfincas[1].getUbicacion(), arrfincas[1].getNombEncargado(), ceduenca, arrfincas[1].getTelEncargado(), arrfincas[1].getCantPotreros(), arrfincas[1].getTamañoFinca(), arrfincas[1].getTotAnimales());
        }
        if(opcion == 6){
            int celenca = Integer.parseInt(null, JOptionPane.showConfirmDialog(null, "ingrese el nuevo telefono del encargado;"));
            arrfincas[1] = new Finca(arrfincas[1].getTipoGanado(), arrfincas[1].getNombre(), arrfincas[1].getUbicacion(), arrfincas[1].getNombEncargado(), arrfincas[1].getCedEncargado(), celenca, arrfincas[1].getCantPotreros(), arrfincas[1].getTamañoFinca(), arrfincas[1].getTotAnimales());
        }
        if(opcion == 7){
            int capotre = Integer.parseInt(null, JOptionPane.showConfirmDialog(null, "ingrese la nueva cantidad de potreros de la finca;"));
            arrfincas[1] = new Finca(arrfincas[1].getTipoGanado(), arrfincas[1].getNombre(), arrfincas[1].getUbicacion(), arrfincas[1].getNombEncargado(), arrfincas[1].getCedEncargado(), arrfincas[1].getTelEncargado(), capotre, arrfincas[1].getTamañoFinca(), arrfincas[1].getTotAnimales());
        }
        if(opcion == 8){
            double tama = Double.parseDouble(JOptionPane.showInputDialog("ingrese el nuevo tamañp de la finca en metros cuadrados:"));
            arrfincas[1] = new Finca(arrfincas[1].getTipoGanado(), arrfincas[1].getNombre(), arrfincas[1].getUbicacion(), arrfincas[1].getNombEncargado(), arrfincas[1].getCedEncargado(), arrfincas[1].getTelEncargado(), arrfincas[1].getCantPotreros(), tama, arrfincas[1].getTotAnimales());
        }
        if(opcion == 9){
            int caani = Integer.parseInt(null, JOptionPane.showConfirmDialog(null, "ingrese la nueva cantidad de animales de la finca;"));
            arrfincas[1] = new Finca(arrfincas[1].getTipoGanado(), arrfincas[1].getNombre(), arrfincas[1].getUbicacion(), arrfincas[1].getNombEncargado(), arrfincas[1].getCedEncargado(), arrfincas[1].getTelEncargado(), arrfincas[1].getCantPotreros(), arrfincas[1].getTamañoFinca(), caani);
        }
    }
    public void editarinfopotrefinca2(){
        
    }
    public void editarinfoganafinca2(){
        
    }

    public void editarinfofinca3(){
        JOptionPane.showMessageDialog(null, "a continuacion se le mostrara la informacion de la finca "+arrfincas[2].getNombre());
        JOptionPane.showMessageDialog(null, arrfincas[2]);
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("que informacion desea cambiar\n1-tipo de ganado\n 2-nombre\n3-ubicacion\n4-nombre del encargado\n5-cedula del encargado\n6-telefono del encargado\7-cantidad de potreros\n8-tamaño\n9-total animales"));
        if (opcion == 1) {
            String gana = JOptionPane.showInputDialog("ingrese el nuevo tipo de ganado de la finca:");
            arrfincas[2] = new Finca(gana, arrfincas[2].getNombre(), arrfincas[2].getUbicacion(), arrfincas[2].getNombEncargado(), arrfincas[2].getCedEncargado(), arrfincas[2].getTelEncargado(), arrfincas[2].getCantPotreros(), arrfincas[2].getTamañoFinca(), arrfincas[2].getTotAnimales());
        }
        if (opcion == 2) {
            String nom = JOptionPane.showInputDialog("ingrese el nombre nuevo de la finca:");
            arrfincas[2] = new Finca(arrfincas[2].getTipoGanado(), nom, arrfincas[2].getUbicacion(), arrfincas[2].getNombEncargado(), arrfincas[2].getCedEncargado(), arrfincas[2].getTelEncargado(), arrfincas[2].getCantPotreros(), arrfincas[2].getTamañoFinca(), arrfincas[2].getTotAnimales());
        }
        if (opcion == 3) {
            String ubi = JOptionPane.showInputDialog("ingrese la nueva ubicacion de la finca:");
            arrfincas[2] = new Finca(arrfincas[2].getTipoGanado(), arrfincas[2].getNombre(), ubi, arrfincas[2].getNombEncargado(), arrfincas[2].getCedEncargado(), arrfincas[2].getTelEncargado(), arrfincas[2].getCantPotreros(), arrfincas[2].getTamañoFinca(), arrfincas[2].getTotAnimales());
        }
        if (opcion == 4) {
            String nomenca = JOptionPane.showInputDialog("ingrese el nuevo nombre del encargado de la finca:");
            arrfincas[2] = new Finca(arrfincas[2].getTipoGanado(), arrfincas[2].getNombre(), arrfincas[2].getUbicacion(), nomenca, arrfincas[2].getCedEncargado(), arrfincas[2].getTelEncargado(), arrfincas[2].getCantPotreros(), arrfincas[2].getTamañoFinca(), arrfincas[2].getTotAnimales());
        }
        if (opcion == 5) {
            int ceduenca = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la nueva cedula del encargado:"));
            arrfincas[2] = new Finca(arrfincas[2].getTipoGanado(), arrfincas[2].getNombre(), arrfincas[2].getUbicacion(), arrfincas[2].getNombEncargado(), ceduenca, arrfincas[2].getTelEncargado(), arrfincas[2].getCantPotreros(), arrfincas[2].getTamañoFinca(), arrfincas[2].getTotAnimales());
        }
        if (opcion == 6) {
            int celenca = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el nuevo telefono del encargado:"));
            arrfincas[2] = new Finca(arrfincas[2].getTipoGanado(), arrfincas[2].getNombre(), arrfincas[2].getUbicacion(), arrfincas[2].getNombEncargado(), arrfincas[2].getCedEncargado(), celenca, arrfincas[2].getCantPotreros(), arrfincas[2].getTamañoFinca(), arrfincas[2].getTotAnimales());
        }
        if (opcion == 7) {
            int capotre = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la nueva cantidad de potreros de la finca:"));
            arrfincas[2] = new Finca(arrfincas[2].getTipoGanado(), arrfincas[2].getNombre(), arrfincas[2].getUbicacion(), arrfincas[2].getNombEncargado(), arrfincas[2].getCedEncargado(), arrfincas[2].getTelEncargado(), capotre, arrfincas[2].getTamañoFinca(), arrfincas[2].getTotAnimales());
        }
        if (opcion == 8) {
            double tama = Double.parseDouble(JOptionPane.showInputDialog("ingrese el nuevo tamaño de la finca en metros cuadrados:"));
            arrfincas[2] = new Finca(arrfincas[2].getTipoGanado(), arrfincas[2].getNombre(), arrfincas[2].getUbicacion(), arrfincas[2].getNombEncargado(), arrfincas[2].getCedEncargado(), arrfincas[2].getTelEncargado(), arrfincas[2].getCantPotreros(), tama, arrfincas[2].getTotAnimales());
        }
        if (opcion == 9) {
            int caani = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la nueva cantidad de animales de la finca:"));
            arrfincas[2] = new Finca(arrfincas[2].getTipoGanado(), arrfincas[2].getNombre(), arrfincas[2].getUbicacion(), arrfincas[2].getNombEncargado(), arrfincas[2].getCedEncargado(), arrfincas[2].getTelEncargado(), arrfincas[2].getCantPotreros(), arrfincas[2].getTamañoFinca(), caani);
        }
    }
    public void editarinfopotrefinca3(){
        
    }
    public void editarinfoganafinca3(){
        
    }
    public void editarinfofinca4(){
        JOptionPane.showMessageDialog(null, "a continuacion se le mostrara la informacion de la finca "+arrfincas[3].getNombre());
        JOptionPane.showMessageDialog(null, arrfincas[3]);
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("que informacion desea cambiar\n1-tipo de ganado\n 2-nombre\n3-ubicacion\n4-nombre del encargado\n5-cedula del encargado\n6-telefono del encargado\7-cantidad de potreros\n8-tamaño\n9-total animales"));
        if (opcion == 1) {
            String gana = JOptionPane.showInputDialog("ingrese el nuevo tipo de ganado de la finca:");
            arrfincas[3] = new Finca(gana, arrfincas[3].getNombre(), arrfincas[3].getUbicacion(), arrfincas[3].getNombEncargado(), arrfincas[3].getCedEncargado(), arrfincas[3].getTelEncargado(), arrfincas[3].getCantPotreros(), arrfincas[3].getTamañoFinca(), arrfincas[3].getTotAnimales());
        }
        if (opcion == 2) {
            String nom = JOptionPane.showInputDialog("ingrese el nombre nuevo de la finca:");
            arrfincas[3] = new Finca(arrfincas[3].getTipoGanado(), nom, arrfincas[3].getUbicacion(), arrfincas[3].getNombEncargado(), arrfincas[3].getCedEncargado(), arrfincas[3].getTelEncargado(), arrfincas[3].getCantPotreros(), arrfincas[3].getTamañoFinca(), arrfincas[3].getTotAnimales());
        }
        if (opcion == 3) {
            String ubi = JOptionPane.showInputDialog("ingrese la nueva ubicacion de la finca:");
            arrfincas[3] = new Finca(arrfincas[3].getTipoGanado(), arrfincas[3].getNombre(), ubi, arrfincas[3].getNombEncargado(), arrfincas[3].getCedEncargado(), arrfincas[3].getTelEncargado(), arrfincas[3].getCantPotreros(), arrfincas[3].getTamañoFinca(), arrfincas[3].getTotAnimales());
        }
        if (opcion == 4) {
            String nomenca = JOptionPane.showInputDialog("ingrese el nuevo nombre del encargado de la finca:");
            arrfincas[3] = new Finca(arrfincas[3].getTipoGanado(), arrfincas[3].getNombre(), arrfincas[3].getUbicacion(), nomenca, arrfincas[3].getCedEncargado(), arrfincas[3].getTelEncargado(), arrfincas[3].getCantPotreros(), arrfincas[3].getTamañoFinca(), arrfincas[3].getTotAnimales());
        }
        if (opcion == 5) {
            int ceduenca = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la nueva cedula del encargado:"));
            arrfincas[3] = new Finca(arrfincas[3].getTipoGanado(), arrfincas[3].getNombre(), arrfincas[3].getUbicacion(), arrfincas[3].getNombEncargado(), ceduenca, arrfincas[3].getTelEncargado(), arrfincas[3].getCantPotreros(), arrfincas[3].getTamañoFinca(), arrfincas[3].getTotAnimales());
        }
        if (opcion == 6) {
            int celenca = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el nuevo telefono del encargado:"));
            arrfincas[3] = new Finca(arrfincas[3].getTipoGanado(), arrfincas[3].getNombre(), arrfincas[3].getUbicacion(), arrfincas[3].getNombEncargado(), arrfincas[3].getCedEncargado(), celenca, arrfincas[3].getCantPotreros(), arrfincas[3].getTamañoFinca(), arrfincas[3].getTotAnimales());
        }
        if (opcion == 7) {
            int capotre = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la nueva cantidad de potreros de la finca:"));
            arrfincas[3] = new Finca(arrfincas[3].getTipoGanado(), arrfincas[3].getNombre(), arrfincas[3].getUbicacion(), arrfincas[3].getNombEncargado(), arrfincas[3].getCedEncargado(), arrfincas[3].getTelEncargado(), capotre, arrfincas[3].getTamañoFinca(), arrfincas[3].getTotAnimales());
        }
        if (opcion == 8) {
            double tama = Double.parseDouble(JOptionPane.showInputDialog("ingrese el nuevo tamaño de la finca en metros cuadrados:"));
            arrfincas[3] = new Finca(arrfincas[3].getTipoGanado(), arrfincas[3].getNombre(), arrfincas[3].getUbicacion(), arrfincas[3].getNombEncargado(), arrfincas[3].getCedEncargado(), arrfincas[3].getTelEncargado(), arrfincas[3].getCantPotreros(), tama, arrfincas[3].getTotAnimales());
        }
        if (opcion == 9) {
            int caani = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la nueva cantidad de animales de la finca:"));
            arrfincas[3] = new Finca(arrfincas[3].getTipoGanado(), arrfincas[3].getNombre(), arrfincas[3].getUbicacion(), arrfincas[3].getNombEncargado(), arrfincas[3].getCedEncargado(), arrfincas[3].getTelEncargado(), arrfincas[3].getCantPotreros(), arrfincas[3].getTamañoFinca(), caani);
        }
    }
    public void editarinfopotrefinca4(){
        
    }
    public void editarinfoganafinca4(){
        
    }
}

    