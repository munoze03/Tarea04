/**
 * Clase Principal que ejecuta el programa
 */
package cuentas;
public class Main {

/**
 * Metodo Main principal que crea la cuenta.
 */
    public static void main(String[] args) {
    	/**
    	 * Establecemos los atributos de la cuenta nueva.
    	 */
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = operativo_Cuenta();

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

/**    
 * @return. Metodo que genera una cuenta nueva estableciendo
 * los parametros de entrada como nombre, numero de cuenta y 
 * saldo y nos devuelve dichos datos.
 */
	private static CCuenta operativo_Cuenta() {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
		return cuenta1;
	}
}
