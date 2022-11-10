// Demonstra um botão de ação e trata eventos de ação

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener{
    
    JLabel jlab; 

    ButtonDemo() { 

        // Cria um container JFrame
        JFrame jfrm = new JFrame("A button example."); 
        // Especifica FlowLayout como gerenciador de layout
        jfrm.setLayout(new FlowLayout());
        // fornece um tamanho inicial para o quadro
        jfrm.setSize(220, 90); 
        // Encerra o programa quando o usuário fecha o aplicativo 
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Cria dois botões 
        JButton jbtnUp = new JButton("Up"); 
        JButton jbtnDown = new JButton("Down"); 
        // Adiciona ouvintes de ação
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);
        // Adiciona os dois botões ao painel de conteúdo 
        jfrm.add(jbtnUp); 
        jfrm.add(jbtnDown); 
        // Cria um rótulo. 
        jlab = new JLabel("Press a Button"); 
        // Adiciona um rótulo ao quadro
        jfrm.add(jlab); 
        //Exibe o quadro
        jfrm.setVisible(true);
    }

    // Trata dos eventos de botão 
    public void actionPerformed(ActionEvent ae) { 
        if(ae.getActionCommand().equals("Up"))
            jlab.setText("You pressed Up.");
        else
            jlab.setText("You pressed Down.");
    }

    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento
        SwingUtilities.invokeLater(new Runnable() {
           public void run() { 
            new ButtonDemo();
           } 
        });
    }
}
