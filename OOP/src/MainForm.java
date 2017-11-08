import com.company.devicesHierarhy.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MainForm {


    private JPanel mainPanel;
    private JButton addNewDeviceButton;
    private JButton editDeviceButton;
    private JList list1;
    private JButton openFile;
    private JButton saveToFile;
    public static DefaultListModel devices;
    private static JFrame frame;
    DeviceType deviceType;


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

        //Open File
        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filepath = "";
                JFileChooser fc = new JFileChooser();
                int returnVal = fc.showOpenDialog(frame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    try {
                        filepath = fc.getSelectedFile().getCanonicalPath();
                        FileReader fr = new FileReader(filepath);
                        BufferedReader bufferReader = new BufferedReader(fr);
                        String str;
                        while ((str = bufferReader.readLine()) != null) {

                        String [] deviceParams = str.split(";");
                            // TO DO ADD Switch case to create device regard to its DeviceType
                        }
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                File file = new File(filepath);

            }
        });

        //Save to File
        saveToFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();

                int returnVal = fc.showSaveDialog(frame);

                if (returnVal == JFileChooser.APPROVE_OPTION) {

                    try {
                        String filepath = fc.getSelectedFile().getCanonicalPath();
                        FileWriter fos = null;
                        fos = new FileWriter(filepath);
                        for (int i = 0; i < devices.size(); i++) {
                            if (devices.get(i) instanceof Device) {
                                Device device = (Device) devices.get(i);
                                fos.write(device.getDeviceID() + ";" +device.getType() + ";" + device.name + ";" + device.getPower() + ";\n");
                            }
                        }
                        fos.close();

                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }


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
