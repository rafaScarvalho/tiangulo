/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author n221216
 */
public class Validacao extends absPropriedades
{

    public Validacao(String lado1,String lado2,String lado3)
    {
        super(lado1, lado2, lado3);
        Validar();
    }
    
    private void Validar()
    {
        this.setMensagem("");
        try
        {
            this.setL1((Double) Double.parseDouble(getLado1()));
            this.setL2((Double) Double.parseDouble(getLado2()));
            this.setL3((Double) Double.parseDouble(getLado3()));
        }
        catch (Exception e)
        {
            this.setMensagem("valor invalido");
        }
        
       
        if(this.getL1()+this.getL2()>this.getL3())
        {
            this.setMensagem("não é um triangulo");
        }
        if(this.getL2()+this.getL3()>this.getL1())
        {
            this.setMensagem("não é um triangulo");
        }
        if(this.getL3()+this.getL1()>this.getL2())
        {
            this.setMensagem("não é um triangulo");
        } 
    }
}
