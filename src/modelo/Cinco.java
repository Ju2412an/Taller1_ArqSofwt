package modelo;
import javax.swing.JOptionPane;

public class Cinco implements ICajero{

    ICajero sucesor;
    int cantidadcinco = 0, restante = 0;
    
    @Override
    public void retirar (int monto){
        if (monto >= 10)
        {
            int cantidad = monto / 10;
            cantidadcinco = cantidad %= 10;
            restante = monto - (cantidadcinco * 10);
            JOptionPane.showMessageDialog(null, "Se retiraron " + cantidadcinco + " Billetes de 100");

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

