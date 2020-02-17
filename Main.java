
package pkg12022020;

public class Main {
//Operadores Aritmeticos
//Aritmeticos (+)(-)(*)(/)(%)
    /**
     * 
     * @param argumentos
     * @return 
     */
    public double sumar(double...argumentos){
        double resultado = 0.00;
        for (int i = 0; i < argumentos.length; i++) {
            resultado = resultado + argumentos[i];
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(new Main().sumar(2,3,4));
    }
    
}
