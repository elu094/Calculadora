import javax.naming.ContextNotEmptyException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainform {
    private JTextField txtNome;
    private JLabel lblNome;
    private JButton btnValidar;
    private JPanel MainPanel;
    private JLabel txResultado;

    public Mainform() {

        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Obter nome do input
                String nomeDigitado = txtNome.getText();

                txResultado.setText(nomeDigitado);
            }
        });
    }


           public static void main(String[] args){
                //Cria minha tela (TV)
                JFrame frame = new JFrame("Minha primeira tela");
                //Mostre qual painel vai ser assistido
                frame.setContentPane(new Mainform().MainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //Ajuda a minha TV do tamanho do seu painel
                frame.pack();
                //frame.setSize( 500, 500);
                //Ligar TV
                frame.setVisible(true);

            }

        }

