/**
 * Clase que crea la cuenta bancaria de un cliente.
 * @author Enrique Muñoz Diez
 * @version 1.0
 */
package cuentas;
public class CCuenta {


    private String nombre;
	private String cuenta;
    private double saldo;
    private double tipoInteres;

/**
 * @return Metodo que nos devuelve el nombre de la cuenta
 */
    public String getNombre() {
		return nombre;
	}

/**    
 * @param nombre Metodo que establece el nombre de la cuenta
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
/**
 * @return Metodo que nos devuelve la cuenta bancaria
 */
	public String getCuenta() {
		return cuenta;
	}
	
/**
 * @param cuenta Metodo que establece el numero de cuenta
 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

/**
 * @return Metodo que nos devuelve el saldo de la cuenta
 */
	public double getSaldo() {
		return saldo;
	}

/**	
 * @param saldo Metodo que establece el saldo de la cuenta.
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

/**
 * @return Metodo que nos devuelve el tipo de interes
 */
	public double getTipoInteres() {
		return tipoInteres;
	}

/**	
 * @param tipoInteres Metodo que establece el tipo de interes
 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	// Creacion de contructor predeterminado sin parametros.
    public CCuenta()
    {
    }

    // Creacion de constructor con parametros.
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

 /**
  * @return Metodo que nos devuelve el Saldo de la cuenta actual
  */
    public double estado()
    {
        return saldo;
    }

/**
 * 
 * @param cantidad. Cantidad de dinero a ingresar en la cuenta
 * @throws Exception. Excepcion que se muestra para no ingresar cantidad negativa.
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

/**
 * 
 * @param cantidad. Cantidad de dinero a retirar en la cuenta
 * @throws Exception. Excepcion que se muestra para no retirar cantidad negativa.
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
