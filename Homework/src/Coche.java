public class Coche {

    int NumeroDePuertas=0;

    public void IncrementarPuerta(){

        this.NumeroDePuertas++;
    }

    public void MostrarNumeroDePuertas(){

        System.out.println("La Cantidad de Puertas es : "+NumeroDePuertas);
    }

    public static void main(String[] args){

        Coche miCoche=new  Coche();
        miCoche.IncrementarPuerta();
        miCoche.IncrementarPuerta();
        miCoche.IncrementarPuerta();
        miCoche.IncrementarPuerta();


        miCoche.MostrarNumeroDePuertas();
    }
}
