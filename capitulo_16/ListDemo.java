// Demonsta uma JList simples 

import javax.swing.*; 
import javax.swing.event.*;
import java.awt.*; 
import java.awt.event.*; 

public class ListDemo implements ListSelectionListener{
    JList<String> jlst; 
    JLabel jlab; 
    JScrollPane jscrlp; 
    // Cria uma array de nomes 
    String names[] = { "Sherry", "Jon", "Rachel", 
                        "Sasha", "Josselyn", "Randy",
                        "Tom", "Mary", "Ken", 
                        "Andrew", "Mat", "Todd" } ;
    ListDemo() { 
        // Cria um container JFrame
        JFrame jfrm= new JFrame("JList Demo.");
        // Especifica um layout de fluxo 
        jfrm.setLayout(new FlowLayout());
        // fornece o tamanho inicial do quadro 
        jfrm.setSize(200, 160); 
        // Encerra o programa quando o usuário fecha o programa 
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Cria uma JList
        jlst = new JList<String>(names); 
        // Define o modo de seleção da lista como a seleção simples
        jlst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        // Adiciona a Lista a um painel de roalgem 
        jscrlp = new JScrollPane(jlst); 
        // Define um tamanho para o painel de rolagem 
        jscrlp.setPreferredSize(new Dimension(120, 90));
        // Cria um rótulo para exibir a seleção
        jlab = new JLabel("Please chose a name."); 
        // Adiciona o tratador da seleção 
        jlst.addListSelectionListener(this); 
        // Adiciona a lista e o rótulo ao painel de conteúdo
        jfrm.add(jscrlp); 
        jfrm.add(jlab); 
        // Exibe o quadro
        jfrm.setVisible(true);
    }
    // Trata eventos de seleção na lista 
    public void valueChanged(ListSelectionEvent le) { 
        // Obtém o indice do item alterado
        int idx = jlst.getSelectedIndex(); 
        // Exibe a seleção, se um item foi selecionado. 
        if(idx != -1) 
            jlab.setText("Current selection: " + names[idx]); 
        else 
            jlab.setText("Please choose a name.");
    }
    public static void main(String[] args) {
        // Cria a Thread no quadro de despacho da thread 
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListDemo();
            }
        });    
    }
}
