// Programa Swing simples 

import javax.swing.*;

class SwingDemo { 

    SwingDemo() {
    // Cria um ocntainer JFrame
    JFrame jfrm = new JFrame("A Simple Swing Application!");
    // Fornece um tamanho inicial para o quadro 
    jfrm.setSize(275,100);
    // Encerra o programa quando o usuário fecha o palicativo 
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Cria umrítulo baseado em texto 
    JLabel jlab = new JLabel("Swing defines the modern Java GUI.");
    // Adiciona o rótulo ao painel de conteúdo 
    jfrm.add(jlab); 
    // Exibe o quadro
    jfrm.setVisible(true);
    }
    
    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento. 
        SwingUtilities.invokeLater(new Runnable() {
            public void run() { 
                new SwingDemo();
            }
        });
    }
}