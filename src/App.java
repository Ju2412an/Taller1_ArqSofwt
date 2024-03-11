import javax.swing.JOptionPane;
import modelo.Cajero;

public class App {
    public static void main(String[] args) throws Exception {
        int monto = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el monto a Retirar"));
        
        if (monto % 5 == 0) {
            Cajero cajero = new Cajero();
            cajero.retirar(monto);
            
            // Mostrar la cantidad de billetes impresos por denominación
        } else {
            JOptionPane.showMessageDialog(null, "Monto incorrecto, no se puede retirar");
        }
    }
}
