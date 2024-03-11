import javax.swing.JOptionPane;

import modelo.ICajero;

public class Diez implements ICajero{

    ICajero sucesor;
    int cantidadveinte;
    @Override
    public void retirar (int monto){
        int cantidad = monto %= 100;
        JOptionPane.showMessageDialog(null, "Billetes de 100:" + cantidad);
        
    }

    @Override
    public ICajero getSucesor(){
        return sucesor;
    }

    @Override
    public void setSucesor(ICajero sucesor){
        this.sucesor = sucesor;
    }

    @Override
    public int getCantidadBilletesImpresos() {
        return cantidadveinte; 
    }
}
