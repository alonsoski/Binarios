import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        while (3==3){
            //int numero = definirNumeroD();

            //convertirABinario(numero);
            int numero2 = definirNumeroB();
            convertirADecimal(numero2);

        }
    }

    private static void convertirADecimal(int numero2) {
        String num= Integer.toString(numero2);
        int numeroAEntregar=0;
        for (int i = 0; i <num.length() ; i++) {

            numeroAEntregar+= (int) Math.pow(Character.getNumericValue(num.charAt(i)*2),i);
            System.out.println(numeroAEntregar);
        }
        System.out.println("el numero es "+numeroAEntregar);
    }

    private static int definirNumeroB() {
        Scanner t=new Scanner(System.in);
        int numero=-1;
        while(!validacionDBinario(numero)){
            try {
                System.out.println("Hola, ingrese un numero binario, no debe contener caracteres que no sean 1 o 0 y no debe tener un largo mayor a 8");
                System.out.println("yo lo convertire en decimal y lo mostrare por pantalla");
                numero=t.nextInt();
                boolean validacion=validacionDBinario(numero);

            }catch (Exception e){
                System.out.println("eso no se puede");
                numero=-1;
                t.nextLine();
            }
        }
        return numero;

    }

    private static boolean validacionDBinario(int numero) {
        String num = Integer.toString(numero);
        System.out.println("El numero es este parce "+num);
        System.out.println("el largo es este parce "+num.length());
        boolean validacion= true;
        for (int i = 0; i <(num.length()) ; i++) {

            if (!(num.charAt(i)=='1')&&!(num.charAt(i)=='0')){
                validacion = false;

                System.out.println("efectivamente "+num.charAt(i)+"no es ni 0 ni uno");

            }
        }
        if (num.length()>8 || num.length()<1){
            validacion=false;
        }
        System.out.println(validacion);

        return validacion;
    }

    private static void convertirABinario(int numero) {
        String binario = Integer.toBinaryString(numero);
        while (binario.length()<8){
            binario="0"+binario;
        }
        System.out.println("el numero "+numero+" en binario es:"+binario);

    }

    private static int definirNumeroD() {
        Scanner t=new Scanner(System.in);
        int numero=-1;
        while(numero<0 || numero>255){
            try {
                System.out.println("Hola, ingrese un numero mayor o igual a 0 y no mayor que 255 porfavor");
                System.out.println("yo lo convertire en binario y lo mostrare por pantalla");
                numero=t.nextInt();
                if (numero<0 || numero>255){
                    System.out.println("error");
                }

            }catch (Exception e){
                System.out.println("eso no se puede");
                numero=-1;
                t.next();
            }
        }
        return numero;
    }
}