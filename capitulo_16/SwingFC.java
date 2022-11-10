// Utilitário de comparação de arquivos baseado em Swing

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class SwingFC implements ActionListener {
    JTextField jtfFirst; // Contém o nome do primeiro arquivo
    JTextField jtfSecond; // contém o nome do segundo arquivo 
    JButton jbtnComp; // Botão para comparar os aquivos 
    JLabel jlabFirst, jlabSecond; //Exibe os avisos
    JLabel jlabResult; // exibe resultados e mensagens de erro
    JCheckBox showMismachtCB;
    int position = 0;
    boolean showMismacht;

    SwingFC() { 
        // Cria um container JFrame
        JFrame jfrm = new JFrame("Compare Files"); 
        // Especifica FlowLayout como gerenciador de layout 
        jfrm.setLayout(new FlowLayout()); 
        // Fornece o tamanho inicial do quadro 
        jfrm.setSize(200,230); 
        // Encerra o ṕrograma quando o usuário fecha op aplicativo 
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        // Cria compos de text para os nomes dos arquivos
        jtfFirst = new JTextField(14); 
        jtfSecond = new JTextField(14); 
        // Defina os comandos de ação para o botão Compare
        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");
        // Cria o checkbox para mostrar a posição do missmacht
        showMismachtCB = new JCheckBox("Show missmacht location");
        // Cria o botão compare
        jbtnComp = new JButton("Compare"); 
        // Adiciona um ouvinte de ação para o botão Compare
        jbtnComp.addActionListener(this);
        // Cria os rótulos 
        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: "); 
        jlabResult = new JLabel(""); 
        // Adiciona os componentes ao painel de conteúdo 
        jfrm.add(jlabFirst); 
        jfrm.add(jtfFirst); 
        jfrm.add(jlabSecond); 
        jfrm.add(jtfSecond); 
        jfrm.add(showMismachtCB);
        jfrm.add(jbtnComp); 
        jfrm.add(jlabResult); 
        // Exibe o quadro
        jfrm.setVisible(true);
    }

    // Compara os arquivos quando o botão compare é pressionado
    public void actionPerformed(ActionEvent ae) {
        int i = 0, j = 0; 
        // Primeiro confirma se psos dois nomes de arquivos foram inseridos 
        if(jtfFirst.getText().equals("")) { 
            jlabResult.setText("First filename missing");
            return;
        }
        if(jtfSecond.getText().equals("")) { 
            jlabResult.setText("Second filename missing"); 
            return; 
        }
        // Compara arquivos. Usa try-with-resources para gerenciar os arquivos 
        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());  
            FileInputStream f2 = new FileInputStream(jtfSecond.getText())) 
            {
            if(showMismachtCB.isSelected()) 
                showMismacht = true; 
            else
                showMismacht = false;
            // Verifica o comteúdo de casa arquivo
            do { 
                i = f1.read(); 
                j = f2.read();
                position++;
                System.out.println(position); 
                System.out.println(showMismacht);
                if(i != j) break;
            } while (i != -1 && j != -1);

            if(i != j ) { 
                if(showMismacht)
                    jlabResult.setText("Missmatch at position " + position);
                else
                    jlabResult.setText("Files are not the same!");
            } else {
                jlabResult.setText("Files compare equal.");
            }
        } catch(IOException exc) { 
            jlabResult.setText("File Error!");
        }
        
        position = 0;
    }

    public static void main(String[] args) {
        // Cria o quadro na thread de despacho de evento
        SwingUtilities.invokeLater(new Runnable() {
            public void run() { 
                new SwingFC();
            }
        });
    }
}
