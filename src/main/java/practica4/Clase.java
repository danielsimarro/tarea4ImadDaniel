/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author NitroPc
 */
public class Clase {
    private int altura;
    
    private String camiseta;
    
    private boolean pantalones;
    
    private double peso;

    public Clase(int altura, String camiseta, boolean pantalones, double peso) {
        this.altura = altura;
        this.camiseta = camiseta;
        this.pantalones = pantalones;
        this.peso = peso;
    }

    public Clase() {
    }

    public int getAltura() {
        return altura;
    }

    public String getCamiseta() {
        return camiseta;
    }

    public boolean isPantalones() {
        return pantalones;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setCamiseta(String camiseta) {
        this.camiseta = camiseta;
    }

    public void setPantalones(boolean pantalones) {
        this.pantalones = pantalones;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}

