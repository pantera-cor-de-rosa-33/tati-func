//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int s = soma(56, 67);
        System.out.println("Soma de 56 + 67 = " + s);
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
