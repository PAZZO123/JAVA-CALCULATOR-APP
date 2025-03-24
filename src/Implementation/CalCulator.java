/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unrelated;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author USER
 */
public class CalCulator implements ActionListener {
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons=new JButton[10];
    JButton[] functionButtons=new JButton[9];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton,equButton,clrButton,delButton,negButton;
    JPanel panel;
    
    Font myFont= new Font("Ink Free",Font.BOLD,30);
    double num1=0,num2=0,result=0;
    char operator;
    
    CalCulator(){
        
       frame=new JFrame("Calculator By Pazzo");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(420, 550);
       frame.setLayout(null);
       frame.setResizable(false);
     //  frame.setBackground(Color.black);
       textfield=new JTextField();
       textfield.setBounds(50,25,300,50);
       textfield.setFont(myFont);
       textfield.setEditable(false);
       
       addButton=new JButton("+");
       subButton=new JButton("-");
       divButton=new JButton("/");
       mulButton=new JButton("X");
       decButton=new JButton(".");
       equButton=new JButton("=");
       delButton=new JButton("Del");
       clrButton=new JButton("Clear");
       negButton=new JButton("(-)");
       
       
       functionButtons[0]=addButton;
       functionButtons[1]=subButton;
       functionButtons[2]=mulButton;
       functionButtons[3]=divButton;
       functionButtons[4]=decButton;
       functionButtons[5]=equButton;
       functionButtons[6]=delButton;
       functionButtons[7]=clrButton;
       functionButtons[8]=negButton;
       
       for(int i=0;i<9;i++){
           
          functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
              functionButtons[i].setFocusable(false);
       }
       
          for(int i=0;i<10;i++){
              numberButtons[i]=new JButton(String.valueOf(i));
           
           numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
              numberButtons[i].setFocusable(false);
       }
        negButton.setBounds(50,430,100,50);
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(250,430,100,50);
        panel=new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        //panel.setBackground(Color.GRAY);
        
        panel.add(numberButtons[1]);
         panel.add(numberButtons[2]);
          panel.add(numberButtons[3]);
          panel.add(addButton);
          
           panel.add(numberButtons[4]);
         panel.add(numberButtons[5]);
          panel.add(numberButtons[6]);
          panel.add(subButton);
          
           panel.add(numberButtons[7]);
         panel.add(numberButtons[8]);
          panel.add(numberButtons[9]);
          panel.add(mulButton);
        
           panel.add(decButton);
           panel.add(numberButtons[0]);
            panel.add(equButton);
             panel.add(divButton);
           
           
       frame.add(textfield);
       frame.add(panel);
       frame.add(delButton);
       frame.add(clrButton);
        frame.add(negButton);
       
       frame.setVisible(true);
      
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       CalCulator calculator=new CalCulator();
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++){
            if(e.getSource() == numberButtons[i]){
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
            }
        if(e.getSource() == decButton){
                textfield.setText(textfield.getText().concat("."));
            }
            if(e.getSource() == addButton){
                num1=Double.parseDouble(textfield.getText());
                operator='+';
                textfield.setText("");
            }
            if(e.getSource() == subButton){
                num1=Double.parseDouble(textfield.getText());
                operator='-';
                textfield.setText("");
            }
            if(e.getSource() == mulButton){
                num1=Double.parseDouble(textfield.getText());
                operator='X';
                textfield.setText("");
            }
            if(e.getSource() == divButton){
                num1=Double.parseDouble(textfield.getText());
                operator='/';
                textfield.setText("");
            }
            
            if(e.getSource()==equButton){
                num2=Double.parseDouble(textfield.getText());
                
                switch(operator){
                  case'+':
                      result=num1+num2;
                      break;
                  
                  case'-':
                      result=num1-num2;
                      break;
                      
                   case'X':
                      result=num1*num2;
                      break;
                      
                   case'/':
                      result=num1/num2;
                      break;
                }
                textfield.setText(String.valueOf(result));
                num1=result;
            }
            if(e.getSource() == clrButton){
                textfield.setText("");
            }
            
               if(e.getSource() == delButton){
                String string =textfield.getText();
                textfield.setText("");
                for(int i=0;i<string.length()-1;i++){
                    textfield.setText(textfield.getText()+string.charAt(i));
                }
            }
             if(e.getSource() == negButton){
                double temp =Double.parseDouble(textfield.getText());
                temp*=-1;
                textfield.setText(String.valueOf(temp));
            }
            
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
