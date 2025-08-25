package org.example;

public class App {
    public static void main(String[] args) {
      Diffusion generator = new Diffusion();
      for(int i = 10; i<=510; i+=100){
          int m = 10;
          while (m>0){
              generator.simulate(i);
              System.out.print("Step count: " + i + " Trial: " + (11-m) + " Final Position: ");
              System.out.print(generator.get_pos() + "\n");
              m--;
          }
      }
    }
}
