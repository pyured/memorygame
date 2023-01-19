import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    private Timer timer;
    private Timer userTimer;
    private Timer backOut;
    private int displayCount = -1; 
    private JButton startButton;
    private JLabel titleLabel;
    private JLabel chooseDifficultyLabel;
    private JPanel buttonBorder;
    
    private JButton choiceEasy;
    private JButton choiceNormal;
    private JButton choiceHard;

    private JButton redChoice;
    private JButton blueChoice;
    private JButton greenChoice;
    private JButton yellowChoice;
    private JPanel borderForAnswers;
    private JLabel displayBlanket;
    private JLabel commenceText;
    private JLabel endGame;


    public MyFrame(){

        ImageIcon pigIcon = new ImageIcon("sprites\\piginablanket.png");
        ImageIcon titleScreenIcon = Blanket.biggerImage(pigIcon, 350, 350);
    

        titleLabel = new JLabel();
        titleLabel.setVisible(true);
        titleLabel.setText("Pigs In A Blanket: The Memory Game");
        titleLabel.setIcon(titleScreenIcon);
        titleLabel.setHorizontalTextPosition(JLabel.CENTER);
        titleLabel.setVerticalTextPosition(JLabel.BOTTOM);
        titleLabel.setFont(new Font("Default", Font.PLAIN, 50));
        titleLabel.setForeground(new Color(0x000000));
        titleLabel.setIconTextGap(0);
        titleLabel.setBounds(20,0,900,450);

        chooseDifficultyLabel = new JLabel();
        chooseDifficultyLabel.setVisible(false);
        chooseDifficultyLabel.setText("SELECT YOUR DIFFICULTY");
        chooseDifficultyLabel.setHorizontalTextPosition(JLabel.CENTER);
        chooseDifficultyLabel.setVerticalTextPosition(JLabel.CENTER);
        chooseDifficultyLabel.setFont(new Font("Default", Font.PLAIN, 40));
        chooseDifficultyLabel.setBounds(190,50,520,100);

        commenceText = new JLabel();
        commenceText.setVisible(false);
        commenceText.setText("Remember the order of blankets!");
        commenceText.setHorizontalTextPosition(JLabel.CENTER);
        commenceText.setVerticalTextPosition(JLabel.CENTER);
        commenceText.setFont(new Font("Default", Font.PLAIN, 40));
        commenceText.setBounds(145,200,582,100);

        displayBlanket = new JLabel();
        displayBlanket.setVisible(false);
        displayBlanket.setBounds(265,50,350,350);
        displayBlanket.setHorizontalTextPosition(JLabel.CENTER);
        displayBlanket.setVerticalTextPosition(JLabel.BOTTOM);
        displayBlanket.setFont(new Font("Default", Font.PLAIN, 40));
        displayBlanket.setIconTextGap(-40);

        endGame = new JLabel();
        endGame.setVisible(false);
        endGame.setHorizontalTextPosition(JLabel.CENTER);
        endGame.setVerticalTextPosition(JLabel.BOTTOM);
        endGame.setFont(new Font("Default", Font.PLAIN, 20));
        endGame.setIcon(Blanket.biggerImage(new ImageIcon("sprites\\pig.png"), 350, 350));
        endGame.setBounds(265, 50, 350, 350);
        endGame.setIconTextGap(-30);
        
        buttonBorder = new JPanel();
        buttonBorder.setVisible(true);
        buttonBorder.setBackground(new Color(0x3971A2));
        buttonBorder.setBounds(250, 550, 400, 150);
        buttonBorder.setLayout(new BorderLayout());

        borderForAnswers = new JPanel();
        borderForAnswers.setVisible(false);
        borderForAnswers.setBackground(new Color(0x225B8D));
        borderForAnswers.setBounds(0,425,900,475);
        borderForAnswers.setLayout(new BorderLayout());

        startButton = new JButton();
        startButton.setVisible(true);
        startButton.setBounds(260,560,380,130);
        startButton.addActionListener(this);
        startButton.setFont(new Font("Comic Sans", Font.BOLD, 50));
        startButton.setText("START GAME");
        startButton.setFocusable(false);

        choiceEasy = new JButton();
        choiceEasy.setVisible(false);
        choiceEasy.setBounds(250,225,400,150);
        choiceEasy.addActionListener(this);
        choiceEasy.setFont(new Font("Comic Sans", Font.BOLD, 50));
        choiceEasy.setText("EASY");
        choiceEasy.setForeground(Color.green);
        choiceEasy.setFocusable(false);

        choiceNormal = new JButton();
        choiceNormal.setVisible(false);
        choiceNormal.setBounds(250,385,400,150);
        choiceNormal.addActionListener(this);
        choiceNormal.setFont(new Font("Comic Sans", Font.BOLD, 50));
        choiceNormal.setText("NORMAL");
        choiceNormal.setForeground(Color.yellow);
        choiceNormal.setFocusable(false);

        choiceHard = new JButton();
        choiceHard.setVisible(false);
        choiceHard.setBounds(250,545,400,150);
        choiceHard.addActionListener(this);
        choiceHard.setFont(new Font("Comic Sans", Font.BOLD, 50));
        choiceHard.setText("HARD");
        choiceHard.setForeground(Color.red);
        choiceHard.setFocusable(false);

        redChoice = new JButton();
        redChoice.setVisible(false);
        redChoice.setIcon(Blanket.biggerImage(new ImageIcon("sprites\\redblanket.png"), 150, 150));
        redChoice.setBounds(10,440,430,205);
        redChoice.addActionListener(this);
        redChoice.setFont(new Font("Comic Sans", Font.BOLD, 50));
        redChoice.setFocusable(false);

        blueChoice = new JButton();
        blueChoice.setVisible(false);
        blueChoice.setIcon(Blanket.biggerImage(new ImageIcon("sprites\\blueblanket.png"), 150, 150));
        blueChoice.setBounds(445,440,430,205);
        blueChoice.addActionListener(this);
        blueChoice.setFont(new Font("Comic Sans", Font.BOLD, 50));
        blueChoice.setFocusable(false);

        greenChoice = new JButton();
        greenChoice.setVisible(false);
        greenChoice.setIcon(Blanket.biggerImage(new ImageIcon("sprites\\greenblanket.png"), 150, 150));
        greenChoice.setBounds(10,650,430,205);
        greenChoice.addActionListener(this);
        greenChoice.setFont(new Font("Comic Sans", Font.BOLD, 50));
        greenChoice.setFocusable(false);

        yellowChoice = new JButton();
        yellowChoice.setVisible(false);
        yellowChoice.setIcon(Blanket.biggerImage(new ImageIcon("sprites\\yellowblanket.png"), 150, 150));
        yellowChoice.setBounds(445,650,430,205);
        yellowChoice.addActionListener(this);
        yellowChoice.setFont(new Font("Comic Sans", Font.BOLD, 50));
        yellowChoice.setFocusable(false);

        this.setTitle("Pigs in a Blanket");
        this.setSize(900, 900);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(titleLabel);
        this.add(buttonBorder);
        this.add(startButton);
        this.add(chooseDifficultyLabel);
        this.add(choiceEasy);
        this.add(choiceNormal);
        this.add(choiceHard);
        this.add(redChoice);
        this.add(blueChoice);
        this.add(greenChoice);
        this.add(yellowChoice);
        this.add(borderForAnswers);
        this.add(commenceText);
        this.add(displayBlanket);
        this.add(endGame);

        this.setIconImage(pigIcon.getImage());
        this.getContentPane().setBackground(new Color(0x71BCFE));

        
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton)
        {
            titleLabel.setVisible(false);
            startButton.setVisible(false);
            buttonBorder.setVisible(false);
            chooseDifficultyLabel.setVisible(true);
            choiceEasy.setVisible(true);
            choiceNormal.setVisible(true);
            choiceHard.setVisible(true);
        }   
        if (e.getSource() == choiceEasy)
        {
            Game.setDifficulty(1);
            chooseDifficultyLabel.setVisible(false);
            choiceEasy.setVisible(false);
            choiceNormal.setVisible(false);
            choiceHard.setVisible(false);
        }
        if (e.getSource() == choiceNormal)
        {
            Game.setDifficulty(2);
            chooseDifficultyLabel.setVisible(false);
            choiceEasy.setVisible(false);
            choiceNormal.setVisible(false);
            choiceHard.setVisible(false);
        }
        if (e.getSource() == choiceHard)
        {
            Game.setDifficulty(3);
            chooseDifficultyLabel.setVisible(false);
            choiceEasy.setVisible(false);
            choiceNormal.setVisible(false);
            choiceHard.setVisible(false);
        }
        if (e.getSource() == choiceEasy || e.getSource() == choiceNormal || e.getSource() == choiceHard)
        {
            timer = new Timer(3000, this);
            timer.setRepeats(false);
            timer.start();
            Game newGame = new Game();
            System.out.println("Game Start");
            borderForAnswers.setVisible(true);
            commenceText.setVisible(true);
            redChoice.setVisible(true);
            blueChoice.setVisible(true);
            greenChoice.setVisible(true);
            yellowChoice.setVisible(true);
            redChoice.setEnabled(false);
            blueChoice.setEnabled(false);
            greenChoice.setEnabled(false);
            yellowChoice.setEnabled(false);
        }
        if (e.getSource() == timer)
        {
            timer = new Timer(1500, this);
            if(displayCount < Game.questionBlankets().length - 1){
                displayCount++;
            }
            commenceText.setVisible(false);
            displayBlanket.setVisible(true);
            timer.stop();
            displayBlanket.setIcon(Blanket.biggerImage(Game.questionBlankets()[displayCount].getBlanketImage(), 350, 350));
            displayBlanket.setText(String.valueOf(displayCount + 1));
            if(!(displayCount < Game.questionBlankets().length - 1))
            {
                timer.stop();
                userTimer = new Timer(1500, this);
                userTimer.setRepeats(false);
                userTimer.start();
            }else{
                timer.start();
            }
        }
        if (e.getSource() == userTimer)
        {
            displayCount = -1;
            displayBlanket.setVisible(false);
            redChoice.setEnabled(true);
            blueChoice.setEnabled(true);
            greenChoice.setEnabled(true);
            yellowChoice.setEnabled(true);
        }
        if (e.getSource() == redChoice)
        {
            displayCount++;
            displayBlanket.setVisible(true);
            displayBlanket.setIcon(Blanket.biggerImage(new ImageIcon("sprites\\redblanket.png"), 350, 350));
            Game.setUserBlanketsIndex(displayCount, new Blanket(1));
            displayBlanket.setText(String.valueOf(displayCount + 1));
            if (displayCount == Game.userBlankets().length - 1)
            {
                backOut = new Timer(1, this);
                backOut.setRepeats(false);
                backOut.start();
            }
        }
        if (e.getSource() == blueChoice)
        {
            displayCount++;
            displayBlanket.setVisible(true);
            displayBlanket.setIcon(Blanket.biggerImage(new ImageIcon("sprites\\blueblanket.png"), 350, 350));
            Game.setUserBlanketsIndex(displayCount, new Blanket(2));
            displayBlanket.setText(String.valueOf(displayCount + 1));
            if (displayCount == Game.userBlankets().length - 1)
            {
                backOut = new Timer(1, this);
                backOut.setRepeats(false);
                backOut.start();
            }
        }
        if (e.getSource() == greenChoice)
        {
            displayCount++;
            displayBlanket.setVisible(true);
            displayBlanket.setIcon(Blanket.biggerImage(new ImageIcon("sprites\\greenblanket.png"), 350, 350));
            Game.setUserBlanketsIndex(displayCount, new Blanket(3));
            displayBlanket.setText(String.valueOf(displayCount + 1));
            if (displayCount == Game.userBlankets().length - 1)
            {
                backOut = new Timer(1, this);
                backOut.setRepeats(false);
                backOut.start();
            }
        }
        if (e.getSource() == yellowChoice)
        {
            displayCount++;
            displayBlanket.setVisible(true);
            displayBlanket.setIcon(Blanket.biggerImage(new ImageIcon("sprites\\yellowblanket.png"), 350, 350));
            Game.setUserBlanketsIndex(displayCount, new Blanket(4));
            displayBlanket.setText(String.valueOf(displayCount + 1));
            if (displayCount == Game.userBlankets().length - 1)
            {
                backOut = new Timer(1, this);
                backOut.setRepeats(false);
                backOut.start();
            }
        }
        if (e.getSource() == backOut)
        {
            backOut.stop();
            redChoice.setEnabled(false);
            blueChoice.setEnabled(false);
            greenChoice.setEnabled(false);
            yellowChoice.setEnabled(false);
            displayBlanket.setVisible(false);
            int count = 0;
            for (int i = 0; i < Game.userBlankets().length; i++)
            {
                if (Game.userBlankets()[i].getColor().equals(Game.questionBlankets()[i].getColor()))
                {
                    count++;
                }
            }
            System.out.print(count);
            if (count == Game.userBlankets().length)
            {
                endGame.setText("You've made the pig proud.");
            }else{
                endGame.setText(count + "/" + Game.userBlankets().length);
            }
            endGame.setVisible(true);
        }
    }
}

