package modelo;

import javax.swing.JOptionPane;

public class Cincuenta implements ICajero{

    ICajero sucesor;
    int cantidadcincuenta = 0;
    
    @Override
    public void retirar (int monto){
        if (monto >= 50)
        {
            int cantidad = monto / 50;
            cantidadcincuenta = cantidad %= 50;
            int restante = monto - (cantidadcincuenta * 50);
            JOptionPane.showMessageDialog(null, "Se retiraron " + cantidadcincuenta + " Billetes de 100");
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

