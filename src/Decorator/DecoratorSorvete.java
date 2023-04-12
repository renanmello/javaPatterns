/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author renan.mello
 */

//classe abstrata decorator que implementa o sorvete e vai ser implementada por classes concretas que adicionam as opções  
abstract public class DecoratorSorvete implements Sorvete {

    private final Sorvete sorveteDecorator;

    public DecoratorSorvete(Sorvete sorvete) {
        this.sorveteDecorator = sorvete;

    }

    @Override
    public double informarPreco() {
        return sorveteDecorator.informarPreco();
    }

    @Override
    public String informarComplementos() {
        return sorveteDecorator.informarComplementos();

    }

    public Sorvete getSorvete() {
        return sorveteDecorator;
    }
}
