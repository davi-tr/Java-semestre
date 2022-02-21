package com.atividade1;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        String dados = "";
        float base = 0, altura = 0, perimetro = 0, area = 0;

        dados = JOptionPane.showInputDialog("Informe o valor da base");
        base = Float.parseFloat(dados);

        dados = JOptionPane.showInputDialog("Informe a altura");
        altura = Float.parseFloat(dados);

        perimetro = (base*2)+(altura*2);
        area = base*altura;

        JOptionPane.showMessageDialog(null,"O perimetro é: " + perimetro);
        JOptionPane.showMessageDialog(null,"A area é: " +area);

    }
}
