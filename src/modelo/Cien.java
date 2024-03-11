package modelo;

import javax.swing.JOptionPane;

public class Cien implements ICajero{

    ICajero sucesor;
    int cantidadcien = 0;
    
    @Override
    public void retirar (int monto){
        if (monto >= 100)
        {
            int cantidad = monto / 100;
            cantidadcien = cantidad %= 100;
            int restante = monto - (cantidadcien * 100);
            JOptionPane.showMessageDialog(null, "Se retiraron " + cantidadcien + " Billetes de 100");
            if (restante > 0) {
                sucesor.retirar(restante);
            }
            else {
                sucesor.retirar(monto); 
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

