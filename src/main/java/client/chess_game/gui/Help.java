package client.chess_game.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import javax.swing.*;

/**
 * Help window. Contents are loaded from a html file
 * 
 * @author Gaurav Kumar
 * @since 14/11/2009
 
 */
public class Help extends JFrame {
	
	
	private static final long serialVersionUID = -7279256753979554192L;

	/**
	 * Constructor.
	 */
	public Help() {
		initComponents();
	}

	//Variables declaration
	private JScrollPane scrollPane1;
	private JEditorPane editorPane1;
	private JButton button1;

	ClassLoader cl = Thread.currentThread().getContextClassLoader(); 
	URL urlHelp = cl.getResource("Help.html");

	/**
	 * Initialises graphical user interface components.
	 */
	private void initComponents() {
		if (urlHelp==null) {
			System.out.println("NULL");
		}
		scrollPane1 = new JScrollPane();
		editorPane1 = new JEditorPane();
		button1 = new JButton();

		//======== container ========
		setVisible(true);
		setTitle("Help - Petri's Chess");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridBagLayout());
		((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {10, 0, 65, 5, 0};
		((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {10, 0, 30, 5, 0};
		((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 1.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 1.0, 0.0, 0.0, 1.0E-4};

		//======== scrollPane1 ========
		{
			//---- editorPane1 ----
			editorPane1.setEditable(false);
			editorPane1.setContentType("text/html");
			scrollPane1.setViewportView(editorPane1);
			
			try {
				editorPane1.setPage(urlHelp);
				
			} catch (IOException e) {
				editorPane1.setText("Help file not found");
			}
		}
		contentPane.add(scrollPane1, new GridBagConstraints(1, 1, 2, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));
		
		//---- button1 ----
		button1.setText("Close");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeButtonActionPerformed(e);
			}
		});
		contentPane.add(button1, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));
		
		setSize(900, 650);
		setLocationRelativeTo(null);
	}
	
	/**
	 * Closes frame.
	 * @param e
	 */
	private void closeButtonActionPerformed(ActionEvent e) {
		this.dispose();
	}

	/**
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { 
        	public void run() {
        		JFrame.setDefaultLookAndFeelDecorated(false);
        		new Help();
			
            }
        });
    }
	
    
}
