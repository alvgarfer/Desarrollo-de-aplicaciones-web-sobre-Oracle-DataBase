/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

public class Coche
{
    private String marca;
    private String modelo;
    private int precio;
    private int kms;
    private int id;
    private String nuevoViejo;

    public Coche(){}
    public Coche(String marca, String modelo, int precio, int kms, int id, String nuevoViejo)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.kms = kms;
        this.id = id;
        this.nuevoViejo = nuevoViejo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNuevoViejo() {
        return nuevoViejo;
    }

    public void setNuevoViejo(String nuevoViejo) {
        this.nuevoViejo = nuevoViejo;
    }
    
    
}

