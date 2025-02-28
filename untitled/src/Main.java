//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Tati");
    }

    public static int fatorial(int num  ){
        int result =1;
        for(int i = 1;i <= num;i++){
            result *= i;
        }
        return result;
    }

}
