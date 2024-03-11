package modelo;

public class Cajero implements ICajero{

    private ICajero sucesor;

    @Override
    public void retirar (int monto){
        Cien cien = new Cien();
        setSucesor(cien);
        /*Cincuenta cincuenta = new Cincuenta();
        setSucesor(cincuenta);
        Veinte veinte = new Veinte();
        setSucesor(veinte);
        Diez diez = new Diez();
        setSucesor(diez);
        Cinco cinco = new Cinco();
        setSucesor(cinco);*/

        sucesor.retirar(monto);

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


