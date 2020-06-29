import javax.swing.*;
import java.awt.*;

public class NoteEditor extends JFrame
{
	JMenuBar mbar;
	JMenu fileMenu, editMenu;
	JMenuItem openItem, saveItem; //items for File Menu
	JMenuItem copyItem, cutItem; // items for Edit Menu
	
	JTextArea txtEditor;
	
	public NoteEditor()
	{
		mbar = new JMenuBar();
		//Menu
		fileMenu = new JMenu("File");
		//fileMenu.setMnemonic(KeyEvent.VK_F);
		
		editMenu = new JMenu("Edit");
		//Menu Items
		openItem = new JMenuItem("Open");
		saveItem = new JMenuItem("Save");
		copyItem = new JMenuItem("Copy");
		cutItem = new JMenuItem("Cut");
		
		txtEditor = new JTextArea(30,30);
		txtEditor.setLineWrap(true);
                
		setJMenuBar(mbar);
		mbar.add(fileMenu);
		mbar.add(editMenu);
		
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		editMenu.add(copy);
		editMenu.add(cut);
		setLayout(new FlowLayout());
		
		add(txtEditor);
		
		//Activate Close Button on Frame Window setDefaultCloseOperation (EXIT_ON_CLOSE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] musty)
	{
		NoteEditor ne = new NoteEditor();
		
		ne.setSize(300,200);
		ne.setVisible(true);
		ne.setResizable(true);
		//ne.setUndecorated(false);
		//lg.setTitle("Login");
	}
}
