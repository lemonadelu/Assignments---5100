/*design and develop a calculator interface
1. Create the container
2. Create the components
3. Create the layout
4. Set the layout to container's content pane
5. Add the components to container's content pane
6. Display the container
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class calculator extends JFrame {
    private JTextField textField;
    private JButton bts[];
    private JButton add, subtract, multiply, divide, percent;
    private JButton compute, decimal, btPN, btClear, backSpace;
    private Font font;
    private String operations, answer;
    private double firstNum, secondNum, result;


    private void createComponents(){
        font =  new Font("TimesRoman", Font.BOLD, 20);
        textField = new JTextField(10);
        textField.setFont(font);


        bts = new JButton[10];
        for(int i = 0; i < bts.length; i++){
            bts[i] = new JButton(i + "");
            bts[i].setFont(font);
        }
        bts[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variable i is accessed from within inner class, needs to be final or global variable
                String EnterNumber = textField.getText() + bts[7].getText();
                textField.setText(EnterNumber);
            }
        });
        bts[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variable i is accessed from within inner class, needs to be final or global variable
                String EnterNumber = textField.getText() + bts[8].getText();
                textField.setText(EnterNumber);
            }
        });
        bts[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variable i is accessed from within inner class, needs to be final or global variable
                String EnterNumber = textField.getText() + bts[9].getText();
                textField.setText(EnterNumber);
            }
        });
        bts[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variable i is accessed from within inner class, needs to be final or global variable
                String EnterNumber = textField.getText() + bts[6].getText();
                textField.setText(EnterNumber);
            }
        });
        bts[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variable i is accessed from within inner class, needs to be final or global variable
                String EnterNumber = textField.getText() + bts[5].getText();
                textField.setText(EnterNumber);
            }
        });
        bts[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variable i is accessed from within inner class, needs to be final or global variable
                String EnterNumber = textField.getText() + bts[4].getText();
                textField.setText(EnterNumber);
            }
        });
        bts[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variable i is accessed from within inner class, needs to be final or global variable
                String EnterNumber = textField.getText() + bts[3].getText();
                textField.setText(EnterNumber);
            }
        });
        bts[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variable i is accessed from within inner class, needs to be final or global variable
                String EnterNumber = textField.getText() + bts[2].getText();
                textField.setText(EnterNumber);
            }
        });
        bts[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variable i is accessed from within inner class, needs to be final or global variable
                String EnterNumber = textField.getText() + bts[1].getText();
                textField.setText(EnterNumber);
            }
        });
        bts[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variable i is accessed from within inner class, needs to be final or global variable
                String EnterNumber = textField.getText() + bts[0].getText();
                textField.setText(EnterNumber);
            }
        });


        add = new JButton("+");
        add.setFont(font);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "+";
            }
        });
        subtract = new JButton("-");
        subtract.setFont(font);
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "-";
            }
        });

        multiply = new JButton("*");
        multiply.setFont(font);
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "*";
            }
        });

        divide = new JButton("/");
        divide.setFont(font);
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "/";
            }
        });

        percent = new JButton("%");
        percent.setFont(font);
        percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = Double.parseDouble(textField.getText());
                textField.setText("");
                operations = "%";
            }
        });

        compute = new JButton("=");
        compute.setFont(font);
        compute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                secondNum = Double.parseDouble(textField.getText());
                if(operations == "+"){
                    result = firstNum + secondNum;
                    answer = String.format("%.2f",result);
                    textField.setText(answer);
                }
                if(operations == "-"){
                    result = firstNum - secondNum;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }
                if(operations == "*"){
                    result = firstNum * secondNum;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }
                if(operations == "/"){
                    result = firstNum / secondNum;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }
                if(operations == "%"){
                    result = firstNum % secondNum;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }
            }
        });

        btPN = new JButton("\u00B1");
        btPN.setFont(font);
        btPN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double ops = Double.parseDouble(String.valueOf(textField.getText()));
                ops = ops * (-1);
                textField.setText(String.valueOf(ops));
            }
        });

        decimal = new JButton(".");
        decimal.setFont(font);
        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String num = textField.getText();
                if(!num.contains(".")) {
                    textField.setText(num+".");
                }
            }
        });


        //Create a button to clear the number user entered
        btClear = new JButton("c");
        btClear.setFont(font);
        btClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText(null);
            }
        });

        //Create a button to delete the last number user entered
        backSpace = new JButton("\uF0E7");
        backSpace.setFont(font);
        backSpace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String backSpace = null;
                if(textField.getText().length() > 0){
                    StringBuffer num = new StringBuffer(textField.getText());
                    num.deleteCharAt(textField.getText().length() - 1);
                    backSpace = num.toString();
                    textField.setText(backSpace);
                }
            }
        });
    }
    private void setLayout(){
        //lay out 20 buttons into 5 rows and 4 columns
        GridLayout gl = new GridLayout(5, 4);
        Container c = this.getContentPane();
        c.setLayout(gl);
    }

    //Create container and add components
    private void addComponents(){
        Container c = getContentPane();
        c.add(textField);

        JPanel p1 = new JPanel();
        p1.add(subtract);
        p1.add(multiply);
        p1.add(divide);
        p1.add(percent);
        p1.add(backSpace);
        c.add(p1);

        JPanel p2 = new JPanel();
        p2.add(bts[7]);
        p2.add(bts[8]);
        p2.add(bts[9]);
        p2.add(add);
        p2.add(btClear);
        c.add(p2);

        JPanel p3 = new JPanel();
        p3.add(bts[6]);
        p3.add(bts[5]);
        p3.add(bts[4]);
        p3.add(decimal);
        p3.add(compute);
        c.add(p3);

        JPanel p4 = new JPanel();
        p4.add(bts[3]);
        p4.add(bts[2]);
        p4.add(bts[1]);
        p4.add(bts[0]);
        p4.add(btPN);
        c.add(p4);
    }


    private void display(){
        setSize(350, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        calculator c = new calculator();
        c.setTitle("Lu's Calculator");
        c.createComponents();
        c.setLayout();
        c.addComponents();
        c.display();
    }
}
