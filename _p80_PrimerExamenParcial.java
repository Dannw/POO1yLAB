// Primer Examen Parcial

import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        int part = 0, i, TotAlu=0, TotDoc=0, TotTra=0, TotMuj=0, TotHom=0, DinA=50, DinD=80 ,DinT=60;
        float edad, sumaEdades=0;
        String nombre;
        char opc, opc2;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Hola! Bienvenido");
        System.out.print("\nCuantos participantes son el día de hoy?: ");
        part = obj.nextInt();
        obj.nextLine();

        for ( i = 1; i <= part; i++) {
            System.out.print("\nNombre: "); nombre = obj.nextLine();
            System.out.print("\nEdad: "); edad = obj.nextInt();
            obj.nextLine(); 
            if (edad < 18) {
                System.out.print("Lo siento, solo aceptamos a mayores de edad");
            } else {
                sumaEdades += edad;
                System.out.print("\nSexo [H]ombre o [M]ujer:  "); opc = Character.toUpperCase(obj.next().charAt(0));
                obj.nextLine(); 

                if ( opc == 'H') {
                    TotHom++;
                } else if ( opc == 'M') {
                    TotMuj++;
                } else break;
            

                System.out.print("\nTipo de participante ¿Eres [A]lumno, [D]ocente o [T]rabajador? "); opc2 = Character.toUpperCase(obj.next().charAt(0));
                obj.nextLine(); 

                if (opc2 == 'A') {
                    System.out.print("Los alumnos tienen que pagar un costo de $50 ");
                    TotAlu++;
                    DinA++;
                } else if (opc2 == 'D') {
                    TotDoc++;
                    DinD++;
                    System.out.print("Los Docentes tienen que pagar un costo de $80 ");
                } else if (opc2 == 'T') {
                    TotTra++;
                    DinT++;
                    System.out.print("Los Trabajadores tienen que pagar $60  ");
                }
                
                
            }
        }
        float prom = sumaEdades / part;
        System.out.print("\nEl total de Alumnos es " + TotAlu);
        System.out.print("\nEl total de Docentes es " + TotDoc);
        System.out.print("\nEl total de Trabajadores es " + TotTra);
        System.out.print("\nEl total de Hombres es " + TotHom);
        System.out.print("\nEl total de Mujeres es " + TotMuj);
        System.out.print("\nEl total de Todos los participantes es " + part);
        System.out.print("\nEl promedio de la edad de Todos es " + prom);

        int Total = DinA + DinD + DinT;
        System.out.print("\n-----Total DINERO RECUADADO------");
        System.out.print("\nEL dinero recaudado por alumnos es $" + DinA);
        System.out.print("\nEL dinero recaudado por Docentes es $" + DinD);
        System.out.print("\nEL dinero recaudado por Trabajadores es $" + DinT);
        System.out.print("\nEL dinero recaudado Total es de $" + Total);


        if (Total < 100) {
            System.out.print(":(");
            System.out.print("\nParece que hubieron ganancias bajas");

        } else if ( Total > 100 || Total < 200 ) {
            System.out.print("\nEl evento concluye con gancias MODERADAS!");
            
        } else if ( Total > 200 ){
            System.out.print("\nHUBIERON GANACIAS BUENAAAS!!");
        }
        System.out.print("\nGracias por utilizar este codigo, fue hecho por Daniel Varela García;) un saludo adioos");
    }   
        
}