package debug;
import javax.swing.JOptionPane;

public class Aleatorios {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elementos=Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero + de uno=>"));
		int num_aleat[]=new int[elementos];
		for (int i=0; i< num_aleat.length;i++) {
			
			// el error esta aqui, hay que añadir parentesis antes de "Math.." y despues de "*100" para poder ejecutar correctamente el codigo
			num_aleat[i]=(int) (Math.random()*100);
		}
		for (int elem: num_aleat) {
			System.out.println(elem);
		}

	}
}
