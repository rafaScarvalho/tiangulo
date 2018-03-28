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
public class Triangulos extends absPropriedades
{

    public Triangulos(Double l1, Double l2, Double l3)
    {
        super(l1, l2, l3);
        Verificar();
    }
    
    private void Verificar()
    {
        if (this.getL1().equals(this.getL2()) && this.getL1().equals(getL3()))
        {
            this.setResposta("triangulo Equilatero");
        }
        else
        {
            if (this.getL1().equals(this.getL2()) || this.getL2().equals(this.getL3()) || this.getL1().equals(this.getL3()))
            {
                this.setResposta("triangulo isósceles");
            }
        }
        if (this.getL1() != this.getL2() && this.getL2() != this.getL3() && this.getL3() != this.getL1())
        {
            this.setResposta("triangulo escaleno");
        }
    }
}
