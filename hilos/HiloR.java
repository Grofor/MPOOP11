package hilos;
//es lo mismo que heredandod e thread, pero es más facil thread que runnable.
public class HiloR implements Runnable {

  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(" Iteración " + i + " del " + Thread.currentThread().getName());
    }
    System.out.println(" Termina el hilo " + Thread.currentThread().getName());// asi se implementan los getname de runnable;
  }
}