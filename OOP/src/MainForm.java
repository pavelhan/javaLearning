import com.company.devicesHierarhy.Device;
import com.company.devicesHierarhy.Laptops;
import com.company.devicesHierarhy.Players;
import com.company.devicesHierarhy.Servers;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {


    private JPanel mainPanel;
    private JButton addNewDeviceButton;
    private JButton editDeviceButton;
    private JList list1;
    public static DefaultListModel devices;
    private static JFrame frame;


    public MainForm() {
        addNewDeviceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddNewDevice addDeviceForm;
                if (devices != null) {
                    String[] devicesType = {"Computer", "Laptop", "Player", "Server"};
                    String userChoice = (String) JOptionPane.showInputDialog(null, "Choose device type...", "Device type", JOptionPane.QUESTION_MESSAGE,
                            null, devicesType, devicesType[0]);

                    /*switch (userChoice){
                        case "Computer":*/
                            addDeviceForm = new AddNewDevice(null);
                        //break;
                            //default:
                            //addDeviceForm = new AddNewDevice(null);
                    //}






                }


            }
        });
        editDeviceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object currentSelectedComputer = list1.getSelectedValue();

                if (currentSelectedComputer instanceof Laptops) {
                    Laptops laptop = (Laptops) currentSelectedComputer;
                    AddNewDevice addNewDevice = new AddNewDevice(laptop);
                } else {
                    JOptionPane.showMessageDialog(frame, "This is not computer");
                }
            }
        });
    }

    public static void main(String[] args) {
        frame = new JFrame("MainForm");
        frame.setSize(800, 400);
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setVisible(true);



    }


    private void createUIComponents() {

        Players player = new Players("Iriver", 50);
        Laptops laptop = new Laptops("HPone", 100);
        Servers server = new Servers("Oct", 200);


        devices = new DefaultListModel();
        devices.addElement(player);
        devices.addElement(laptop);
        devices.addElement(server);

        list1 = new JList(devices);// TODO: place custom component creation code here
        list1.setAlignmentX(0);
    }
}
