public class Main {
    public static void main(String[] args) {
        
    }

    public static String inverterString (String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }



    public static int medi(int num1,int num2,int num3){
        int result = (num1+ num2 + num3 ) / 3;
        return result;

    }

  
    public static int contarVogais (String str) {
        int contador = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;

            }
        }
        return contador;
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
