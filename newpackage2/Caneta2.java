/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

/**
 *
 * @author clara
 */
public class Caneta2 {
    
    private String modelo = "BIC";
    private String cor;
    private float ponta;
    private int carga = 4;
    private boolean tampada = true;
    
    public void status(){
    
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        this.rabiscar();
        
    }

    public Caneta2(String cor, float ponta) {
        this.cor = cor;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    public void rabiscar(){
        
        if (tampada == true){
            
            System.out.println("Não posso rabiscar, caneta tampada.");
            
        }else{
            
            System.out.println("Rabiscando~~~");
            
        }
        
    }
    
}
