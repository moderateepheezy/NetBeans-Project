/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author simpumind
 */
public class AddressBookDisplay extends JFrame{

    private Person currentEntry;
    private PersonQueries personQueries;
    private List<Person> results;
    private int numberOfEntries = 0;
    private int currentEntryIndex;
    
    JButton browseButton;
    JLabel emailLabel;
    JTextField emailTextField;
    JLabel firstNameLabel;
    JTextField firstNameTextField;
    JLabel idLabel;
    JTextField idTextField;
    JTextField indexTextField;
    JLabel lastNameLabel;
    JTextField lastNameTextField;
    JTextField maxTextField;
    JButton nextButton;
    JLabel ofLabel;
    JLabel phoneLabel;
    JTextField phoneTextField;
    JButton previousButton;
    JButton queryButton;
    JLabel queryLabel;
    JPanel queryPanel;
    JPanel navigatePanel;
    JPanel displayPanel;
    JTextField queryTextField;
    JButton insertButton;
    
    public AddressBookDisplay(){
        
        // establish database connection and set up PreparedStatements
        personQueries = new PersonQueries();
        // create GUI
        navigatePanel = new JPanel();
        previousButton = new JButton();
        indexTextField = new JTextField( 2 );
        ofLabel = new JLabel();
        maxTextField = new JTextField( 2 );
        nextButton = new JButton();
        displayPanel = new JPanel();
        idLabel = new JLabel();
        idTextField = new JTextField( 10 );
        firstNameLabel = new JLabel();
        firstNameTextField = new JTextField( 10 );
        
                lastNameLabel = new JLabel();
        lastNameTextField = new JTextField(10);
        emailLabel = new JLabel();
        emailTextField = new JTextField( 10);
        phoneLabel = new JLabel();
        phoneTextField = new JTextField( 10);
        queryPanel = new JPanel();
        queryLabel = new JLabel();
        queryTextField = new JTextField( 10);
        queryButton = new JButton();
        browseButton = new JButton();
        insertButton = new JButton();
        setLayout( new FlowLayout( FlowLayout.CENTER, 10, 10 ) );
        setSize( 400, 300 );
        setResizable( false );
        navigatePanel.setLayout(
        new BoxLayout( navigatePanel, BoxLayout.X_AXIS ) );
        previousButton.setText( "Previous" );
        previousButton.setEnabled( false );
        previousButton.addActionListener(
        new ActionListener()
        {
        public void actionPerformed( ActionEvent evt )
        {
        previousButtonActionPerformed( evt );
        } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener
        
        navigatePanel.add( previousButton );
        navigatePanel.add( Box.createHorizontalStrut( 10 ) );
        indexTextField.setHorizontalAlignment(
        JTextField.CENTER );
        indexTextField.addActionListener(
        new ActionListener()
        {
        public void actionPerformed( ActionEvent evt )
        {
        indexTextFieldActionPerformed( evt );
        } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener
        navigatePanel.add( indexTextField );
        navigatePanel.add( Box.createHorizontalStrut( 10 ) );
        ofLabel.setText( "of" );
        navigatePanel.add( ofLabel );
        navigatePanel.add( Box.createHorizontalStrut( 10 ) );
        
        maxTextField.setHorizontalAlignment(
        JTextField.CENTER );
        maxTextField.setEditable( false );
        navigatePanel.add( maxTextField );
        navigatePanel.add( Box.createHorizontalStrut( 10 ) );
        nextButton.setText( "Next" );
        nextButton.setEnabled( false );
        nextButton.addActionListener(
        new ActionListener()
        {
        public void actionPerformed( ActionEvent evt )
        {
        nextButtonActionPerformed( evt );
        } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener
        navigatePanel.add( nextButton );
        add( navigatePanel );
        displayPanel.setLayout( new GridLayout( 5, 2, 4, 4 ) );
        idLabel.setText( "Address ID:" );
        displayPanel.add( idLabel );
        idTextField.setEditable( false );
        displayPanel.add( idTextField );
        firstNameLabel.setText( "First Name:" );
        displayPanel.add( firstNameLabel );
        displayPanel.add( firstNameTextField );
        lastNameLabel.setText( "Last Name:" );
        displayPanel.add( lastNameLabel );
        
        emailLabel.setText( "Email:" );
        displayPanel.add( emailLabel );
        displayPanel.add( emailTextField );
        phoneLabel.setText( "Phone Number:" );
        displayPanel.add( phoneLabel );
        displayPanel.add( phoneTextField );
        add( displayPanel );
        queryPanel.setLayout(
        new BoxLayout( queryPanel, BoxLayout.X_AXIS) );
        queryPanel.setBorder( BorderFactory.createTitledBorder(
        "Find an entry by last name" ) );
        queryLabel.setText( "Last Name:" );
        
        queryPanel.add(
        queryPanel.add(
        queryPanel.add(
        queryPanel.add(
        queryPanel.add(
        Box.createHorizontalStrut( 5 ) );
        queryLabel );
        Box.createHorizontalStrut( 10 ) );
        queryTextField );
        Box.createHorizontalStrut( 10 ) );
        queryButton.setText( "Find" );
        queryButton.addActionListener(
        new ActionListener()
        {
        public void actionPerformed( ActionEvent evt )
        {
        queryButtonActionPerformed( evt );
        } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener
        queryPanel.add( queryButton );
        queryPanel.add( Box.createHorizontalStrut( 5 ) );
        add( queryPanel );
        
        browseButton.setText( "Browse All Entries" );
        browseButton.addActionListener(
        new ActionListener()
        {
        public void actionPerformed( ActionEvent evt )
        {
        browseButtonActionPerformed( evt );
        } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener
        add( browseButton );
        insertButton.setText( "Insert New Entry" );
        insertButton.addActionListener(
        new ActionListener()
        {
        public void actionPerformed( ActionEvent evt )
        {
        insertButtonActionPerformed( evt );
        } // end method actionPerformed
        } // end anonymous inner class
        ); // end call to addActionListener
        add( insertButton );
        addWindowListener(
        new WindowAdapter()
        {
        public void windowClosing( WindowEvent evt )
        {
        personQueries.close(); // close database connection
        
        System.exit( 0 );
        } // end method windowClosing
        } // end anonymous inner class
        ); // end call to addWindowListener
        setVisible( true );
        } // end no-argument constructor
        // handles call when previousButton is clicked
        private void previousButtonActionPerformed( ActionEvent evt )
        {
        currentEntryIndex--;
        if ( currentEntryIndex < 0 )
        currentEntryIndex = numberOfEntries - 1;
        indexTextField.setText( "" + ( currentEntryIndex + 1 ) );
        indexTextFieldActionPerformed( evt );
        } // end method previousButtonActionPerformed
        // handles call when nextButton is clicked
        private void nextButtonActionPerformed( ActionEvent evt )
        {
        currentEntryIndex++;
        if ( currentEntryIndex >= numberOfEntries )
        currentEntryIndex = 0;
        indexTextField.setText( "" + ( currentEntryIndex + 1 ) );
        indexTextFieldActionPerformed( evt );
        } // end method nextButtonActionPerformed
        // handles call when queryButton is clicked
        private void queryButtonActionPerformed( ActionEvent evt )
        {
        results =
        personQueries.getPeopleByLastName( queryTextField.getText() );
        numberOfEntries = results.size();
        if ( numberOfEntries != 0 )
        {
        currentEntryIndex = 0;
        
        currentEntry = results.get( currentEntryIndex );
        idTextField.setText( "" + currentEntry.getAddressID() );
        firstNameTextField.setText( currentEntry.getFirstName() );
        lastNameTextField.setText( currentEntry.getLastName() );
        emailTextField.setText( currentEntry.getEmail() );
        phoneTextField.setText( currentEntry.getPhoneNumber() );
        maxTextField.setText( "" + numberOfEntries );
        indexTextField.setText( "" + ( currentEntryIndex + 1 ) );
        nextButton.setEnabled( true );
        previousButton.setEnabled( true );
        }
        }// end try
        catch ( Exception e )
        {
        e.printStackTrace();
        } // end catch
        

        private void insertButtonActionPerformed( ActionEvent evt ){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
