// Demonstra caixas de seleção 

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class CBDemo implements ItemListener{

    JLabel jlabSelected; 
    JLabel jlabChanged; 
    JCheckBox jcbAlpha; 
    JCheckBox jcbBeta; 
    JCheckBox jcbGamma; 

    CBDemo() { 
        // Cria um container JFrame
        JFrame jfrm = new JFrame("Demonstra Check Box"); 
        // Especifica FlowLayout como gerenciador de layout
        jfrm.setLayout(new FlowLayout()); 
        // Fornece o tamanho inicial do quadro
        jfrm.setSize(280, 120); 
        // Encerra o programa quando o usuário fecha o aplicativo
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Cria rótulos vazios
        jlabSelected = new JLabel(""); 
        jlabChanged = new JLabel("");
        // Cria as caixas de seleção
        jcbAlpha = new JCheckBox("Alpha"); 
        jcbBeta = new JCheckBox("Beta"); 
        jcbGamma = new JCheckBox("Gamma"); 
         // Eventos gerados pelas caixas de seleção 
         // são tratado pelo método intemStateChange()
         // implementado por CBDemo.
         jcbAlpha.addItemListener(this);
         jcbBeta.addItemListener(this);
         jcbGamma.addItemListener(this); 
         // Adiciona as caixas de seleção e rótulos ao painel de conteúdo 
         jfrm.add(jcbAlpha); 
         jfrm.add(jcbBeta); 
         jfrm.add(jcbGamma); 
         jfrm.add(jlabChanged); 
         jfrm.add(jlabSelected); 
         // Exibe o quadro
         jfrm.setVisible(true);
    }

    // Este é o tratador das caixas de seleção
    public void itemStateChanged(ItemEvent ie) {
        String str = ""; 
        // Obtém uma referência a caixa de seleção que causou o evento
        JCheckBox cb = (JCheckBox) ie.getItem();
        // Relata que a caixa de seleção mudou
        if(cb.isSelected())
            jlabChanged.setText(cb.getText() + " was just selected!");
        else 
            jlabChanged.setText(cb.getText() + " was just cleared."); 
        // Relata todas as caixas selecionadas
        if(jcbAlpha.isSelected()) 
            str += "Alpha "; 
        if(jcbBeta.isSelected())
            str += "Beta "; 
        if(jcbGamma.isSelected())
            str += "Gamma "; 

        jlabSelected.setText("Selected check boxes: " + str);
    }

    public static void main(String[] args) {
        // Cria uma Thread de despacho para o evento 
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CBDemo();
            }
        });
    }
    
}
