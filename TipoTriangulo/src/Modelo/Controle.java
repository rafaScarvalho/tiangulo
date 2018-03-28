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
public class Controle extends absPropriedades
{
   
    

    public Controle(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
        Verificar();
    }
    
    
    private void Verificar()
    {
        this.setMensagem("");
         Validacao validacao = new Validacao(this.getLado1(), this.getLado2(), this.getLado3());
         if (validacao.getMensagem().equals(""))
         {
             Triangulos triangulos = new Triangulos(validacao.getL1(), validacao.getL2(), validacao.getL3());
             setResposta(triangulos.getResposta());
         }
         else
         {
             setMensagem(validacao.getMensagem());
         }
    }
}
