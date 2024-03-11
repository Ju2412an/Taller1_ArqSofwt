package modelo;
import javax.swing.JOptionPane;


public class Diez implements ICajero{

    ICajero sucesor;
    int cantidaddiez = 0;
    
    @Override
    public void retirar (int monto){
        if (monto >= 10)
        {
            int cantidad = monto / 10;
            cantidaddiez = cantidad %= 10;
            int restante = monto - (cantidaddiez * 10);
            JOptionPane.showMessageDialog(null, "Se retiraron " + cantidaddiez + " Billetes de 100");
            if (restante > 0) {
                sucesor.retirar(restante);
            }
        }
        
    }

    @Override
    public ICajero getSucesor(){
        return sucesor;
    }

    @Override
    public void setSucesor(ICajero sucesor){
        this.sucesor = sucesor;
    }    
}

