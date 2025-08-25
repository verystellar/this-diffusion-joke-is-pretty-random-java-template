package org.example;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Diffusion {
  // This is just an example class to demonstrate how everything works
  // You should delete this file when you implement your own
  public int pos;
  public Random rand = new Random();

  public int walk() {
    int walk = rand.nextInt(2);
    return walk;
  }

  public int simulate(int walk_count){
    if (pos != 0){
      pos = 0;
    }
    for(int i = 0; i < walk_count; i++){
      if (walk() == 0){
        pos -= 1;
      } else {
        pos += 1;
      }
    }

//    System.out.println("Position after " + walk_count + " steps is " + pos + ".");
    return 1;
  }
  public int get_pos(){
    return pos;
  }
}
