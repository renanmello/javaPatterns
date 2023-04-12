/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author renan.mello
 */
//classe concreta que ira adicionar casquinha ao sorvete, ela extende o decorator
public class ComCasquinha extends DecoratorSorvete{
    
    public ComCasquinha(Sorvete sorvete) {
        super(sorvete);
    }
     @Override
    public double informarPreco() {
        return super.informarPreco() + 1.50;
    }

    @Override
    public String informarComplementos() {
        return super.informarComplementos() + " ,servido na casquinha";
    }
}
