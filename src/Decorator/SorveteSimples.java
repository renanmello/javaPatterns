/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author renan.mello
 */
//classe concreta que implementa a interface sorvete, é o sorvete mais simples sem nenhum adicional
public class SorveteSimples implements Sorvete{

    @Override
    public double informarPreco() {
       return 1.5;
    }

    @Override
    public String informarComplementos() {
       return "";
    }
    
}
