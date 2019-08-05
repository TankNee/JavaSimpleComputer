/*
 * @Author: tanknee 
 * @Date: 2019-08-04 22:31:28 
 * @Last Modified by: tanknee
 * @Last Modified time: 2019-08-04 23:32:56
 */
//import java.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
public class MainWindow extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    //各个功能按钮的实现
    ComponentButton operateButton_plus = new ComponentButton("+");
    ComponentButton operateButton_subtract = new ComponentButton("-");
    ComponentButton operateButton_mult = new ComponentButton("*");
    ComponentButton operateButton_divide = new ComponentButton("/");
    ComponentButton operateButton_equals = new ComponentButton("=");
    //数字按钮的显示
    private  ComponentButton[] numberButtons = new ComponentButton[10];
    //显示器
    private JLabel testview;
    //存放四则运算的两个参数
    private String theFirstPram = "";
    private String theSecondPram = "";
    private String operator = null;
    //标志一下当前的变量  
    private int Flag = 0;//此时是第一个参数
    public MainWindow(){
        super("计算器");
        testview = new JLabel("显示器");
        testview.setSize(320,100);
        this.add(testview);
        this.setLayout(new FlowLayout());
        this.setSize(320, 480);
        this.setBounds(10, 10, 320, 480);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        for(int i = 0;i<numberButtons.length;i++){
            numberButtons[i] = new ComponentButton(i);
            numberButtons[i].addActionListener(this);
            this.add(numberButtons[i]);
            //System.out.println("按钮"+i+"添加成功");
        }
        this.add(operateButton_plus);
        operateButton_plus.addActionListener(this);
        this.add(operateButton_subtract);
        operateButton_subtract.addActionListener(this);
        this.add(operateButton_mult);
        operateButton_mult.addActionListener(this);
        this.add(operateButton_divide);
        operateButton_divide.addActionListener(this);
        this.add(operateButton_equals);
        operateButton_equals.addActionListener(this);
        this.setVisible(true);
    }
    public static void main(String[] args){
        new MainWindow();
        String test = "1";
        int a = 1;
        test += a;
        //int test_2 = (int)test;
        System.out.println(Integer.valueOf(test).intValue());
    }
    public void NumberCalculate(int number){//计算，显示函数
        if(Flag == 0){
            theFirstPram += number;
            testview.setText(theFirstPram);
        }else{
            theSecondPram += number;
            testview.setText(theSecondPram);
        }
    }
    public void Calculate(String operators){
        int finaldate = 0;
        //判断运算符
        switch(operators){
            case "+":
            finaldate = Integer.valueOf(theFirstPram).intValue()+Integer.valueOf(theSecondPram).intValue();
                break;
            case "-":
            finaldate = Integer.valueOf(theFirstPram).intValue()-Integer.valueOf(theSecondPram).intValue();
                break;
            case "*":
            finaldate = Integer.valueOf(theFirstPram).intValue()*Integer.valueOf(theSecondPram).intValue();
                break;
            case "/":
            finaldate = Integer.valueOf(theFirstPram).intValue()/Integer.valueOf(theSecondPram).intValue();
                break;
            default:
                break;
        }
        testview.setText(String.valueOf(finaldate));
        System.out.println(finaldate);
    }
    @Override
    public void actionPerformed(ActionEvent e){//这里重载ActionListener里的方法，实现这个接口，每个按钮都会调用这个监听器进行监听
        if(e.getSource().equals(operateButton_plus)){
            Flag = 1;
            operator = "+";
            System.out.println("+");
        }else if(e.getSource().equals(operateButton_subtract)){
            Flag = 1;
            operator = "-";
            System.out.println("-");
        }else if(e.getSource().equals(operateButton_mult)){
            Flag = 1;
            operator = "*";
            System.out.println("*");
        }else if(e.getSource().equals(operateButton_divide)){
            Flag = 1;
            operator = "/";
            System.out.println("/");
        }else if(e.getSource().equals(operateButton_equals)){
            Flag = 0;
            Calculate(operator);
            theFirstPram = "";
            theSecondPram = "";
            System.out.println("=");
        }else if(e.getSource().equals(numberButtons[0])){
            NumberCalculate(0);           
        }else if(e.getSource().equals(numberButtons[1])){
            NumberCalculate(1);
        }else if(e.getSource().equals(numberButtons[2])){
            NumberCalculate(2);
        }else if(e.getSource().equals(numberButtons[3])){
            NumberCalculate(3);
        }else if(e.getSource().equals(numberButtons[4])){
            NumberCalculate(4);
        }else if(e.getSource().equals(numberButtons[5])){
            NumberCalculate(5);
        }else if(e.getSource().equals(numberButtons[6])){
            NumberCalculate(6);
        }else if(e.getSource().equals(numberButtons[7])){
            NumberCalculate(7);
        }else if(e.getSource().equals(numberButtons[8])){
            NumberCalculate(8);
        }else if(e.getSource().equals(numberButtons[9])){
            NumberCalculate(9);
        }

        
    }
    
}