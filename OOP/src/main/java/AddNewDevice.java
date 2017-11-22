import com.company.Manufacturers;
import com.company.devicesHierarhy.Computers;
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
        if (laptops != null) {
            computerID.setText(laptops.getDeviceID() + "");
            computerNameText.setText(laptops.getName());
            computerPowerText.setText(laptops.getPower() + "");
            computerRAMtext.setText(laptops.getDDRCapacity() + "");
        }


        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int computerRAM;
                String computerName = computerNameText.getText();
                int computerPower = Integer.parseInt(computerPowerText.getText());
                while (Integer.parseInt(computerRAMtext.getText()) < Computers.minRam || Integer.parseInt(computerRAMtext.getText()) > Computers.maxRam) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid value between 64 and 2048", "Warning", JOptionPane.WARNING_MESSAGE);
                    if (!(Integer.parseInt(computerRAMtext.getText()) > 64 & Integer.parseInt(computerRAMtext.getText()) < 2048)) {
                        break;
                    }
                }
                computerRAM = Integer.parseInt(computerRAMtext.getText());

                if (laptops != null) {
                    laptops.setName(computerName);
                    laptops.setPower(computerPower);
                    laptops.setDDRCapacity(computerRAM);
                } else {
                    Laptops computer = new Laptops(computerName, computerPower, computerRAM, Manufacturers.GL);
                    computer.setName(computerName);
                    computer.setPower(computerPower);
                    computer.setDDRCapacity(computerRAM);
                    MainForm.devices.addElement(computer);
                }
                frame.dispose();
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


