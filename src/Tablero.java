import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Tablero  extends Ventana implements MouseListener, Runnable{
	
	
	ImageIcon img;
	JButton btn;
	JLabel lblReloj;
	Thread crono;
	
	public Tablero(){
		this.setLayout(null);
		btn=new JButton();
		img=new ImageIcon("img/gato.jpg");
		btn.setBounds(100, 100, 200, 200);
		btn.setIcon(img);
		this.add(btn);
		btn.addMouseListener(this);
		
		this.lblReloj=new JLabel("Hola");
		this.lblReloj.setBounds(10, 10, 300, 50);
		this.add(lblReloj);
		crono=new Thread(this);
		crono.start();
	}
	
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		img=new ImageIcon("img/407791_340821085950461_220925074606730_1117796_1077405771_n.jpg");
		btn.setIcon(img);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	int minutos=0,segundos=0,horas=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(;;){
				if(segundos==59){segundos=0;minutos++;}
				if(minutos==59){minutos=0;horas++;}
				segundos++;
				this.lblReloj.setText(horas+":"+minutos+":"+segundos);
				crono.sleep(1000);
			}
			
		}catch(InterruptedException e){
			System.out.println();
		}
	}
	 
}
