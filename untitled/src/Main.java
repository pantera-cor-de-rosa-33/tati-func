public class Main {
    public static void main(String[] args) {
        
    }

    public static int fatorial(int num  ){
        int result =1;
        for(int i = 1;i <= num;i++){
            result *= i;
        }
        return result;
    }
      
    public static int soma(int a, int b) {
        return a + b;
    }

    public static boolean ePar(int num){
        if (num % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }

}
