package Modul9.Static;

class CounterMachine{
    static int counter;
    public static void count() {
        counter++;
    }
}

public class StaticMethod {
    public static void main(String args[]){
        for(int i = 0; i< 10; i++){
            if( i % 2 == 0){
                CounterMachine.count();
            }
        }
        System.out.println(CounterMachine.counter);
    }
}
