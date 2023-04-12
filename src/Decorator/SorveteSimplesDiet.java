/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author renan.mello
 */
//classe concreta que implementa a interface sorvete, é o sorvete mais simples Diet sem nenhum adicional
public class SorveteSimplesDiet implements Sorvete{

    @Override
    public double informarPreco() {
        return 2;
    }

    @Override
    public String informarComplementos() {
        return "Diet";
    }
    
}
