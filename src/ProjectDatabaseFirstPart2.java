
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * Connect to Oracle DB using JDBC Driver.
 */
public class ProjectDatabaseFirstPart2 extends JPanel {
	
	private int totalHoursWorked = 0;
	
	JPanel titlePanel = new JPanel();
	JPanel checkSSNPanel = new JPanel();
	JPanel clearFormPanel = new JPanel();
	JPanel enterCheckSSNPanel = new JPanel();
	JPanel enterCheckSSNforButtonPanel = new JPanel();
	/* Panel for inserting new info */
	JPanel fnamePanel = new JPanel();
	JPanel minitPanel = new JPanel();
	JPanel lnamePanel = new JPanel();
	JPanel ssnPanel = new JPanel();
	JPanel bdatePanel = new JPanel();
	JPanel addressPanel = new JPanel();
	JPanel sexPanel = new JPanel();
	JPanel salaryPanel = new JPanel();
	JPanel superSSNPanel = new JPanel();
	JPanel dnoPanel = new JPanel();
	JPanel insertInfoForButtonPanel = new JPanel();
	/*Panel for the input boxes for inserting new info*/
	JPanel enterFnamePanel = new JPanel();
	JPanel enterMinitPanel = new JPanel();
	JPanel enterLnamePanel = new JPanel();
	JPanel enterSsnPanel = new JPanel();
	JPanel enterBdatePanel = new JPanel();
	JPanel enterAddressPanel = new JPanel();
	JPanel enterSexPanel = new JPanel();
	JPanel enterSalaryPanel = new JPanel();
	JPanel enterSuperSSNPanel = new JPanel();
	JPanel enterDnoPanel = new JPanel();
	/* For insert project */
	JPanel projectPanel = new JPanel();
	JPanel enterProjectPanel = new JPanel();
	JPanel enterProjectForButtonPanel = new JPanel();
	JPanel yesPanel = new JPanel();
	JPanel noPanel = new JPanel();
	JLabel titleLabel = new JLabel();
	JLabel checkSSNLabel = new JLabel();
	JLabel clearFormLabel = new JLabel();
	JLabel enterCheckSSNLabel = new JLabel();
	JLabel enterCheckSSNforButtonLabel = new JLabel();
	/*Label for inserting new info */
	JLabel fnameLabel = new JLabel();
	JLabel lnameLabel = new JLabel();
	JLabel minitLabel = new JLabel();
	JLabel ssnLabel = new JLabel();
	JLabel bdateLabel = new JLabel();
	JLabel addressLabel = new JLabel();
	JLabel sexLabel = new JLabel();
	JLabel salaryLabel  = new JLabel();
	JLabel superSSNLabel = new JLabel();
	JLabel dnoLabel = new JLabel();
	JLabel insertInfoForButtonLabel = new JLabel();
	/* Label for the input boxes for inserting new info */
	JLabel enterFnameLabel = new JLabel();
	JLabel enterMinitLabel = new JLabel();
	JLabel enterLnameLabel = new JLabel();
	JLabel enterSsnLabel = new JLabel();
	JLabel enterBdateLabel = new JLabel();
	JLabel enterAddressLabel = new JLabel();
	JLabel enterSexLabel = new JLabel();
	JLabel enterSalaryLabel  = new JLabel();
	JLabel enterSuperSSNLabel = new JLabel();
	JLabel enterDnoLabel = new JLabel();
	/* For insert project */
	JLabel projectLabel = new JLabel();
	JLabel enterProjectLabel = new JLabel();
	JLabel enterProjectForButtonLabel = new JLabel();
	
	JButton enterCheckSSNforButton = new JButton();
	JButton clearFormButton = new JButton();
	JButton insertInfoButton = new JButton();
	JButton enterProjectButton = new JButton();
	JCheckBox yesCheckBox = new JCheckBox();
	JCheckBox noCheckBox = new JCheckBox();
	
	JTextField checkSSNinputText = new JTextField(45);
	JTextField fnameInputText = new JTextField(15);
	JTextField minitInputText = new JTextField(15);
	JTextField lnameInputText = new JTextField(15);
	JTextField ssnInputText = new JTextField(15);
	JTextField bdateInputText = new JTextField(15);
	JTextField addressInputText = new JTextField(15);
	JTextField sexInputText = new JTextField(15);
	JTextField salaryInputText = new JTextField(15);
	JTextField superSSNInputText = new JTextField(15);
	JTextField dnoInputText = new JTextField(15);
	JTextField projectInputText = new JTextField(25);
	
	Connection connection = null;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/* Create an object and make the screen appear */
		ProjectDatabaseFirstPart2 myGUI = new ProjectDatabaseFirstPart2();
		myGUI.display();	
	}
	
	public ProjectDatabaseFirstPart2 () {
		/* Set layout */
		titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		checkSSNPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		clearFormPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		enterCheckSSNPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		enterCheckSSNforButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		/* Insert info layout */
		fnamePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		minitPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		lnamePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		ssnPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		bdatePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		addressPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		sexPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		salaryPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		superSSNPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		dnoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		insertInfoForButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		/* Input boxes layout */
		enterFnamePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		enterMinitPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		enterLnamePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		enterSsnPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		enterBdatePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		enterAddressPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		enterSexPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		enterSalaryPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		enterSuperSSNPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		dnoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		projectPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		enterProjectPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		enterProjectForButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		/*For check box */
		yesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		noPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		Font bigFont = new Font("Helvetica Bold", Font.BOLD, 14);
		Font smallFont = new Font("Helvetica Bold", Font.BOLD, 13);
		
		titleLabel.setFont(bigFont);
		checkSSNLabel.setFont(smallFont);
		clearFormLabel.setFont(smallFont);
		enterCheckSSNLabel.setFont(smallFont);
		enterCheckSSNforButtonLabel.setFont(smallFont);
		/* Insert info set font */
		fnameLabel.setFont(smallFont);
		minitLabel.setFont(smallFont);
		lnameLabel.setFont(smallFont);
		ssnLabel.setFont(smallFont);
		bdateLabel.setFont(smallFont);
		addressLabel.setFont(smallFont);
		sexLabel.setFont(smallFont);
		salaryLabel.setFont(smallFont);
		superSSNLabel.setFont(smallFont);
		dnoLabel.setFont(smallFont);
		insertInfoForButtonLabel.setFont(smallFont);
		projectLabel.setFont(smallFont);
		enterProjectLabel.setFont(smallFont);
		enterProjectForButtonLabel.setFont(smallFont);
		yesCheckBox.setFont(smallFont);
		noCheckBox.setFont(smallFont);
		/* Set name for each label */
		titleLabel.setText("EMPLOYEE Database");
		checkSSNLabel.setText("Check SSN");
		enterCheckSSNLabel.setText("Please enter your SSN in Check SSN box to start.");
		clearFormButton.setText("Clear Form");
		enterCheckSSNforButton.setText("Check SSN");
		/* Set name for insert info */
		fnameLabel.setText("First Name:		");
		minitLabel.setText("Minit:		         ");
		lnameLabel.setText("Last Name:		");
		ssnLabel.setText("SSN:            ");
		bdateLabel.setText("Birth Date:		");
		addressLabel.setText("Adress:		     ");
		sexLabel.setText("Sex:		          ");
		salaryLabel.setText("Salary:		      ");
		superSSNLabel.setText("Supervisor SSN:	");
		dnoLabel.setText("Department Number:	");
		insertInfoButton.setText("Insert employee Information:");
		projectLabel.setText("Enter project number and hours for new employee separate by comma:");
		enterProjectButton.setText("Insert Project and Hours");
		yesCheckBox.setText("Yes for Dependent/s");
		noCheckBox.setText("No for Dependent/s");
		
		enterCheckSSNforButton.addActionListener(new CheckSSNforManager());
		insertInfoButton.addActionListener(new InsertInfo());
		clearFormButton.addActionListener(new ClearFormButton());
		enterProjectButton.addActionListener(new InsertProject());
		yesCheckBox.addActionListener(new Dependent());
		noCheckBox.addActionListener(new Dependent());
		/* Labels, buttons and textFields are added to their panels */
		titlePanel.add(titleLabel);
		enterCheckSSNPanel.add(enterCheckSSNLabel);
		/* Add for button */
		checkSSNPanel.add(checkSSNLabel);
		/* Add for text field */
		checkSSNPanel.add(checkSSNinputText);
		checkSSNPanel.add(enterCheckSSNforButton);
		clearFormPanel.add(clearFormButton);
		/*Add for inserting info */
		fnamePanel.add(fnameLabel);
		enterFnamePanel.add(enterFnameLabel);
		fnamePanel.add(fnameInputText);
		minitPanel.add(minitLabel);
		enterMinitPanel.add(enterMinitLabel);
		minitPanel.add(minitInputText);
		lnamePanel.add(lnameLabel);
		enterLnamePanel.add(enterLnameLabel);
		lnamePanel.add(lnameInputText);
		ssnPanel.add(ssnLabel);
		enterSsnPanel.add(enterSsnLabel);
		ssnPanel.add(ssnInputText);
		bdatePanel.add(bdateLabel);
		enterBdatePanel.add(enterBdateLabel);
		bdatePanel.add(bdateInputText);
		addressPanel.add(addressLabel);
		enterAddressPanel.add(enterAddressLabel);
		addressPanel.add(addressInputText);
		sexPanel.add(sexLabel);
		enterSexPanel.add(enterSexLabel);
		sexPanel.add(sexInputText);
		salaryPanel.add(salaryLabel);
		enterSalaryPanel.add(enterSalaryLabel);
		salaryPanel.add(salaryInputText);
		superSSNPanel.add(superSSNLabel);
		enterSuperSSNPanel.add(enterSuperSSNLabel);
		superSSNPanel.add(superSSNInputText);
		dnoPanel.add(dnoLabel);
		enterDnoPanel.add(enterDnoLabel);
		dnoPanel.add(dnoInputText);
		dnoPanel.add(insertInfoButton);
		/* Insert project */
		projectPanel.add(projectLabel);
		enterProjectPanel.add(enterProjectLabel);
		projectPanel.add(projectInputText);
		projectPanel.add(enterProjectButton);
		yesPanel.add(yesCheckBox);
		yesPanel.add(noCheckBox);
		/* The panels are added in the order that they should appear. Throughout the 
		declarations and initializations variables were
		kept in this order to aid in keeping them straight */
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(titlePanel);
		/* The box for input */
		add(enterCheckSSNPanel);
		/* instruction on the left */
		add(checkSSNPanel);
		add(enterCheckSSNforButtonPanel);
		/* Add insert info name */ 
		add(fnamePanel);
		add(enterFnamePanel);
		add(minitPanel);
		add(enterMinitPanel);
		add(lnamePanel);
		add(enterLnamePanel);
		add(ssnPanel);
		add(enterSsnPanel);
		add(bdatePanel);
		add(enterBdatePanel);
		add(addressPanel);
		add(enterAddressPanel);
		add(sexPanel);
		add(enterSexPanel);
		add(salaryPanel);
		add(enterSalaryPanel);
		add(superSSNPanel);
		add(enterSuperSSNPanel);
		add(dnoPanel);
		add(enterDnoPanel);
		add(insertInfoForButtonPanel);
		add(projectPanel);
		add(enterProjectPanel);
		add(enterProjectForButtonPanel);
		add(yesPanel);
		add(noPanel);
		add(clearFormPanel);	
	}
	
	public void display()
	{	/* A JFrame is where the components of the screen will be put. */
		JFrame theFrame = new JFrame("GUI for EMPLOYEE Database");
		/* When the frame is closed it will exit to the previous window that called it.*/
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* Puts the panels in the JFrame */
		theFrame.setContentPane(this);
		/* sets the dimensions in pixels */
		theFrame.setPreferredSize(new Dimension(1100, 1200));
		theFrame.pack();
		/* make the window visible */
		theFrame.setVisible(true);
	}
	public class Dependent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please provide the details to connect Oracle Database");
			System.out.println("Enter UserName");
			String userName = scanner.next();
			System.out.println("Enter Password");
			String password = scanner.next();
			String data = "";
			int num = 0;
			String essn = new String();
			String dependentName = new String();
			String sex = new String();
			String bdate = new String();
			String relationship = new String();
			String [] dependent = {essn,dependentName,sex,bdate,relationship};
			
			try {

				Class.forName("oracle.jdbc.driver.OracleDriver");

			} catch (ClassNotFoundException ex) {
				ex.printStackTrace();
			}

			Connection connection = null;

			try {
				connection = DriverManager.getConnection(
						"jdbc:oracle:thin:@artemis.vsnet.gmu.edu:1521/vse18c.vsnet.gmu.edu", userName,
						password);
			} catch (SQLException ex) {

				ex.printStackTrace();
			}

			if (connection != null) {
				System.out.println("Successfullly connected to Oracle DB");
			} else {
				System.out.println("Failed to connect to Oracle DB");
			}
			try {
				Statement statement = connection.createStatement();
				Object source = e.getSource();
				if(source == yesCheckBox) {
					//statement.executeUpdate("DELETE FROM dependent WHERE essn = 111223333");
					
					System.out.println("How many dependent do you have?");
					num = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Please Enter your dependent information.");
					for(int i = 0; i < num; i ++) {
						System.out.println("Enter essn");
						dependent[0] = scanner.nextLine();
						System.out.println("Enter dependent name.");
						dependent[1] = scanner.nextLine();
						System.out.println("Enter dependent sex.");
						dependent[2] = scanner.nextLine();
						System.out.println("Enter dependent birth date.");
						dependent[3] = scanner.nextLine();
						System.out.println("Enter relationship.");
						dependent[4] = scanner.nextLine();	
				
						statement.executeUpdate("INSERT INTO dependent  " + "VALUES ('"+dependent[0]+"','"+dependent[1]+"', '"+dependent[2]+"', '"+dependent[3]+"', '"+dependent[4]+"')");
					}
					
					System.out.println("Dependent Information");
					ResultSet results = statement.executeQuery("SELECT * FROM dependent");
					while(results.next()) {
						data = results.getString("essn");
						System.out.println("Essn:                  " + data);
						data = results.getString("dependent_name");
						System.out.println("Dependent Name:        " + data);
						data = results.getString("sex");
						System.out.println("Sex:                   " + data);
						data = results.getString("bdate");
						System.out.println("Birth Date:            " + data);
						data = results.getString("relationship");
						System.out.println("Relationship:          " + data);
						System.out.println();	
					}
				}
				else {
					System.out.println("You don't have dependent");
				}
			}catch(SQLException ex) {
				System.out.println("Could not retrieve data from the database " + ex.getMessage());
			}
		}		
	}
	
	String getSSN = new String();
	public class InsertProject implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please provide the details to connect Oracle Database");
			System.out.println("Enter UserName");
			String userName = scanner.next();
			System.out.println("Enter Password");
			String password = scanner.next();
			double projectInput = new Double(0);
			Integer projectNum = new Integer(0);
			Integer hours = new Integer(0);
			int[] project = {projectNum, hours};
			Double ttlHours = 0.00;
			Object source = e.getSource();
			String data = "";
			String stringText = "";
			
			try {

				Class.forName("oracle.jdbc.driver.OracleDriver");

			} catch (ClassNotFoundException ex) {
				ex.printStackTrace();
			}

			Connection connection = null;

			try {

				connection = DriverManager.getConnection(
						"jdbc:oracle:thin:@artemis.vsnet.gmu.edu:1521/vse18c.vsnet.gmu.edu", userName,
						password);

			} catch (SQLException ex) {

				ex.printStackTrace();
			}

			if (connection != null) {
				System.out.println("Successfullly connected to Oracle DB");
			} else {
				System.out.println("Failed to connect to Oracle DB");
			}
		
			try {
				
					String tmpString = projectInputText.getText();
					String[] split = tmpString.split(",",2);
			        project[0] = Integer.parseInt(split[0]);
			        project[1] = Integer.parseInt(split[1]);
			        totalHoursWorked = totalHoursWorked + project[1];
			        System.out.println(project[0]);
					System.out.println(project[1]);
					System.out.println(totalHoursWorked);
					if(totalHoursWorked <= 40) {
						Statement statement = connection.createStatement();
						statement.executeUpdate("INSERT INTO works_on  " + "VALUES ('111223333',"+project[0]+", "+project[1]+")");
						System.out.println("Works On information");
						ResultSet results = statement.executeQuery("SELECT * FROM works_on");
						while(results.next()) {
							data = results.getString("essn");
							System.out.println("Essn: " + data);
							data = results.getString("pno");
							System.out.print("Project Number: " + data);
							data = results.getString("hours");
							System.out.println(" Hours: " + data);
							System.out.println();
						}
					}
					else {
						stringText = "Employee work hours can't be more than 40." + data;
						totalHoursWorked=totalHoursWorked-project[1];
						projectInputText.setText(stringText);
					}
			       
			}catch(SQLException ex) {
				System.out.println("Could not retrieve data from the database " + ex.getMessage());
			}
		}
	}
	
	public class InsertInfo implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please provide the details to connect Oracle Database");
			System.out.println("Enter UserName");
			String userName = scanner.next();
			System.out.println("Enter Password");
			String password = scanner.next();
			
			String managerSSN = new String();
			String getFname = new String();
			String getMinit = new String();
			String getLname = new String();
			String getSSN = new String();
			String getBdate = new String();
			String getAddress = new String();
			String getSex = new String();
			Integer getSalary = new Integer(0);
			String getSuperSSN = new String();
			Integer getDno = new Integer(0);
			String stringText = "";
			String data = "";
			try {

				Class.forName("oracle.jdbc.driver.OracleDriver");

			} catch (ClassNotFoundException ex) {
				ex.printStackTrace();
			}

			Connection connection = null;

			try {
				connection = DriverManager.getConnection(
						"jdbc:oracle:thin:@artemis.vsnet.gmu.edu:1521/vse18c.vsnet.gmu.edu", userName,
						password);
			} catch (SQLException ex) {

				ex.printStackTrace();
			}

			if (connection != null) {
				System.out.println("Successfullly connected to Oracle DB");
			} else {
				System.out.println("Failed to connect to Oracle DB");
			}
			
			try {
				managerSSN = checkSSNinputText.getText();
				getFname = fnameInputText.getText();
				getMinit = minitInputText.getText();
				getLname = lnameInputText.getText();
				getSSN = ssnInputText.getText();
				getBdate = bdateInputText.getText();
				getAddress = addressInputText.getText();
				getSex = sexInputText.getText();
				getSalary = Integer.parseInt(salaryInputText.getText());
				getSuperSSN = superSSNInputText.getText();
				getDno = Integer.parseInt(dnoInputText.getText());
				Object source = e.getSource();
				if(source == insertInfoButton) {
					Statement statement = connection.createStatement();
					
					statement.executeUpdate("INSERT INTO employee " + "VALUES ('" + getFname +"','"+getMinit+"','"+getLname+"',"+getSSN+",'"+getBdate+"','"+getAddress+"','"+getSex+"',"+getSalary+","+getSuperSSN+","+getDno+",null)");
					//ResultSet results = statement.executeQuery("SELECT * FROM employee");
					statement.executeUpdate("DELETE FROM employee WHERE fname = 'Alyssa'");
					ResultSet results = statement.executeQuery("SELECT * FROM employee");
					while(results.next()) {
						data = results.getString("fname");
						stringText = "First name: " + data;
						//resultTextArea.setText(stringText);
						System.out.println("First name:       " + data);
						data = results.getString("lname");
						System.out.println("Last name:        " + data);
						data = results.getString("ssn");
						System.out.println("SSN:              " + data);
						data = results.getString("bdate");
						System.out.println("Birth date:       " + data);
						data = results.getString("address");
						System.out.println("Address:          " + data);
						data = results.getString("sex");
						System.out.println("Sex:              " + data);
						data = results.getString("salary");
						System.out.println("Salary:           " + data);
						data = results.getString("superssn");
						System.out.println("Supervisor SSN:   " + data);
						data = results.getString("dno");
						System.out.println("Department Number:" + data);
						System.out.println();
					}
				}
			}catch(SQLException ex) {
				System.out.println("Could not retrieve data from the database " + ex.getMessage());
			}
		}
			
	}
	
	public class CheckSSNforManager implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			String managerSSN = new String();
			String stringText = "";
			String data = "";
			managerSSN = checkSSNinputText.getText();
			if(managerSSN.equals("333445555") || managerSSN.equals("888665555") || managerSSN.equals("987654321")) {
				stringText = "Your SSN is correspond to manager. Please insert new employee information below.";
				checkSSNinputText.setText(stringText);
			}
			else {
				stringText = "Your SSN is not correspond to a manager";
				checkSSNinputText.setText(stringText);
				//System.exit(0);
			}	
		}
	}
	
	/* this class resets the values of inputText and answerLable */

	class ClearFormButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				checkSSNinputText.setText(""); //erases the values in JTextField
				fnameInputText.setText("");
				minitInputText.setText("");
				lnameInputText.setText("");
				ssnInputText.setText("");
				bdateInputText.setText("");
				addressInputText.setText("");
				sexInputText.setText("");
				salaryInputText.setText("");
				superSSNInputText.setText("");
				dnoInputText.setText("");
				projectInputText.setText("");
				
		}	
	}
}
