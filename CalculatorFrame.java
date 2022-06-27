package Q3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculatorFrame extends JFrame
{
	private JLabel L_first;
	private JLabel L_second;
	private JLabel L_sum;
	private JLabel L_product;
	
	private JTextField T_first;
	private JTextField T_second;
	private JTextField T_sum;
	private JTextField T_product;
	
	private JButton add;
	private JButton multi;
	private JButton restadd;
	private JButton restmulti;
	private JButton restfirst;
	private JButton restsecond;
	
	private String s_first;
	private String s_second;
	private Integer first;
	private Integer second;
	private Integer sum;
	private Integer multiply;
	
	public CalculatorFrame()
	{	
		s_first=""; s_second="";
		first=0; second=0; sum=0; multiply=0;
		
		L_first = new JLabel("Enter First Integer");
		L_second = new JLabel("Enter Second Integer");
		L_sum = new JLabel("Their Sum");
		L_product = new JLabel("Their Product");
		
		T_first = new JTextField();
		T_first.addActionListener(e->{
			s_first=e.getActionCommand();
			first = Integer.parseInt(s_first);
		});
		T_second = new JTextField();
		T_second.addActionListener(e->{
			s_second=e.getActionCommand();
			second = Integer.parseInt(s_second);
		});
		T_sum = new JTextField("0");
		T_product = new JTextField("0");
		
		add = new JButton("Add Button");
		add.addActionListener(e->{
			sum=first+second;
			T_sum.setText(""+sum.toString());
		});
		multi = new JButton("Multiply Button");
		multi.addActionListener(e->{
			multiply=first*second;
			T_product.setText(""+multiply.toString());
		});
		restadd = new JButton("Rest Add Button");
		restadd.addActionListener(e->{
			T_sum.setText("0");
		});
		restmulti = new JButton("Rest Multiply Button");
		restmulti.addActionListener(e->{
			T_product.setText("0");
		});
		restfirst = new JButton("Rest First Number");
		restfirst.addActionListener(e->{
			T_first.setText("0");
		});
		restsecond = new JButton("Rest Second Number");
		restsecond.addActionListener(e->{
			T_second.setText("0");
		});
		
		setLayout(new GridLayout(7,2));
		
		add(L_first);
		add(T_first);
		add(L_second);
		add(T_second);
		add(L_sum);
		add(T_sum);
		add(L_product);
		add(T_product);
		add(add);
		add(restadd);
		add(multi);
		add(restmulti);
		add(restfirst);
		add(restsecond);
		
	}
}
