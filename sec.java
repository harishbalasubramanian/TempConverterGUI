import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.math.BigDecimal;
public class sec extends JFrame {
	private JTextField num1;

	private JButton farcel;
	private JButton celfar;
	private JButton farkel;
	private JButton kelfar;
	private JButton celkel;
	private JButton kelcel;
	private double num2;
	private double x;
	private BigDecimal bog1,bog2, bog3, bog4;
	
	

	public sec() {
		super("Temperature Converter");
		setLayout(new FlowLayout());
		
		
		
		num1 = new JTextField("Enter the Number");
		add(num1);

		
	
		farcel = new JButton("°F to °C");
		add(farcel);
		celfar = new JButton("°C to °F");
		add(celfar);
		farkel = new JButton("°F to °K");
		add(farkel);
		kelfar = new JButton("K° to °F");
		add(kelfar);
		celkel = new JButton("°C to °K");
		add(celkel);
		kelcel = new JButton("°K to °C");
		add(kelcel);
		
		
		
		Yay way = new Yay();
		farcel.addActionListener(way);
		celfar.addActionListener(way);
		farkel.addActionListener(way);
		kelfar.addActionListener(way);
		celkel.addActionListener(way);
		kelcel.addActionListener(way);
		
		
	}
	private class Yay implements ActionListener{
		public void actionPerformed (ActionEvent wow) {
			
			
			
			if(wow.getSource()==farcel) {
				num2 = Double.parseDouble(num1.getText());
				
				x = ftoc(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °F is %2f °C", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}else if(wow.getSource()==celfar) {
				num2 = Double.parseDouble(num1.getText());
				x = ctof(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °F is %2f °C", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
			}else if(wow.getSource()==farkel) {
				num2 = Double.parseDouble(num1.getText());
				x = ftok(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °F is %2f °C", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}else if(wow.getSource()==kelfar) {
				num2 = Double.parseDouble(num1.getText());
				x = ktof(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °F is %2f °C", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}else if(wow.getSource()==celkel) {
				num2 = Double.parseDouble(num1.getText());
				x = ctok(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °F is %2f °C", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}else if(wow.getSource()==kelcel) {
				num2 = Double.parseDouble(num1.getText());
				x = ktoc(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °F is %2f °C", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}
		}
	}
	public double ftoc(double num) {
		double b = Math.round(((num-32)*5/9)*100)/100.0;
		return b;
	}
	public double ctof(double num){
		double b = Math.round(( num*1.8 + 32)*100)/100.0;
		return b;
	}
	public double ctok(double num){
		double b = Math.round((num+273.15)*100)/100.0;
		return b;
	}
	public double ktoc(double num){
		double b = Math.round((num-273.15)*100)/100.0;	
		return b;
	}
	public double ftok(double num){
		double b = Math.round((num+457.67)*100)/100.0;
		return b;
	}
	public double ktof(double num){
		double b = Math.round((num-457.67)*100)/100.0;
		return b;
	}
}
