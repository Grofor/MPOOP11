import hilos.HiloT;
import hilos.HiloR;//se importa la 2da clase

class Main {
  public static void main(String[] args) {
    HiloT miHilo1 = new HiloT(" Primer Hilo ");
    System.out.println("1er hilo");
    miHilo1.start();
    new HiloT(" Segundo Hilo ").start();

    // creamos hilo 3 y 4 que competirán con el hilo 1 y 2
    new Thread(new HiloR(), "Tercer Hilo ").start();
    new Thread(new HiloR(), "Cuarto Hilo ").start();

    for (int i = 0; i < 10; i++) {
      System.out.println("Iteracion " + i + " del Hilo Main");
    }

    System.out.println("Termina el hilo Hilo Main ");
  }
}