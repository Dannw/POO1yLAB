// inicializar de forma manual un arreglo de numeros floates y lo imprime

public class _p81_InicializaArregloNumeros {
    public static void main(String[] args) {
     
        double[] nums = new double[7];
        nums[0] = 5.0;
        nums[1] = 10.0;
        nums[2] = 15.5;
        nums[3] = 20.5;
        nums[4] = 25.0;
        nums[5] = 100.22;
        nums[6] = 90.0;
        nums[7] = 666;
        // hacer un nums[8] no se puede porque se pasa del limite
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("\nEl primer elemento del arreglo es " + nums[0]);
        System.out.print("\nEl ultimo elemento del arreglo es " + nums[6]);

        System.out.println("\nTodos los valores del arreglo con un circulo tradicional");
        for (int i=0; i < 7; i++){
            System.out.println( nums[i] );
        }
        System.out.print("\nTodos los valores del arreglo con un ciclo for - each: ");
        for (double num : nums )
            System.out.println(num);


    }
    
}
