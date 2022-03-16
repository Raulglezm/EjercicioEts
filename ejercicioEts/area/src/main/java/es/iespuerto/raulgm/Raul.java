package es.iespuerto.raulgm;

public class Raul {

    String tipo;
    Integer valor1;
    Integer valor2;

    /**
     * Constuctor por defecto
     */
    public Raul() {
    }

    /**
     * Costructor con un parametro
     * @param valor1 de la clase
     */
    public Raul(Integer valor1) {
        this.valor1 = valor1;
    }

    /**
     * Costructor con un parametro
     * @param valor2 de la clase
     */
    public Raul(Integer valor1, Integer valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    /**
     * metodo que calcula el area de la clase
     * @param valor1 de la clase
     * @param valor2 de la clase
     */
    public void calculoArea(Integer valor1, Integer valor2){

    }

    //getters y setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getValor1() {
        return valor1;
    }

    public void setValor1(Integer valor1) {
        this.valor1 = valor1;
    }

    public Integer getValor2() {
        return valor2;
    }

    public void setValor2(Integer valor2) {
        this.valor2 = valor2;
    }
}
