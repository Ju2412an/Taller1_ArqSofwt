package modelo;

public interface ICajero {

    public void retirar(int monto);

    public ICajero getSucesor();

    public void setSucesor(ICajero sucesor);

}
