import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtPrimeiroValor;
    private JTextField txtSegundoValor;
    private JButton btnSomar;
    private JTextField txtResultado;
    private JButton btnLimpar;
    private JPanel panelMain;

    public Calculadora(){

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //peguei informações da tela
                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtPrimeiroValor.getText());

                //processei
                Integer soma = primeiro + segundo;

                //mandei para tela o resultado
                txtResultado.setText(soma.toString());

                }




        });
    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.pack();
        // frame.setSize(500, 500);
        frame.setVisible(true);

    }}


