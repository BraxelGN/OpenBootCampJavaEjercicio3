public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=50;
      var resultado = suma (x,y,z);
      System.out.println("resultado: " + resultado);
      
      coche coche1 = new coche();
      coche1.aumentarPuertas();
      System.out.println("Cantidad de puertas: " + coche1.puertas);
    }
    public static int suma (int a,int b, int c)
    {
        return a+b+c;
    }
}

class coche{
    int puertas=0;
    public void aumentarPuertas()
    {
        this.puertas++;
    }
}
