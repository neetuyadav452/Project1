package airlinemanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton reset,submit,close;
    JTextField tfusername;
    JPasswordField tfpassword;
    public Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel lbusername = new JLabel("Username");
        //setLayout(null);
        lbusername.setBounds(20,20,100,20);
        add(lbusername);
        JLabel lbpassword = new JLabel("Password");
        lbpassword.setBounds(20,60,100,20);
        add(lbpassword);
        tfusername = new JTextField();
        tfusername.setBounds(130,20,100,20);
        add(tfusername);
        tfpassword = new JPasswordField();
        tfpassword.setBounds(130,60,100,20);
        add(tfpassword);
        reset = new JButton("Reset");
        reset.setBounds(60,100,100,20);
        add(reset);
        reset.addActionListener(this);
        submit = new JButton("Submit");
        submit.setBounds(200,100,100,20);
        add(submit);
        submit.addActionListener(this);
        close = new JButton("Close");
        close.setBounds(130,140,100,20);
        add(close);
        close.addActionListener(this);
        setSize(400,250);
        setLocation(600,250);
        setVisible(true);
    }
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()== submit){
    }
            else if(ae.getSource() == close){
                setVisible(false);
        }
            else if(ae.getSource() == reset){
                tfusername.setText("");
                tfpassword.setText("");
            }
        }
    public static void main(String args[]){
        new Login();
    }
}
