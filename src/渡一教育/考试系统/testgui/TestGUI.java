package src.渡一教育.考试系统.testgui;

import javax.swing.*;

public class TestGUI {

    public static void main(String[] args) {
        //1.先创建一个窗体
        JFrame frame = new JFrame();

        //创建一个面板
        JPanel panel = new JPanel();

        //创建一个按钮
        JButton button = new JButton("登录");

        //创建一个复选框
        JCheckBox box1 = new JCheckBox("抽烟");
        JCheckBox box2 = new JCheckBox("烫头");
        JCheckBox box3 = new JCheckBox("喝酒");

        //创建一个单选框
        JRadioButton r1 = new JRadioButton("男");
        JRadioButton r2 = new JRadioButton("女");
        //将单选按钮添加到一个组内
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        //添加一个文本域
        JTextArea area = new JTextArea(5,20);
        //文本域创建滚动条
        JScrollPane pane = new JScrollPane(area);

        //创建一个标签
        JLabel useLabel = new JLabel("账户");
        JLabel passLabel = new JLabel("密码");

        //创建一个文本框
        JTextField text = new JTextField(25);//参数可以为字符串也可以为长度

        //创建一个密码框
        JPasswordField password = new JPasswordField(25);

        //创建一个菜单条   相当于是一个面板
        JMenuBar bar = new JMenuBar();
        //创建一个菜单
        JMenu menu = new JMenu("File");
        //创建一个菜单项
        JMenuItem newItem = new JMenuItem("New");


        //将按钮添加到面板中
        panel.add(useLabel);
        panel.add(text);
        panel.add(passLabel);
        panel.add(password);
        panel.add(button);
        panel.add(box1);
        panel.add(box2);
        panel.add(box3);
        panel.add(r1);
        panel.add(r2);
        panel.add(pane);

        //将面板加在窗体内
        frame.setJMenuBar(bar);
        frame.add(panel);


        //设置不可以拖拽大小
        //frame.setResizable(false);
        //设置窗体出现时的位置和自身的宽高
        frame.setBounds(500,380,400,300);
        //2.设置窗体的属性状态为显示状态
        frame.setVisible(true);
        //3.设置点击关闭按钮的时候 窗体执行完毕
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
