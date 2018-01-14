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
	private JButton farran;
	private JButton ranfar;
	private JButton celran;
	private JButton rancel;
	private JButton kelran;
	private JButton rankel;
	
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
		farran = new JButton("°F to °R");
		add(farran);
		ranfar = new JButton("°R to °F");
		add(ranfar);
		celran = new JButton("°C to °R");
		add(celran);
		rancel = new JButton("°R to °C");
		add(rancel);
		kelran = new JButton("°K to °R");
		add(kelran);
		rankel = new JButton("°R to °K");
		add(rankel);
		Yay way = new Yay();
		farcel.addActionListener(way);
		celfar.addActionListener(way);
		farkel.addActionListener(way);
		kelfar.addActionListener(way);
		celkel.addActionListener(way);
		kelcel.addActionListener(way);
		farran.addActionListener(way);
		ranfar.addActionListener(way);
		celran.addActionListener(way);
		rancel.addActionListener(way);
		kelran.addActionListener(way);
		rankel.addActionListener(way);
		
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
				String h = String.format("%2f °C is %2f °F", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
			}else if(wow.getSource()==farkel) {
				num2 = Double.parseDouble(num1.getText());
				x = ftok(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °F is %2f °K", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}else if(wow.getSource()==kelfar) {
				num2 = Double.parseDouble(num1.getText());
				x = ktof(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °K is %2f °F", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}else if(wow.getSource()==celkel) {
				num2 = Double.parseDouble(num1.getText());
				x = ctok(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °C is %2f °K", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}else if(wow.getSource()==kelcel) {
				num2 = Double.parseDouble(num1.getText());
				x = ktoc(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °K is %2f °C", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}else if(wow.getSource()==farran) {
				num2 = Double.parseDouble(num1.getText());
				x = ftor(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °F is %2f °R", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
			}else if(wow.getSource()==ranfar) {
				num2 = Double.parseDouble(num1.getText());
				x = rtof(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °R is %2f °F", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}else if(wow.getSource()==celran) {
				num2 = Double.parseDouble(num1.getText());
				x = ctor(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °C is %2f °R", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}else if(wow.getSource()==rancel) {
				num2 = Double.parseDouble(num1.getText());
				x = rtoc(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °R is %2f °C", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}else if(wow.getSource()==kelran) {
				num2 = Double.parseDouble(num1.getText());
				x = ktor(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °K is %2f °R", bog3, bog4);
				JOptionPane.showMessageDialog(null,h);
				
			}else if(wow.getSource()==rankel) {
				num2 = Double.parseDouble(num1.getText());
				x = rtok(num2);
				bog1 = new BigDecimal(num2);
				bog2 = new BigDecimal(x);
				bog3 = bog1.stripTrailingZeros();
				bog4 = bog2.stripTrailingZeros();
				String h = String.format("%2f °R is %2f °K", bog3, bog4);
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
		double b = Math.round(((num-273.15))*100)/100.0;	
		return b;
	}
	public double ftok(double num){
		double b = Math.round((num+457.67)*5/9*100)/100.0;
		return b;
	}
	public double ktof(double num){
		double b = Math.round((num-457.67)*5/9*100)/100.0;
		return b;
	}
	public double ftor(double num){
		double b = Math.round((num+459.67)*100)/100.0;
		return b;
	}
	public double rtof(double num){
		double b = Math.round((num-459.67)*100)/100.0;
		return b;
	}
	public double ctor(double num){
		double b = Math.round((num+273.15)*9/5*100)/100.0;
		return b;
	}
	public double rtoc(double num){
		double b = Math.round((num-491.67)*100)/100.0;
		return b;
	}
	public double ktor(double num){
		double b = Math.round(num*9/5*100)/100.0;
		return b;
	}
	public double rtok(double num){
		double b = Math.round(num*5/9*100)/100.0;
		return b;
	}
}

