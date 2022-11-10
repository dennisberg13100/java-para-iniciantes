// usa  um campo de texto 

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class TFDemo implements ActionListener {

    JTextField jtf;
    JButton jbtnRev; 
    JLabel jlabPrompt, jlabContents; 
    
    TFDemo () {
        //Cria um container JFrame
        JFrame jfrm = new JFrame("Use a Text Field."); 
        // Especifica FlowLayout como gerenciador de layout
        jfrm.setLayout(new FlowLayout()); 
        // Fornece um tamanho inicial para o quadro 
        jfrm.setSize(240,120); 
        // Encerra o programa quando o usuário fecha o aplicativo
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // cria um campo de texto 
        jtf = new JTextField(10); 
        // Define os comandos de ação do campo de texto
        jtf.setActionCommand("myTF");
        // Cria o botão reverse
        JButton jbtnRev = new JButton("Reverse"); 
        // Adiciona ouvintes de ação 
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);
        // Cria os rótulos
        jlabPrompt = new JLabel("Enter text: ");
        jlabContents = new JLabel("");
        // Adiciona os componentes ao painel de conteúdo 
        jfrm.add(jlabPrompt);
        jfrm.add(jtf); 
        jfrm.add(jbtnRev); 
        jfrm.add(jlabContents); 
        // Exibe o quadro 
        jfrm.setVisible(true);
    }
    // Trata eventos de ação
    public void actionPerformed(ActionEvent ae) { 
        if(ae.getActionCommand().equals("Reverse")) { 
            // O botão reverse foi pressionado 
            String  orgStr = jtf.getText(); 
            String resStr = ""; 
            // Inverte o string do campo de texto 
            for(int i = orgStr.length() - 1; i >= 0; i--) 
                resStr += orgStr.charAt(i); 
            // Armazena o String invertido no campo de text
            jtf.setText(resStr);
        } else {
            // Enter foi pressionado enquanto o foco estava no campo de texto
            jlabContents.setText("You pessed ENTER. Text is: " + jtf.getText());
        }
    }

    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento. 
        SwingUtilities.invokeLater(new Runnable() {
            public void run() { 
                new TFDemo();
            }
        });
    }
}
