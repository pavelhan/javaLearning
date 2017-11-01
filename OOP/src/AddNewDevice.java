import com.company.Manufacturers;
import com.company.devicesHierarhy.Laptops;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewDevice {
    private JPanel panel2;
    private JButton saveButton;
    private JButton cancelButton;
    private JTextField computerNameText;
    private JTextField computerPowerText;
    private JTextField computerRAMtext;
    private JLabel computerID;
    private JLabel computerIDLabel;
    private JLabel computerNameLabel;
    private JLabel ComputerPowerLabel;
    private JLabel ComputerRAMLabel;


    public AddNewDevice(Laptops laptops) {
        JFrame frame = new JFrame("AddNewDevice");
        frame.setContentPane(panel2);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        if(laptops != null) {
            computerID.setText(laptops.getDeviceID()+"");
            computerNameText.setText(laptops.getName());
            computerPowerText.setText(laptops.getPower() + "");
            computerRAMtext.setText(laptops.getDDRCapacity() + "");
        }



        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String computerName = computerNameText.getText();
                int computerPower = Integer.parseInt(computerPowerText.getText());
                int computerRAM = Integer.parseInt(computerRAMtext.getText());
                Laptops computer = new Laptops(computerName, computerPower, computerRAM, Manufacturers.GL);
                MainForm.devices.addElement(computer);
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

            }
        });
    }
}


