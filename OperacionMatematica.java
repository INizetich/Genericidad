public class OperacionMatematica<T extends Number>{
private T numero1;
private T numero2;

    public OperacionMatematica(){

    }

  public void setNumeros(T numero1, T numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
  }


    public double suma(){
        double resultado = numero1.doubleValue() + numero2.doubleValue();

        return resultado;
    }

     public double resta(){
        double resultado = numero1.doubleValue() - numero2.doubleValue();
        return resultado;
     }

     public double multiplicacion(){
        double resultado = numero1.doubleValue() * numero2.doubleValue();
        return resultado;
     }
     public double division(){
        double resultado = numero1.doubleValue() / numero2.doubleValue();
        return resultado;
     }
}
