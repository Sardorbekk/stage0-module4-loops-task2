package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
     int i=0;
     int j;
     if (power<0){
         System.out.println("too much power");
     }
    else{ while(i<=power){
         j= (int) Math.pow(2.0,i);
         System.out.println(j);
         i++;

     }}
    }
}
