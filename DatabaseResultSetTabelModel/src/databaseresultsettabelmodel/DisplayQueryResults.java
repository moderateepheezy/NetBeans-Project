/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseresultsettabelmodel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author simpumind
 */
public class DisplayQueryResults extends JFrame{
    
    static final String DATABASE_URL = "jdbc:mysql://localhost/Books";
    static final String USERNAME = "root";
    static final String PASSWORD = "password";
    
    // default query retrieves all data from Authors table
    static final String DEFAULT_QUERY = "SELECT * FROM Authors";
    
    private ResultSetTabelModel tableModel;
    private JTextArea queryArea;
    
    // create ResultSetTableModel and GUI
    public DisplayQueryResults()
    {
    super( "Displaying Query Results" );
    // create ResultSetTableModel and display database table
    try
    {
    // create TableModel for results of query SELECT * FROM Authors
    tableModel = new ResultSetTabelModel( DATABASE_URL,
    USERNAME, PASSWORD, DEFAULT_QUERY );
    // set up JTextArea in which user types queries
    queryArea = new JTextArea( DEFAULT_QUERY, 3, 100 );
    queryArea.setWrapStyleWord( true );
    queryArea.setLineWrap( true );
    JScrollPane scrollPane = new JScrollPane( queryArea,
    ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
    ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER );
    // set up JButton for submitting queries
    JButton submitButton = new JButton( "Submit Query" );
    // create Box to manage placement of queryArea and
    // submitButton in GUI
    Box boxNorth = Box.createHorizontalBox();
    boxNorth.add( scrollPane );
    boxNorth.add( submitButton );
    // create JTable based on the tableModel
    JTable resultTable = new JTable( tableModel );
    JLabel filterLabel = new JLabel( "Filter:" );
    final JTextField filterText = new JTextField();
    JButton filterButton = new JButton( "Apply Filter" );
    Box boxSouth = Box.createHorizontalBox();
    boxSouth.add( filterLabel );
    boxSouth.add( filterText );
    boxSouth.add( filterButton );
    // place GUI components on content pane
    add( boxNorth, BorderLayout.NORTH );
    add( new JScrollPane( resultTable ), BorderLayout.CENTER );
    add( boxSouth, BorderLayout.SOUTH );
    
    // create event listener for submitButton
    submitButton.addActionListener(
    new ActionListener()
    {
    // pass query to table model
    public void actionPerformed( ActionEvent event )
    {
    // perform a new query
    try
    {
    tableModel.setQuery( queryArea.getText() );
    } // end try
    catch ( SQLException sqlException )
    {
    JOptionPane.showMessageDialog( null,
    sqlException.getMessage(), "Database error",
    JOptionPane.ERROR_MESSAGE );
    // try to recover from invalid user query
    // by executing default query
    try
    {
    tableModel.setQuery( DEFAULT_QUERY );
    queryArea.setText( DEFAULT_QUERY );
    } // end try
    catch ( SQLException sqlException2 )
    {
    JOptionPane.showMessageDialog( null,
    sqlException2.getMessage(), "Database error",
    JOptionPane.ERROR_MESSAGE );
    // ensure database connection is closed
    tableModel.disconnectFromDatabase();
    
    System.exit( 1 ); // terminate application
    } // end inner catch
    } // end outer catch
    } // end actionPerformed
    } // end ActionListener inner class
    ); // end call to addActionListener
    final TableRowSorter< TableModel > sorter =
    new TableRowSorter< TableModel >( tableModel );
    resultTable.setRowSorter( sorter );
    setSize( 500, 250 ); // set window size
    setVisible( true ); // display window
    // create listener for filterButton
    filterButton.addActionListener(
    new ActionListener()
    {
      // pass filter text to listener
    public void actionPerformed( ActionEvent e )
    {
    String text = filterText.getText();
    if ( text.length() == 0 )
    sorter.setRowFilter( null );
    else
    {
    try
    {
    sorter.setRowFilter(
    RowFilter.regexFilter( text ) );
    } // end try
    catch ( PatternSyntaxException pse )
    {
    JOptionPane.showMessageDialog( null,
    "Bad regex pattern", "Bad regex pattern",
    JOptionPane.ERROR_MESSAGE );
    } // end catch
    } // end else
    } // end method actionPerfomed
    } // end annonymous inner class
    ); // end call to addActionLister
    } // end try
    catch ( SQLException sqlException )
    {
    JOptionPane.showMessageDialog( null, sqlException.getMessage(),
    "Database error", JOptionPane.ERROR_MESSAGE );
    // ensure database connection is closed
    tableModel.disconnectFromDatabase();
    System.exit( 1 ); // terminate application
    } // end catch
    // dispose of window when user quits application (this overrides
    // the default of HIDE_ON_CLOSE)
    setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    // ensure database connection is closed when user quits application
    addWindowListener(
    new WindowAdapter()
    {
    // disconnect from database and exit when window has closed
    public void windowClosed( WindowEvent event )
    {
    tableModel.disconnectFromDatabase();
    System.exit( 0 );
    } // end method windowClosed
    } // end WindowAdapter inner class
    );
    }
    public static void main(String[] args){
        new DisplayQueryResults();
    } 
}
