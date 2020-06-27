import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addWorkerPage extends JFrame {
    private JPanel panel;
    private JLabel lastNameLabel;
    private JLabel firstNameLabel;
    private JLabel IDLAbel;
    private JLabel mailLabel;
    private JLabel departmentLabel;
    private JLabel jobLabel;
    private JLabel userNameLabel;
    private JLabel passwordLabel;
    private JTextField lastNameField;
    private JTextField firstNameField;
    private JTextField IDField;
    private JTextField mailField;
    private JTextField departmentField;
    private JTextField jobField;
    private JTextField userNameField;
    private JTextField passwordField;
    private  JButton submitButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    addWorkerPage frame=new addWorkerPage();
                    frame.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
    public addWorkerPage()

    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 100, 500, 500);
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setTitle("TSBN .inc");

        lastNameLabel=new JLabel("Last name: ");
        lastNameLabel.setBounds(10,20,80,25);
        panel.add(lastNameLabel);
        lastNameField=new JTextField();
        lastNameField.setBounds(100,20,165,25);
        panel.add(lastNameField);

        firstNameLabel=new JLabel("First name: ");
        firstNameLabel.setBounds(10,55,80,25);
        panel.add(firstNameLabel);
        firstNameField=new JTextField();
        firstNameField.setBounds(100,55,165,25);
        panel.add(firstNameField);

        IDLAbel=new JLabel("ID: ");
        IDLAbel.setBounds(10,90,80,25);
        panel.add(IDLAbel);
        IDField=new JTextField();
        IDField.setBounds(100,90,165,25);
        panel.add(IDField);

        mailLabel=new JLabel("Email: ");
        mailLabel.setBounds(10,125,80,25);
        panel.add(mailLabel);
        mailField=new JTextField();
        mailField.setBounds(100,125,165,25);
        panel.add(mailField);

        departmentLabel=new JLabel("Department: ");
        departmentLabel.setBounds(10,160,80,25);
        panel.add(departmentLabel);
        departmentField=new JTextField();
        departmentField.setBounds(100,160,165,25);
        panel.add(departmentField);

        jobLabel=new JLabel("Job: ");
        jobLabel.setBounds(10,195,80,25);
        panel.add(jobLabel);
        jobField=new JTextField();
        jobField.setBounds(100,195,165,25);
        panel.add(jobField);

        userNameLabel=new JLabel("User name: ");
        userNameLabel.setBounds(10,230,80,25);
        panel.add(userNameLabel);
        userNameField=new JTextField();
        userNameField.setBounds(100,230,165,25);
        panel.add(userNameField);

        passwordLabel=new JLabel("password: ");
        passwordLabel.setBounds(10,265,80,25);
        panel.add(passwordLabel);
        passwordField=new JTextField();
        passwordField.setBounds(100,265,165,25);
        panel.add(passwordField);

        submitButton= new JButton("Submit");
        submitButton.setBounds(50,320,125,25);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(submitButton);





        setContentPane(panel);
        GroupLayout layout=new GroupLayout(panel);
        panel.setLayout(layout);

    }


}
