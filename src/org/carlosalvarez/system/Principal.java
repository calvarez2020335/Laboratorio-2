package org.carlosalvarez.system;
import javax.swing.JOptionPane;
import org.carlosalvarez.bean.Division;
import org.carlosalvarez.bean.Multiplicacion;
import org.carlosalvarez.bean.Resta;
import org.carlosalvarez.bean.SalirDelPrograma;
import org.carlosalvarez.bean.Suma;



/**
 *
 * @author Carlos Adolfo Alvarez Crúz
 * @date 10 abr 2021
 * @time 7:16:37 Código técnico: IN5BV
 */
public class Principal {

    public static void main(String[] args) {

       
        int elije = Integer.parseInt(JOptionPane.showInputDialog(null, "****Menu****\n"
                + "1- Suma\n"
                + "2- Resta\n"
                + "3- Multiplicación\n"
                + "4- División\n"
                + "5- Salir"));

        switch (elije) {
            case 1:
                Suma sumar = new Suma();
                JOptionPane.showMessageDialog(null, "Para finalizar el bucle escribir\n" + "\t0");
                sumar.calcularSuma();
                //sumar.getSumatoria();
                JOptionPane.showMessageDialog(null, "Resultado de la suma: \n" + sumar.getSumatoria());

                break;
            case 2:
                Resta r = new Resta();
                JOptionPane.showMessageDialog(null, "Para finalizar el bucle escribir\n" + "\t0");
                r.calularResta();
                JOptionPane.showMessageDialog(null, "Resultado de la resta:  \n" + r.getRestatorio());
                break;
            case 3:
                Multiplicacion multiplicar = new Multiplicacion();

                double numer1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
                double numer2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese segundo numero"));

                multiplicar.setNumero1(numer1);
                multiplicar.setNumero2(numer2);
                multiplicar.calcularMulti();

                JOptionPane.showMessageDialog(null, "Resultado de la multiplicación\n\t " + multiplicar.getResultado());
                break;
            case 4:
                Division div = new Division();

                double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
                double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese segundo numero"));

                div.setNumero1(numero1);
                div.setNumero2(numero2);
                div.calcularDiv();
                div.residuo();

                JOptionPane.showMessageDialog(null, "Resultado de la división\n\t " + div.getResultado());
                JOptionPane.showMessageDialog(null, "Residuo de la división\n\t " + div.getSobrante());

                break;
            case 5:
                JOptionPane.showMessageDialog(null, "**Se cerro el programa exitosamente**");
                SalirDelPrograma salir = new SalirDelPrograma();

                salir.salir();
                break;
            default:
                JOptionPane.showMessageDialog(null, "**Elección incorrecta vuelva a ejecutar el programa**");
                break;

        }
    }

}
