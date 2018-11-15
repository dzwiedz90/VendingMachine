package vendingmachine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class VendingMachine extends JFrame implements ActionListener
{
    //Przyciski panelu lewego
    JTextArea displayLeft;
    JTextArea displayRight;
    JButton siedem;
    JButton osiem;
    JButton dziewiec;
    JButton cztery;
    JButton piec;
    JButton szesc;
    JButton jeden;
    JButton dwa;
    JButton trzy;
    JButton zero;
    JButton zeruj;
    //Przyciski panelu prawego
    JButton piecZL;
    JButton dwaZL;
    JButton jedenZL;
    JButton pisiontGR;
    JButton dwajsciaGR;
    JButton dziesiecGR;
    //Kupno
    JButton buy;
    
    //Obsługa danych z prawego wyświetlacza
    double rightPaneDisplayValueGet;
    String rightPaneDisplayValueSet;
    
    //Konstruktor
    public VendingMachine()
    {
        super("VendingMachine");
        setSize(700, 200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        
        //Panele
        //Main
        JPanel mainPane = new JPanel();
        //boczny wyboru
        JPanel choicePane = new JPanel();
        BoxLayout choicePaneLayout = new BoxLayout(choicePane, BoxLayout.Y_AXIS);
        choicePane.setLayout(choicePaneLayout);
        //lewy z wyborem produktu
        JPanel leftPane = new JPanel();
        BoxLayout leftPaneLayout = new BoxLayout(leftPane, BoxLayout.Y_AXIS);
        leftPane.setLayout(leftPaneLayout);
        //prawy z wyborem pieniążka
        JPanel rightPane = new JPanel();
        BoxLayout rightPaneLayout = new BoxLayout(rightPane, BoxLayout.Y_AXIS);
        rightPane.setLayout(rightPaneLayout);
        JPanel keybordPaneLeft = new JPanel();
        GridLayout keybordLayoutLeft = new GridLayout(4,3);
        keybordPaneLeft.setLayout(keybordLayoutLeft);
        JPanel keybordPaneRight = new JPanel();
        GridLayout keybordLayoutRight = new GridLayout(4,3);
        keybordPaneRight.setLayout(keybordLayoutRight);
        displayLeft = new JTextArea(1, 15);
        displayLeft.setEditable(false);
        
        //PANEL Z WYBOREM
        JButton batonik = new JButton("1.Batonik: 2zł  ");
        JButton czipsy = new JButton("2. Czipsy: 2,50zł ");
        JButton orzeszki = new JButton("3. Orzeszki: 3zł");
        JButton zelki = new JButton("4. Żelki: 2,70zł   ");
        JButton kanapka = new JButton("5. Kanapka 4,6zł ");
        choicePane.add(batonik);
        choicePane.add(czipsy);
        choicePane.add(orzeszki);
        choicePane.add(zelki);
        choicePane.add(kanapka);
        
        //LEWY PANEL
        //Przyciski
        siedem = new JButton("7");
        osiem = new JButton("8");
        dziewiec = new JButton("9");
        cztery = new JButton("4");
        piec = new JButton("5");
        szesc = new JButton("6");
        jeden = new JButton("1");
        dwa = new JButton("2");
        trzy = new JButton("3");
        JButton pusty = new JButton("pusty");
        zero = new JButton("0");
        zeruj = new JButton("C");
        //Dodanie nasłuchu
        siedem.addActionListener(this);
        osiem.addActionListener(this);
        dziewiec.addActionListener(this);
        cztery.addActionListener(this);
        piec.addActionListener(this);
        szesc.addActionListener(this);
        jeden.addActionListener(this);
        dwa.addActionListener(this);
        trzy.addActionListener(this);
        zero.addActionListener(this);
        zeruj.addActionListener(this);
        //Dodanie przycisków do panelu
        keybordPaneLeft.add(siedem);
        keybordPaneLeft.add(osiem);
        keybordPaneLeft.add(dziewiec);
        keybordPaneLeft.add(cztery);
        keybordPaneLeft.add(piec);
        keybordPaneLeft.add(szesc);
        keybordPaneLeft.add(jeden);
        keybordPaneLeft.add(dwa);
        keybordPaneLeft.add(trzy);
        keybordPaneLeft.add(pusty);
        keybordPaneLeft.add(zero);
        keybordPaneLeft.add(zeruj);
        pusty.setVisible(false);
        
        //PRAWY PANEL
        displayRight = new JTextArea("0", 1, 15);
        displayRight.setEditable(false);
        piecZL = new JButton("5zł");
        dwaZL = new JButton("2zł");
        jedenZL = new JButton("1zł");
        pisiontGR = new JButton("50gr");
        dwajsciaGR = new JButton("20gr");
        dziesiecGR = new JButton("10gr");
        //Dodanie nasłuchu
        piecZL.addActionListener(this);
        dwaZL.addActionListener(this);
        jedenZL.addActionListener(this);
        pisiontGR.addActionListener(this);
        dwajsciaGR.addActionListener(this);
        dziesiecGR.addActionListener(this);
        //Dodanie do panelu
        keybordPaneRight.add(piecZL);
        keybordPaneRight.add(dwaZL);
        keybordPaneRight.add(jedenZL);
        keybordPaneRight.add(pisiontGR);
        keybordPaneRight.add(dwajsciaGR);
        keybordPaneRight.add(dziesiecGR);
        
        //KUPNO
        buy = new JButton("Kup");
        buy.addActionListener(this);
        
        //Dodanie elementów do panelu
        leftPane.add(displayLeft);
        leftPane.add(keybordPaneLeft);
        rightPane.add(displayRight);
        rightPane.add(keybordPaneRight);
        mainPane.add(choicePane);
        mainPane.add(leftPane);
        mainPane.add(rightPane);
        mainPane.add(buy);
        add(mainPane);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        Object source = evt.getSource();
        if(source==siedem)
        {
            displayLeft.append("7");
        }
        else if(source==osiem)
        {
            displayLeft.append("8");
        }
        else if(source==dziewiec)
        {
            displayLeft.append("9");
        }
        else if(source==cztery)
        {
            displayLeft.append("4");
        }
        else if(source==piec)
        {
            displayLeft.append("5");
        }
        else if(source==szesc)
        {
            displayLeft.append("6");
        }
        else if(source==jeden)
        {
            displayLeft.append("1");
        }
        else if(source==dwa)
        {
            displayLeft.append("2");
        }
        else if(source==trzy)
        {
            displayLeft.append("3");
        }
        else if(source==zero)
        {
            displayLeft.append("0");
        }
        else if(source==zeruj)
        {         
            displayLeft.setText("");
            displayRight.setText("0");
        }
        else if(source==piecZL)
        {
            rightPaneDisplayValueGet = Double.parseDouble(displayRight.getText());
            rightPaneDisplayValueGet += 5;
            rightPaneDisplayValueGet *= 100;
            rightPaneDisplayValueGet = Math.round(rightPaneDisplayValueGet);
            rightPaneDisplayValueGet /= 100;
            rightPaneDisplayValueSet = Double.toString(rightPaneDisplayValueGet);
            
            displayRight.setText(rightPaneDisplayValueSet);
        }
        else if(source==dwaZL)
        {
            rightPaneDisplayValueGet = Double.parseDouble(displayRight.getText());
            rightPaneDisplayValueGet += 2;
             rightPaneDisplayValueGet *= 100;
            rightPaneDisplayValueGet = Math.round(rightPaneDisplayValueGet);
            rightPaneDisplayValueGet /= 100;
            rightPaneDisplayValueSet = Double.toString(rightPaneDisplayValueGet);
            
            displayRight.setText(rightPaneDisplayValueSet);
        }
        else if(source==jedenZL)
        {
            rightPaneDisplayValueGet = Double.parseDouble(displayRight.getText());
            rightPaneDisplayValueGet += 1;
             rightPaneDisplayValueGet *= 100;
            rightPaneDisplayValueGet = Math.round(rightPaneDisplayValueGet);
            rightPaneDisplayValueGet /= 100;
            rightPaneDisplayValueSet = Double.toString(rightPaneDisplayValueGet);
            
            displayRight.setText(rightPaneDisplayValueSet);
        }
        else if(source==pisiontGR)
        {
            rightPaneDisplayValueGet = Double.parseDouble(displayRight.getText());
            rightPaneDisplayValueGet += 0.5;
             rightPaneDisplayValueGet *= 100;
            rightPaneDisplayValueGet = Math.round(rightPaneDisplayValueGet);
            rightPaneDisplayValueGet /= 100;
            rightPaneDisplayValueSet = Double.toString(rightPaneDisplayValueGet);
            
            displayRight.setText(rightPaneDisplayValueSet);
        }
        else if(source==dwajsciaGR)
        {
            rightPaneDisplayValueGet = Double.parseDouble(displayRight.getText());
            rightPaneDisplayValueGet += 0.2;
             rightPaneDisplayValueGet *= 100;
            rightPaneDisplayValueGet = Math.round(rightPaneDisplayValueGet);
            rightPaneDisplayValueGet /= 100;
            rightPaneDisplayValueSet = Double.toString(rightPaneDisplayValueGet);
            
            displayRight.setText(rightPaneDisplayValueSet);
        }
        else if(source==dziesiecGR)
        {
            rightPaneDisplayValueGet = Double.parseDouble(displayRight.getText());
            rightPaneDisplayValueGet += 0.1;
             rightPaneDisplayValueGet *= 100;
            rightPaneDisplayValueGet = Math.round(rightPaneDisplayValueGet);
            rightPaneDisplayValueGet /= 100;
            rightPaneDisplayValueSet = Double.toString(rightPaneDisplayValueGet);
            
            displayRight.setText(rightPaneDisplayValueSet);
        }
        else if(source==buy)
        {
            buyAction();
        }
    }
    
    private static void setLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch(Exception exc)
        {
            
        }
    }
    
    public void buyAction()
    {
        //Minibaza z danymi amków
        int[] productID = {1, 2, 3, 4, 5};
        String[] productName = {"Batonik", "Czipsy", "Orzeszki", "Żelki", "Kanapka"};
        double[] productPrice = {2.0, 2.5, 3.0, 2.7, 4.6};
        
        //Pobranie danych dot. który produkt i ile pieniądza wrzucono
        //ID produktu
        int productIDget = Integer.parseInt(displayLeft.getText());
        if(productIDget>5)
        {
            productIDgetWrong();
            return;
        }
        
        //ilosc wrzuconej kasy
        double rightPaneDisplayValueIfCorrect = Double.parseDouble(displayRight.getText());
        
        //Wybór produktu, sprawdzenie czy hajs się zgadza i wydanie reszty
        //reszta do wydania
        double change;
        double productPriceGet;
        if(productIDget==1)
        {        
                if(productIDget==1 && rightPaneDisplayValueIfCorrect>=2.0)
                {
                    productPriceGet = productPrice[0];
                    change = productPriceGet - rightPaneDisplayValueIfCorrect;
                    releaseGoody(-change);
                }
                else
                {
                    denyReleaseGoody();
                }
        }
        else if(productIDget == 2)
        {
                if(productIDget==2 && rightPaneDisplayValueIfCorrect>=2.5)
                {
                    productPriceGet = productPrice[1];
                    change = productPriceGet - rightPaneDisplayValueIfCorrect;
                    releaseGoody(-change);
                }
                else
                {
                    denyReleaseGoody();
                }
        }
        else if(productIDget == 3)
        {
                if(productIDget==3 && rightPaneDisplayValueIfCorrect>=3.0)
                {
                    productPriceGet = productPrice[2];
                    change = productPriceGet - rightPaneDisplayValueIfCorrect;
                    releaseGoody(-change);
                }
                else
                {
                    denyReleaseGoody();
                }
        }
        else if(productIDget == 4)
        {
                if(productIDget==4 && rightPaneDisplayValueIfCorrect>=2.7)
                {
                    productPriceGet = productPrice[3];
                    change = productPriceGet - rightPaneDisplayValueIfCorrect;
                    releaseGoody(-change);
                }
                else
                {

                    denyReleaseGoody();
                }
        }
        else if(productIDget == 5)
        {
                if(productIDget==5 && rightPaneDisplayValueIfCorrect>=4.6)
                {
                    productPriceGet = productPrice[4];
                    change = productPriceGet - rightPaneDisplayValueIfCorrect;
                    releaseGoody(-change);
                }
                else
                {
                    denyReleaseGoody();
                }
        }
        
        productIDget = 0;
        rightPaneDisplayValueIfCorrect = 0;
        productPriceGet = 0;
        change = 0;
    }
    
    //public double countChange()
    //{
    //    double countedChange = 0;
    //    return countedChange;
    //}
    
    public void productIDgetWrong()
    {
        JOptionPane.showMessageDialog(null, "Niewłaściwy numer smakołyka!");
    }
    
    public void releaseGoody(double changeIn)
    {
        
        double change = changeIn;
        change *= 100;
        change = Math.round(change);
        change /= 100;
        JOptionPane.showMessageDialog(null, "Odbierz swój smakołyk. Reszta: "+ Double.toString(change));
    }
    
    public void denyReleaseGoody()
    {
        JOptionPane.showMessageDialog(null, "Wprowadzona kwoa jest zbyt niska!");
    }
    
    public static void main(String[] args)
    {
        VendingMachine machine = new VendingMachine();
    }
    
}
