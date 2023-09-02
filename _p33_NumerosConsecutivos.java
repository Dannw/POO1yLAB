// Dado tres numeros verificar si son consecutivos

import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("Dame tres numeros\n");
        Scanner obj = new Scanner(System.in);
        int num1, num2, num3; 
        
        System.out.print("Dame el primero numero: "); num1 = obj.nextInt();
        System.out.print("Dame el segundo numero: "); num2 = obj.nextInt();
        System.out.print("Dame el tercer numero: "); num3 = obj.nextInt();


        // Aquí sumo el primer numero para verificar que si sumando una unidad es igual al segundo, y sí ese es el caso
        // Sumar el segundo numero más uno para verificar con el tercero, y así lo mismo restando
        if ((num1 + 1 == num2 && num2 + 1 == num3) || (num1-1 == num2 && num2 - 1 == num3)) {
            System.out.print("Los numeros dados son consecutivos");
        }  else {
            System.out.print("Los numeros dados no son consecutivos:(");
        }


        

        
    }
}
