package modelo;

import javax.swing.JOptionPane;

public class Veinte implements ICajero{

    ICajero sucesor;
    int cantidadveinte = 0;
    
    @Override
    public void retirar (int monto){
        if (monto >= 20)
        {
            int cantidad = monto / 20;
            cantidadveinte = cantidad %= 20;
            int restante = monto - (cantidadveinte * 20);
            JOptionPane.showMessageDialog(null, "Se retiraron " + cantidadveinte + " Billetes de 100");
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

