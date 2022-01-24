
package cuentas;
/**
 * Esta clase simula el comportamiento de una cuenta bancaria
 * 
 * @author junte
 * @version 1.0
 * @since 24/01/2022
 * 
 **/
public class CCuenta {
    /**
     * Atributos
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Constructor vacío
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con los siguientes parámetros
     * @param nom String, nombre del titular
     * @param cue String, número de cuenta
     * @param sal double, saldo de la cuenta
     * @param tipo double, tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * 
     * @return el saldo de la cuenta 
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * 
     * @param cantidad a ingresar en la cuenta
     * @throws Exception devuelta en caso de que se ingrese una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * 
     * @param cantidad a retirar de una cuenta
     * @throws Exception devuelta en caso de que se introduzca un número negativo o se haya puesto una cantidad > saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /**
     * 
     * @return el nombre del titular de la cuenta 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre de titular a pasarle como parámetro 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return el nº de cuenta 
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * 
     * @param cuenta,nº cuenta a pasarle como parámetro 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * 
     * @return el saldo de la cuenta 
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * 
     * @param saldo a pasarle como parámetro 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * 
     * @return el tipo de interés 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * 
     * @param tipoInterés a pasarle como parámetro 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

