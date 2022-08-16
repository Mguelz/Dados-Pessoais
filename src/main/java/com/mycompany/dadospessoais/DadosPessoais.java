package com.mycompany.dadospessoais;

import javax.swing.JOptionPane;

/**
 * @author Miguel Arcanjo
 * Com o intuito de Estudar mais sobre a classe JOptionPane
 */
public class DadosPessoais {

    public static void main(String[] args) {
            
    // variaveis
    String nome;
    int idade;
    double peso;
    String estado;
    
    
    // entrada de dados
    nome = JOptionPane.showInputDialog(null, "Insira o seu nome: ", "Digite seu nome e sobrenome", JOptionPane.PLAIN_MESSAGE);
    idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o sua idade: ", "Digite sua idade", JOptionPane.PLAIN_MESSAGE));
    peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o seu peso: ", "Digite seu peso usando .(ponto) como divisor", JOptionPane.PLAIN_MESSAGE));        
    estado = JOptionPane.showInputDialog(null, "Insira o seu estado: ", "Digite o nome do estado que você esta atualmente", JOptionPane.PLAIN_MESSAGE);
    
    // saida de dados unitarios
    JOptionPane.showMessageDialog(null, "seu nome é: " + nome, "Saída de dados separados", JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null, "sua idade é: " + idade, "Saída de dados separados", JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null, "seu peso é: " + peso, "Saída de dados separados", JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null, "seu estado é: " + estado, "Saída de dados separados", JOptionPane.PLAIN_MESSAGE);
    
    // saida de todos os dados juntos
    JOptionPane.showMessageDialog(null, "Nome: " + nome + " | Idade: " + idade + " | Peso: " + peso + " | Estado: " + estado, "Todos os dados juntos", JOptionPane.PLAIN_MESSAGE);
    
    
    }
}
