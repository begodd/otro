package ejemplosdeclase;
//***********************************************
//*		CREACIÓN Y ESCRITURA SOBRE PANELES		*
//***********************************************

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoConPanel {

	public static void main(String[] args) {
		VentanaP ventana=new VentanaP();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

///Creamos la ventana
class VentanaP extends JFrame{
		
	private static final long serialVersionUID = 1L;

		public VentanaP() {
			setVisible(true);
			setSize(750,500);
			setLocation(500,300);
			setTitle("VENTANA CON TEXTO");	
			
			//instanciamos un Panel
			Panel panel1=new Panel();
			// lo agregamos a la ventana
			add(panel1);
			OtroPanel panel2= new OtroPanel();
			add(panel2);
			
	}		
}

//creamos el panel
class Panel extends JPanel{

	
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("GRAFICO EN UN PANEL", 100, 100);
	}
	
	
	
}

class OtroPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.RED);
		Font tipoLetra = new Font("Courier", Font.BOLD, 14);
		g.setFont(tipoLetra);
		g.drawString("OTRO TEXTO", 100, 200);
		
	}
}


