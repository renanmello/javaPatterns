/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author renan.mello
 */
//metodo principal para testar o app sorvete
public class Main {

    //metodo que imprime o valor final e os complementos
    public static void imprimir(Sorvete s) {
        if (s.informarComplementos().equals("")) {
            System.out.println("Complementos: sem complementos");
            System.out.println("Preco final:" + s.informarPreco());
        } else {
            System.out.println("Complementos: " + s.informarComplementos());
            System.out.println("Preco final:" + s.informarPreco());
        }

    }

    public static void main(String[] args) {

        // teste sorvete simples
        Sorvete s = new SorveteSimples();
        imprimir(s);

        // adiciona cobertura e casquinha
        s = new Comcobertura(s,"morango");
        s = new ComCasquinha(s);
        imprimir(s);

        //cria um sorvete Diet
        Sorvete s2 = new SorveteSimplesDiet();
        imprimir(s2);

        //adiciona copo
        s2 = new ComCopo(s2);
        imprimir(s2);

        //adiciona cobertura
        s2 = new Comcobertura(s2, "chocolate");
        imprimir(s2);

    }
}
