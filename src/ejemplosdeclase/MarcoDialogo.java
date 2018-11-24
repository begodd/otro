package ejemplosdeclase;



import javax.swing.*;
public class MarcoDialogo extends JFrame {

private static final long serialVersionUID = 1L;

public MarcoDialogo(String nom){
     super(nom);
     setSize(300,200);
     setResizable(false);
    }

public static void main(String args[]){
	MarcoDialogo marcoPadre;
	marcoPadre = new MarcoDialogo("Marco de diálogo");
	marcoPadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//campo de texto
	JTextField texto = new JTextField("Ventana Principal");
	texto.setEditable(false);
	marcoPadre.add(texto);
	marcoPadre.setVisible(true);
	//se crea un diálogo no modal
	Dialogo diagNoModal =new Dialogo(marcoPadre,"Dialogo no modal", false);
	diagNoModal.setBounds(100,100,200,80);
	diagNoModal.setVisible(true);
	diagNoModal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	//se crea un diálogo modal
	Dialogo diagModal =new Dialogo(marcoPadre,"Dialogo modal", true);
	diagModal.setSize(200,80);
	diagModal.setVisible(true);
	diagModal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}

class Dialogo extends JDialog {    
	
	private static final long serialVersionUID = 1L;

	public Dialogo(JFrame padre, String nom, boolean modo){
		super(padre, modo);    
		JLabel et;    
		et = new JLabel(nom);    
		add(et);  
	} 
}

