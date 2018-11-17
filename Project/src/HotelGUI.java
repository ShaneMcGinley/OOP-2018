import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class HotelGUI extends JFrame implements ActionListener{

    JFrame jFrameWindow;
    JMenu staffMenu;
    JMenu customerMenu;
    JMenu roomMenu;

    ArrayList<Staff> staffs = new ArrayList();
    private Staff staff;

    public static void main(String[] args) {

        HotelGUI guiApp = new HotelGUI();

    }

    public HotelGUI(){
        this.setTitle("Hotel System");
        //FlowLayout flowLayout = new FlowLayout();
        //this.setLayout(flowLayout);
        this.setSize(400,300);
        //jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("hotel.png");
        this.setIconImage(icon.getImage());

        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());

        this.createStaffMenu();
        this.createCustomerMenu();
        this.createRoomMenu();

        JMenuBar jMenuBar = new JMenuBar();
        this.setJMenuBar(jMenuBar);
        jMenuBar.setBackground(Color.LIGHT_GRAY);

        jMenuBar.add(this.staffMenu);
        jMenuBar.add(this.customerMenu);
        jMenuBar.add(this.roomMenu);

        JLabel welcomeLabel = new JLabel("Welcome!");
        welcomeLabel.setFont(welcomeLabel.getFont().deriveFont(28.0f));
        this.add(welcomeLabel);

        this.setVisible(true);
    }

    public void createStaffMenu(){
        this.staffMenu = new JMenu("Staff");
        JMenuItem jMenuItem = new JMenuItem("Add");
        jMenuItem.addActionListener(this);
        this.staffMenu.add(jMenuItem);

        jMenuItem = new JMenuItem("View");
        jMenuItem.addActionListener(this);
        this.staffMenu.add(jMenuItem);

        jMenuItem = new JMenuItem("Delete");
        this.staffMenu.add(jMenuItem);
        jMenuItem.addActionListener(this);
    }

    public void createCustomerMenu(){
        this.customerMenu = new JMenu("Customer");
        JMenuItem jMenuItem = new JMenuItem("Add");
        this.customerMenu.add(jMenuItem);

        jMenuItem = new JMenuItem("View");
        this.customerMenu.add(jMenuItem);

        jMenuItem = new JMenuItem("Delete");
        this.customerMenu.add(jMenuItem);
    }

    public void createRoomMenu(){
        this.roomMenu = new JMenu("Room");
        JMenuItem jMenuItem = new JMenuItem("Add");
        this.roomMenu.add(jMenuItem);

        jMenuItem = new JMenuItem("Book");
        this.roomMenu.add(jMenuItem);
    }

    public void addStaff() {
        String[] list = new String[]{"Manager", "Waiter/Waitress", "Sous-Chef", "Chef", "Cleaner"};
        boolean valid = false;

        while(!valid) {
            try {

                String name = JOptionPane.showInputDialog("Enter Staff's Name");
                String dob = JOptionPane.showInputDialog("Enter Staff's DOB in format dd/mm/yyyy");
                String address = JOptionPane.showInputDialog("Enter Staff's Address");
                String email = JOptionPane.showInputDialog("Enter Staff's Email");
                String phoneNum = JOptionPane.showInputDialog("Enter Staff's Phone");
                String pps = JOptionPane.showInputDialog("Enter Staff's PPS Number");
                int empNum = Integer.parseInt(JOptionPane.showInputDialog("Enter Staff's Number"));
                String jobTitle = (String)JOptionPane.showInputDialog((Component)null, "Choose Staff's Position", "Position", 3, (Icon)null, list, list[0]);

                this.staff = new Staff(name, dob, address, email, phoneNum, pps, empNum,jobTitle);
                JOptionPane.showMessageDialog((Component)null, "Staff '" + name + "' added to the system");
                valid = true;



            } catch (NullPointerException var18) {
                int choose = JOptionPane.showConfirmDialog((Component)null, "Field must not be empty. Do you want to continue?", "Confirmation", 0);
                if (choose != 0) {
                    break;
                }


            }

                 }

        this.staffs.add(this.staff);
            }


    public void viewStaff() {
        JComboBox staffCombo = new JComboBox();
        JTextArea output = new JTextArea();
        output.setText("Staff Details:\n\n");

        try {
            if (this.staffs.size() < 1) {
                JOptionPane.showMessageDialog((Component)null, "No staffs is added in the system. Please 'Open' file.", "Error", 0);
            } else {
                Iterator iterator = this.staffs.iterator();

                while(iterator.hasNext()) {
                    staffCombo.addItem(((Staff)iterator.next()).getName() + "\n");
                }

                JOptionPane.showMessageDialog((Component)null, staffCombo, "Select staff to view details", -1);
                int selected = staffCombo.getSelectedIndex();
                output.append(((Staff)this.staffs.get(selected)).toString());
                JOptionPane.showMessageDialog((Component)null, output, "Staff Details", -1);
            }
        } catch (NullPointerException var5) {
            JOptionPane.showMessageDialog((Component)null, "Error due to null pointer", "Error", 0);
            var5.printStackTrace();
        }

    }

    public void deleteStaff() {
        JComboBox staffList = new JComboBox();
        Iterator var2 = this.staffs.iterator();

        while(var2.hasNext()) {
            Staff s = (Staff)var2.next();
            staffList.addItem(s.getName());
        }

        JOptionPane.showMessageDialog((Component)null, "Select staff to be removed", "Remove Staff", 1);
        JOptionPane.showMessageDialog((Component)null, staffList, "Remove Staff", 1);
        int selected = staffList.getSelectedIndex();
        this.staffs.remove(selected);
        JOptionPane.showMessageDialog((Component)null, "Staff Removed", "Removed", 1);
    }


    public void actionPerformed(ActionEvent e) {
        String menuName = e.getActionCommand();
        if (menuName == "Add")
            this.addStaff();
        if (menuName == "View")
            this.viewStaff();
        if (menuName == "Delete") {
            this.deleteStaff();
        }
    }
    }



