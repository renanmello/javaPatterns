/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author renan.mello
 */
//classe concreta que ira adicionar cobertura ao sorvete, ela extende o decorator
public class Comcobertura extends DecoratorSorvete {
    String sabor;
    public Comcobertura(Sorvete sorvete, String sabor) {
        super(sorvete);
        this.sabor=sabor;
    }

    @Override
    public double informarPreco() {
        return super.informarPreco() + 0.50;
    }

    @Override
    public String informarComplementos() {
        return super.informarComplementos() + " com cobertura de "+this.sabor;
    }
}
