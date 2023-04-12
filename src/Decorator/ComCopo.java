/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author renan.mello
 */
//classe concreta que ira adicionar copo ao sorvete, ela extende o decorator
public class ComCopo extends DecoratorSorvete {

    public ComCopo(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double informarPreco() {
        return super.informarPreco() + 0.20;
    }

    @Override
    public String informarComplementos() {
        return super.informarComplementos() + " , servido no copo";
    }
}
