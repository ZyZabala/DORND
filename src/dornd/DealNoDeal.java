package dornd;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.Border;
public final class DealNoDeal implements ActionListener {
    public static int[] value = {
        1,
        5,
        10,
        25,
        50,
        75,
        100,
        200,
        300,
        400,
        500,
        750,
        1000,
        5000,
        10000,
        25000,
        50000,
        75000,
        100000,
        200000,
        300000,
        400000,
        500000,
        750000,
        1000000,
        2000000
    };
    public static String[] label = {
        " ₱ 1",
        " ₱ 5",
        " ₱ 10",
        " ₱ 25",
        " ₱ 50",
        " ₱ 75",
        " ₱ 100",
        " ₱ 200",
        " ₱ 300",
        " ₱ 400",
        " ₱ 500",
        " ₱ 750",
        " ₱ 1,000",
        " ₱ 5,000",
        " ₱ 10,000",
        " ₱ 25,000",
        " ₱ 50,000",
        " ₱ 75,000",
        " ₱ 100,000",
        " ₱ 200,000",
        " ₱ 300,000",
        " ₱ 400,000",
        " ₱ 500,000",
        " ₱ 750,000",
        " ₱ 1,000,000",
        " ₱ 2,000,000"
    };
   
    public static Scanner in = new Scanner(System.in);
    public static money[] box_money = new money[26];
    public static ArrayList<Integer> ij = new ArrayList<>(26);
    public static String ch;
    public static int max;
    public static int min;
    public static int nxt;
    public static int max_index;
    public static int min_index;
    public static int nxt_index;
    public static int count;
    public static int s = 7;
    public static int chosen = 0;
    
    JFrame game;
    
    JLayeredPane all = new JLayeredPane();
    JLayeredPane win = new JLayeredPane();
    JLayeredPane menu = new JLayeredPane();
    
    JPanel left = new JPanel();
    JPanel right = new JPanel();
    JPanel center = new JPanel();
    JPanel field = new JPanel();
    JPanel title = new JPanel();
    JPanel r_tit_no = new JPanel();
    JPanel r_tit_dl = new JPanel();
    JPanel r_corner = new JPanel();
    JPanel l_corner = new JPanel();
    JPanel over = new JPanel();
    JPanel bank_lbl = new JPanel();
    JPanel bank_txt = new JPanel();
    JPanel bank_txt_win = new JPanel();
    JPanel p_congrats = new JPanel();
    JPanel p_youwon = new JPanel();
    JPanel p_newg = new JPanel();
    JPanel menubox = new JPanel();
    JPanel names = new JPanel();
    JPanel mechs = new JPanel();
    
    JButton[] boxes = new JButton[26];
    JButton deal = new JButton("DEAL");
    JButton nodeal = new JButton("NO DEAL");
    JButton newg = new JButton("New Game");
    JButton start = new JButton("START GAME");
    JButton ex_g = new JButton("Exit Game");
    JButton play = new JButton("Play Game");
    JButton cred = new JButton("Game Credits");
    JButton inst = new JButton("Instructions");
    JButton[] tomenu = new JButton[2];
    
    JLabel[] sides = new JLabel[26];
    JLabel lbl_case = new JLabel(" YOUR CASE # IS:");
    JLabel txt_case = new JLabel("");
    JLabel lbl_round = new JLabel(" ROUND");
    JLabel txt_round = new JLabel();
    JLabel bg = new JLabel(new ImageIcon("C:\\Users\\Hyndal\\Downloads\\OOP\\DORND\\dond.jpg"));
    JLabel m = new JLabel(new ImageIcon("C:\\Users\\Hyndal\\Downloads\\OOP\\DORND\\menu.png"));
    JLabel t_dl = new JLabel(" DEAL");
    JLabel t_no = new JLabel(" NO");
    JLabel t_or = new JLabel(" OR");
    JLabel t_nd = new JLabel(" DEAL");
    JLabel lbl_bank = new JLabel(" Banker's Offer: ");
    JLabel txt_bank = new JLabel();
    JLabel txt_bank_win = new JLabel();
    JLabel congrats = new JLabel(" CONGRATULATIONS!!!");
    JLabel youwon = new JLabel(" You Won: ");
    JLabel t_field = new JLabel();
    
    JLabel cross = new JLabel(" Cross Vallejo");
    JLabel dell = new JLabel(" Johndell Rivera");
    JLabel jam = new JLabel(" Jamela Tolibas");
    JLabel art = new JLabel(" Art Vitor");
    JLabel kyle = new JLabel(" Kyle Zabala");
    
    JLabel cross1 = new JLabel(" Analyzer");
    JLabel dell1 = new JLabel(" Documenter");
    JLabel jam1 = new JLabel(" Designer");
    JLabel art1 = new JLabel(" Debugger");
    JLabel kyle1 = new JLabel(" Developer");
    
    JLabel d1 = new JLabel("                                   DEAL OR NO DEAL GAME PROJECT");
    JLabel d2 = new JLabel("                             SUBMITTED TO PROF. BEAU GRAY HABAL");
    JLabel d3 = new JLabel("                                     CPEOOP E32 SY 2017-2018 Term 3");
    JLabel d4 = new JLabel("                                          GROUP 10 10 n n July 3, 2018");
    
    JLabel r1 = new JLabel(" ROUND 1: Choose a case number to keep.");
    JLabel r2 = new JLabel(" ROUND 2: Eliminate 6 cases, Deal or No Deal?!.");
    JLabel r3 = new JLabel(" ROUND 3: Eliminate 5 cases, Deal or No Deal?!.");
    JLabel r4 = new JLabel(" ROUND 4: Eliminate 4 cases, Deal or No Deal?!.");
    JLabel r5 = new JLabel(" ROUND 5: Eliminate 3 cases, Deal or No Deal?!.");
    JLabel r6 = new JLabel(" ROUND 6: Eliminate 2 cases, Deal or No Deal?!.");
    JLabel rf = new JLabel(" ROUND F: Eliminate 1 case, Deal or No Deal?!.");
    
    DealNoDeal() {
/*   ___   _   __  __ ___     ___  ___ ___ ___ ___ _  _ 
    / __| /_\ |  \/  | __|   / __|/ __| _ \ __| __| \| |
   | (_ |/ _ \| |\/| | _|    \__ \ (__|   / _|| _|| .` |
    \___/_/ \_\_|  |_|___|   |___/\___|_|_\___|___|_|\_|                                                             
*/

//Frame Design        
        game = new JFrame();
        game.setLayout(null);
        game.setSize(11*7+70*7+s*5+131*2, 131+s*(21)+23*13);
        game.setResizable(false);
        game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        game.setVisible(true);
        
//Title Panel Design
        all.add(title);
        title.setLayout(null);
        title.setBackground(new Color(20,20,20,200));
        title.setOpaque(true);
        title.setBounds(131+s*2, s, 11*7+70*7+1, 91);

        title.add(t_dl);
        t_dl.setFont(new Font("Arial", Font.BOLD, 46));
        t_dl.setBorder(BorderFactory.createLineBorder(Color.yellow, 10));
        t_dl.setForeground(Color.yellow);
        t_dl.setBackground(Color.black);
        t_dl.setLayout(null);
        t_dl.setOpaque(true);
        t_dl.setBounds(s, s, 175, 91-s*2);
        
        title.add(t_or);
        t_or.setFont(new Font("Arial", Font.BOLD, 30));
        t_or.setForeground(Color.yellow);
        t_or.setLayout(null);
        t_or.setBounds(s*2+175, s, 55, 91-s*2);
        
        title.add(t_no);
        t_no.setFont(new Font("Arial", Font.BOLD, 50));
        t_no.setBorder(BorderFactory.createLineBorder(Color.yellow, 5));
        t_no.setForeground(Color.yellow);
        t_no.setBackground(Color.black);
        t_no.setLayout(null);
        t_no.setOpaque(true);
        t_no.setBounds(s*3+175+60, s, 115, 91-s*2);

        title.add(t_nd);
        t_nd.setFont(new Font("Arial", Font.BOLD, 56));
        t_nd.setForeground(Color.black);
        t_nd.setBackground(Color.yellow);
        t_nd.setLayout(null);
        t_nd.setOpaque(true);
        t_nd.setBounds(s*3+175+115+60, s, 11*7+70*7+1-175-60-115-s*4, 91-s*2);
        
//Banker Panel Design
        all.add(bank_lbl);
        bank_lbl.setBackground(new Color(20,20,20,200));
        bank_lbl.setOpaque(true);
        bank_lbl.setBounds(s*5+131, s*7+150, 11*7+70*6+65-s*5, 50);
        bank_lbl.setVisible(false);

        bank_lbl.add(lbl_bank);
        lbl_bank.setBounds(s+(11*7+70*6+65-s*5)/2-90+s, s*12, 180-s*2, 20+s*2);
        lbl_bank.setFont(new Font("Arial", Font.BOLD, 20));
        lbl_bank.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
        lbl_bank.setForeground(Color.yellow);

//Banker Text Design
        all.add(bank_txt);
        bank_txt.setBackground(new Color(20,20,20,200));
        bank_txt.setOpaque(true);
        bank_txt.setBounds(s*5+131, s*7+150+50, 11*7+70*6+65-s*5, 100);
        bank_txt.setVisible(false);

        bank_txt.add(txt_bank);
        txt_bank.setBounds(s, s*15+70, 11*7+70*6+65-s*7, 70);
        txt_bank.setFont(new Font("Arial", Font.PLAIN, 50));
        txt_bank.setForeground(Color.yellow);
        
        
        
//Left Panel Design
        all.add(left);
        left.setLayout(null);
        left.setBackground(new Color(20,20,20,200));
        left.setBounds(s, s, 131, s*(14)+23*13);
        left.setOpaque(true);
        
//Left Corner Panel Design
        all.add(l_corner);
        l_corner.setBounds(s, s*(16)+23*13,131,131);
        l_corner.setLayout(null);
        l_corner.setBackground(new Color(20,20,20,200));
        l_corner.setOpaque(true);
        
//Deal Button Design
        l_corner.add(deal);
        deal.setBounds(s*2, s*2+15, 131-s*4, 131-s*4-30);
        deal.setBorder(new Rounded(25));
        deal.setFont(new Font("Arial", Font.BOLD, 20));
        deal.addActionListener(this);

//Your Case Number Design
        l_corner.add(lbl_case);
        lbl_case.setBounds(s*2, s, 131-s*4, 25);
        lbl_case.setLayout(null);
        lbl_case.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
        lbl_case.setForeground(Color.yellow);
        
        l_corner.add(txt_case);
        txt_case.setBounds(65-33, s*2+30, 67, 60);
        txt_case.setLayout(null);
        txt_case.setOpaque(true);
        txt_case.setBackground(Color.darkGray);
        txt_case.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
        txt_case.setForeground(Color.yellow);
        txt_case.setFont(new Font("Arial", Font.BOLD, 53));
        
        
        
//Right Panel Design
        all.add(right);
        right.setLayout(null);
        right.setBackground(new Color(20,20,20,200));
        right.setBounds(11*7+70*7+131+s*3, s, 131, s*(14)+23*13);
        right.setOpaque(true);
        
//Right Corner Panel Design
        all.add(r_corner);
        r_corner.setBounds(11*7+70*7+131+s*3, s*(16)+23*13, 131, 131);
        r_corner.setLayout(null);
        r_corner.setBackground(new Color(20,20,20,200));
        r_corner.setOpaque(true);

//No Deal Button Design
        r_corner.add(nodeal);
        nodeal.setBounds(s*2, s*2+15, 131-s*4, 131-s*4-30);
        nodeal.setBorder(new Rounded(25));
        nodeal.setFont(new Font("Arial", Font.BOLD, 12));
        nodeal.addActionListener(this);

//Round Number Design
        r_corner.add(lbl_round);
        lbl_round.setBounds(s*2+25, s, 131-s*4-50, 25);
        lbl_round.setLayout(null);
        lbl_round.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
        lbl_round.setForeground(Color.yellow);
        
        r_corner.add(txt_round);
        txt_round.setBounds(65-33, s*2+30, 67, 60);
        txt_round.setLayout(null);
        txt_round.setOpaque(true);
        txt_round.setBackground(Color.darkGray);
        txt_round.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
        txt_round.setForeground(Color.yellow);
        txt_round.setFont(new Font("Arial", Font.BOLD, 53));

        
//Side Labels Design
        for(int i=0; i<26; i++) {
            int j = i%13;
            sides[i] = new JLabel(label[i]);
            if(i<13) left.add(sides[i]);
            else right.add(sides[i]);
            sides[i].setLayout(null);
            sides[i].setBounds(s, s*(j+1)+23*j, 131-s*2, 23);
            sides[i].setForeground(Color.yellow);
            sides[i].setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
        }        
        
        
        
//Center Panel Design
        all.add(center);
        center.setLayout(null);
        center.setBounds(s*2+131, s*2+91, 11*7+70*7+1, s*(16)+23*13-91);
        center.setBackground(new Color(20,20,20,100));

//Buttons Design
        for(int i=0; i<26; i++) {
            int t=11;
            boxes[i] = new JButton(Integer.toString(i+1));
            center.add(boxes[i]);
            boxes[i].addActionListener(this);
            boxes[i].setBorder(new Rounded(20));
            if(i>=20 && i<26) boxes[i].setBounds(t*(i-16)+70*(i-20)+7, t+s*2, 60, 45);
            if(i>=13 && i<20) boxes[i].setBounds(t*(i-12)+70*(i-13), t*2+77, 60, 45);
            if(i>=6 && i<13) boxes[i].setBounds(t*(i-5)+70*(i-6), t*3+145, 60, 45);
            if(i>=0 && i<6) boxes[i].setBounds(t*(i+4)+70*(i)+7, s*(14)+23*13-91-t-45, 60, 45);
        }
        
//Field Panel Design
        all.add(field);
        field.setBounds(s*2+131, s*3+91+(s*(16)+23*13-91), 11*7+70*7+1, 110) ;
        field.setBackground(new Color(20,20,20,150));
        
//Field Label Designs
        field.add(t_field);
        t_field.setText(" Choose the case number you want to keep!!! ");
        t_field.setForeground(Color.yellow);
        t_field.setFont(new Font("Arial", Font.BOLD, 23));
        
        
        
//Main Layered Panel Design        
        game.add(all);
        all.setLayout(null);
        all.setBackground(Color.black);
        all.setOpaque(true);
        all.setBounds(0, 0, 11*7+70*7+s*5+131*2, 131+s*(17)+23*13);
        
//Main Panel Image Label
        all.add(bg);
        bg.setBounds(0, 0, 11*7+70*7+s*5+131*2, 131+s*(17)+23*13);
        bg.setOpaque(true);
        bg.setLayout(null);

/*      __      _____ _  _ _  _ ___ ___      ___  ___ ___ ___ ___ _  _ 
        \ \    / /_ _| \| | \| | __| _ \    / __|/ __| _ \ __| __| \| |
         \ \/\/ / | || .` | .` | _||   /    \__ \ (__|   / _|| _|| .` |
          \_/\_/ |___|_|\_|_|\_|___|_|_\    |___/\___|_|_\___|___|_|\_|                                                             
*/
        
//Winner Layered Panel Design
        game.add(win);
        win.setLayout(null);
        win.setBackground(Color.black);
        win.setOpaque(true);
        win.setBounds(0, 0, 11*7+70*7+s*5+131*2, 131+s*(17)+23*13);
        win.setVisible(false);
        
//Winner Congrats Panel Design
        win.add(p_congrats);
        p_congrats.setBackground(new Color(20,20,20,200));
        p_congrats.setOpaque(true);
        p_congrats.setLayout(null);
        p_congrats.setBounds(s*5+91, s*7+100, 11*7+70*6+100-s, 70+s*2);
        
        p_congrats.add(congrats);
        congrats.setBounds(s, s, 11*7+70*6+100-s*3, 70);
        congrats.setFont(new Font("New Courier", Font.BOLD, 50));
        congrats.setForeground(Color.yellow);

//You Won Panel Design        
        win.add(p_youwon);
        p_youwon.setBackground(new Color(75,75,75,20));
        p_youwon.setOpaque(true);
        p_youwon.setBounds(s*5+293, s*7+200, 11*7+70*2, 70);
        
        p_youwon.add(youwon);
        youwon.setBounds(s*2, s*2, 200, 40);
        youwon.setOpaque(true);
        youwon.setBackground(new Color(255,255,0,150));
        youwon.setFont(new Font("New Courier", Font.BOLD, 20));
        youwon.setForeground(Color.black);
        youwon.setBorder(BorderFactory.createLineBorder(Color.black, 2));

//Winning Amount Design
        win.add(bank_txt_win);
        bank_txt_win.setBackground(new Color(20,20,20,200));
        bank_txt_win.setOpaque(true);
        bank_txt_win.setBounds(s*5+131, s*7+250, 11*7+70*6+65-s*5, 100);

        bank_txt_win.add(txt_bank_win);
        txt_bank_win.setBounds(s, s*15+70, 11*7+70*6+65-s*7, 70);
        txt_bank_win.setFont(new Font("Arial", Font.PLAIN, 50));
        txt_bank_win.setForeground(Color.yellow);

//New Game & Exit Button
        win.add(p_newg);
        p_newg.setBackground(new Color(20,20,20,200));
        p_newg.setOpaque(true);
        p_newg.setBounds(s*5+131, s*7+350, 11*7+70*6+65-s*5, 50);

        p_newg.add(newg);
        newg.addActionListener(this);
        p_newg.add(ex_g);
        ex_g.addActionListener(this);

/*        ___ ___ _      _   ___ _   _       ___  ___ ___ ___ ___ _  _ 
         / __| _ \ |    /_\ / __| |_| |     / __|/ __| _ \ __| __| \| |
         \__ \  _/ |__ / _ \\__ \  _  |     \__ \ (__|   / _|| _|| .` |
         |___/_| |____/_/ \_\___/_| |_|     |___/\___|_|_\___|___|_|\_|
*/

//WALA PA



/*        __  __ ___ _  _ _   _     ___  ___ ___ ___ ___ _  _ 
         |  \/  | __| \| | | | |   / __|/ __| _ \ __| __| \| |
         | |\/| | _|| .` | |_| |   \__ \ (__|   / _|| _|| .` |
         |_|  |_|___|_|\_|\___/    |___/\___|_|_\___|___|_|\_|
*/

//Deal or No Deal Main Panel
        game.add(menu);
        menu.setLayout(null);
        menu.setBackground(Color.black);
        menu.setOpaque(true);
        menu.setBounds(0, 0, 11*7+70*7+s*5+131*2, 131+s*(17)+23*13);
        
//Menubox Panel
        menu.add(menubox);
        menubox.setOpaque(false);
        menubox.setLayout(null);
        menubox.setBounds(s*5+131, s*7+250, 11*7+70*6+65-s*5, 300);

//Buttons
        menubox.add(play);
        play.setBounds(s*3, s*3, 120, 50);
        play.setBorder(new Rounded(25));
        play.addActionListener(this);
        
        menubox.add(inst);
        inst.setBounds(s*5+170, s*3, 120, 50);
        inst.setBorder(new Rounded(25));
        inst.addActionListener(this);
        
        menubox.add(cred);
        cred.setBounds(s*7+170*2, s*3, 120, 50);
        cred.setBorder(new Rounded(20));
        cred.addActionListener(this);
        
        for(int i=0; i<2; i++) {
            tomenu[i] = new JButton("Back to Menu");
            menu.add(tomenu[i]);
            tomenu[i].setBounds(s*85-2, s*62-i*50, 120, 30);
            tomenu[i].addActionListener(this);
            tomenu[i].setVisible(false);
        }
        
//Project Details
        menu.add(names);
        names.setLayout(null);
        names.setBounds(s*2+131, s*2+91, 11*7+70*7+1, s*(16)+23*13-91);
        names.setBackground(new Color(0,0,0,180));
        names.setVisible(false);
        
        names.add(d1);
        d1.setBackground(Color.yellow);
        d1.setOpaque(true);
        d1.setForeground(Color.black);
        d1.setFont(new Font("Arial", Font.BOLD, 15));
        d1.setBounds(s*2, s*2, 11*7+70*7+1-s*4, 22);

        names.add(d2);
        d2.setBackground(Color.yellow);
        d2.setOpaque(true);
        d2.setForeground(Color.black);
        d2.setFont(new Font("New Courier", Font.BOLD, 15));
        d2.setBounds(s*2, s*2+22, 11*7+70*7+1-s*4, 22);
        
        names.add(d3);
        d3.setBackground(Color.yellow);
        d3.setOpaque(true);
        d3.setForeground(Color.black);
        d3.setFont(new Font("New Courier", Font.BOLD, 15));
        d3.setBounds(s*2, s*2+22*2, 11*7+70*7+1-s*4, 22);
        
        names.add(d4);
        d4.setBackground(Color.yellow);
        d4.setOpaque(true);
        d4.setForeground(Color.black);
        d4.setFont(new Font("New Courier", Font.BOLD, 15));
        d4.setBounds(s*2, s*2+22*3, 11*7+70*7+1-s*4, 22);
        
//Groupmember Names
        
        names.add(dell);
        dell.setForeground(Color.yellow);
        dell.setFont(new Font("New Courier", Font.BOLD, 23));
        dell.setBounds(95+s, s*18, 200, 25);
        
        names.add(jam);
        jam.setForeground(Color.yellow);
        jam.setFont(new Font("Arial", Font.BOLD, 23));
        jam.setBounds(95+s*2+1, s*20+25, 200, 25);
        
        names.add(cross);
        cross.setForeground(Color.yellow);
        cross.setFont(new Font("Arial", Font.BOLD, 23));
        cross.setBounds(95+s*5, s*22+25*2, 200, 25);
        
        names.add(kyle);
        kyle.setForeground(Color.yellow);
        kyle.setFont(new Font("Arial", Font.BOLD, 23));
        kyle.setBounds(95+s*8, s*24+25*3, 200, 25);
        
        names.add(art);
        art.setForeground(Color.yellow);
        art.setFont(new Font("Arial", Font.BOLD, 23));
        art.setBounds(95+s*13, s*26+25*4, 200, 25);
     
//Groupmember Roles                
        names.add(dell1);
        dell1.setForeground(Color.yellow);
        dell1.setOpaque(true);
        dell1.setBackground(Color.black);
        dell1.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
        dell1.setFont(new Font("New Courier", Font.PLAIN, 19));
        dell1.setBounds(s*2+280, s*18, 120, 25);
        
        names.add(jam1);
        jam1.setForeground(Color.yellow);
        jam1.setOpaque(true);
        jam1.setBackground(Color.black);
        jam1.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
        jam1.setFont(new Font("New Courier", Font.PLAIN, 19));
        jam1.setBounds(s*2+280, s*20+25, 95, 25);
        
        names.add(cross1);
        cross1.setForeground(Color.yellow);
        cross1.setOpaque(true);
        cross1.setBackground(Color.black);
        cross1.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
        cross1.setFont(new Font("New Courier", Font.PLAIN, 19));
        cross1.setBounds(s*2+280, s*22+25*2, 90, 25);
        
        names.add(kyle1);
        kyle1.setForeground(Color.yellow);
        kyle1.setOpaque(true);
        kyle1.setBackground(Color.black);
        kyle1.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
        kyle1.setFont(new Font("Arial", Font.PLAIN, 19));
        kyle1.setBounds(s*2+280, s*24+25*3, 105, 25);
        
        names.add(art1);
        art1.setForeground(Color.yellow);
        art1.setOpaque(true);
        art1.setBackground(Color.black);
        art1.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
        art1.setFont(new Font("Arial", Font.PLAIN, 19));
        art1.setBounds(s*2+280, s*26+25*4, 95, 25);
        
//Instructions Design
        menu.add(mechs);
        mechs.setBounds(s*2+131, s*2+150, 11*7+70*7+1, s*(17)+23*13-210);
        mechs.setBackground(new Color(0,0,0,180));
        mechs.setVisible(false);
        
        mechs.add(r1);
        r1.setForeground(Color.yellow);
        r1.setFont(new Font("Arial", Font.PLAIN, 19));
        
        mechs.add(r2);
        r2.setForeground(Color.yellow);
        r2.setFont(new Font("Arial", Font.PLAIN, 19));
        
        mechs.add(r3);
        r3.setForeground(Color.yellow);
        r3.setFont(new Font("Arial", Font.PLAIN, 19));
        
        mechs.add(r4);
        r4.setForeground(Color.yellow);
        r4.setFont(new Font("Arial", Font.PLAIN, 19));
        
        mechs.add(r5);
        r5.setForeground(Color.yellow);
        r5.setFont(new Font("Arial", Font.PLAIN, 19));
        
        mechs.add(r6);
        r6.setForeground(Color.yellow);
        r6.setFont(new Font("Arial", Font.PLAIN, 19));
        
        mechs.add(rf);
        rf.setForeground(Color.yellow);
        rf.setFont(new Font("Arial", Font.PLAIN, 19));
        
        
        
//Deal or No Deal Main Image Label
        menu.add(m);
        m.setBackground(Color.black);
        m.setBounds(0, 0, 11*7+70*7+s*5+131*2, 131+s*(17)+23*13);
        m.setLayout(null);
        
        

//Start New Game
        playgame();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == deal) winner(1);
        else if (e.getSource() == nodeal) {
            int x=0;
            while(!box_money[x].chosen) x++;
            if(count<=3) winner(2);
            else ret_box();
        }
        else if (e.getSource() == newg) {
            game.dispose();
            new DealNoDeal();
        }
        else if (e.getSource() == play) newgame();
        else if (e.getSource() == cred) {
            credits();
            tomenu[0].setVisible(true);
        }
        else if (e.getSource() == inst) {
            instruct();
            tomenu[1].setVisible(true);
        }
        else if (e.getSource() == tomenu[0]) {
            menubox.setVisible(true);
            names.setVisible(false);
            tomenu[0].setVisible(false);
        }
        else if (e.getSource() == tomenu[1]) {
            menubox.setVisible(true);
            mechs.setVisible(false);
            tomenu[1].setVisible(false);
        }
        else if (e.getSource() == ex_g) game.dispose();
        else {
            for(int i=0; i<26; i++) {
                if(e.getSource() == boxes[i]) {
                    boxes[i].setVisible(false);
                    if(count==26) {
                        choose(i);
                        break;
                    }
                    else {
                        next(i);
                        break;
                    }
                }
            }
            roundcheck();
        }
        bg.setVisible(false);
        bg.setVisible(true);
    }
    
    private static class Rounded implements Border {
        private int radius;
        Rounded(int radius) {
            this.radius = radius;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }
        public boolean isBorderOpaque() {
            return true;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }

    public void playgame() {
        all.setVisible(false);
        win.setVisible(false);
        menu.setVisible(true);
    }
    
    public void newgame() {
        //set menu layered pane to invisible
        menu.setVisible(false);
        
        //set congrats layered pane to invisible
        win.setVisible(false);
        
        //set main layered pane to visible
        all.setVisible(true);
        
        //set deal and nodeal buttons to invisible
        deal.setVisible(false);
        nodeal.setVisible(false);
        
        //reset counters
        count=0;
        min=0;
        max=0;
        min_index=0;
        max_index=0;
        
        //buttons, boxes, and side labels set to visible
        for(int i=0; i<26; i++) {
            ij.add(i+1);
            box_money[i] = new money();
            box_money[i].label = label[i];
            box_money[i].value = value[i];
            box_money[i].chosen = false;
            box_money[i].close();
            boxes[i].setVisible(true);
            sides[i].setVisible(true);
        }
        //jumbled indexes
        Collections.shuffle(ij);
        
        //reassign indices
        for(int i=0; i<26; i++) {
            int x = ij.get(i);
            box_money[i].container = x;
        }
        //counters intialized
        sort();
    }
    
    public void instruct() {
        menubox.setVisible(false);
        mechs.setVisible(true);
        tomenu[1].setVisible(true);
    }
    
    public void credits(){
        menubox.setVisible(false);
        names.setVisible(true);
        tomenu[0].setVisible(true);
    }
    
    public static void sort() {
        //reset counters
        count=0;
        min=2000000;
        max=1;
        
        for(int i=0; i<26; i++) {
            //check how many boxes are not chose yet
            if(!box_money[i].isOpen && !box_money[i].chosen) count++;
            
            //find highest value
            if(box_money[i].value>max && !box_money[i].isOpen) {
                max=box_money[i].value;
                max_index=i;
            }
            
            //find smallest value
            if(box_money[i].value<min && !box_money[i].isOpen) {
                min=box_money[i].value;
                min_index=i;
            }
        }
    }
    
    public static double bank() {
        double offer=0;
        
        //weighted mean of all unopened boxes
        for(int i=0; i<26; i++) if(!box_money[i].isOpen) offer += ((double) box_money[i].value) * (1/(double)count);
        
        //add relative mean
        offer += ((double) max - (double) min)/(double) count;
        
        return offer;
    }
    
    public void choose(int i) {
                        // ^
                        // pass chosen case's index as parameter
        
        String ss;
        if(i<9) ss=" ";
        else ss="";
        
        txt_case.setText(ss+Integer.toString(i+1));
        
        //set box number to chosen but do not open it
        box_money[ij.get(i)-1].chosen = true;
        sort();
    }
    
    public void next(int i) {
                      // ^
                      // pass chosen case's index as parameter
        
        //Open box
        box_money[ij.get(i)-1].open();
        
        sort();
        
        //remove side label
        sides[ij.get(i)-1].setVisible(false);
    }
    
    public String amount() {
        double x;
        int y;
        String v;
        String t="";
        String u="";
        int g=0;
        x = bank()*100;
        y = (int) x;
        x = ((double) y)/100;
        v = Double.toString(x);
        for(int i=v.length()-1; i>=0; i--) {
            if(v.charAt(i) == '.') {
                for(int j=0; j<4; j++) t+=v.charAt(i-j);
                    t+=",";
                    i-=3;
            } else t+=v.charAt(i); 
        }
        for(int i=0; i<t.length(); i++) u+=t.charAt(t.length()-i-1);
        return " ₱ "+u;
    }
    
    public void roundcheck() {
        if(count==19 || count==14 || count==10 || count==7 || count==5 || count==4 || count==3) {
            txt_case.setVisible(false);
            lbl_case.setVisible(false);
            txt_round.setVisible(false);
            lbl_round.setVisible(false);
            center.setVisible(false);
            field.setVisible(false);
            
            txt_bank.setText(amount());

            bank_lbl.setVisible(true);
            bank_txt.setVisible(true);
            nodeal.setVisible(true);
            deal.setVisible(true);
        } else ret_box();
    }
    
    public void winner(int w) {
        all.setVisible(false);
        win.setVisible(true);
        
        if(w==1) txt_bank_win.setText(amount());
        if(w==2) {
            for(int i=0; i<26; i++) {
                if(box_money[i].chosen) {
                    txt_bank_win.setText(box_money[i].label);
                    break;
                }
            }
        }
        
        win.add(bg);
    }
    
    public void ret_box() {
        bank_lbl.setVisible(false);
        bank_txt.setVisible(false);
        nodeal.setVisible(false);
        deal.setVisible(false);
        
        field.setVisible(true);
            if(count>19 && count<=26) {
                t_field.setText("Eliminate "+(count-19)+" more cases before Round 2!");
                txt_round.setText(" 1");
            }
            if(count>14 && count<=19) {
                t_field.setText("Eliminate "+(count-14)+" more cases before Round 3!");
                txt_round.setText(" 2");
            }
            if(count>10 && count<=14) {
                t_field.setText("Eliminate "+(count-10)+" more cases before Round 4!");
                txt_round.setText(" 3");
            }
            if(count>7 && count<=10) {
                t_field.setText("Eliminate "+(count-7)+" more cases before Round 5!");
                txt_round.setText(" 4");
            }
            if(count>5 && count<=7) {
                t_field.setText("Eliminate "+(count-5)+" more cases before Round 6!");
                txt_round.setText(" 5");
            }
            if(count==5) {
                t_field.setText("Eliminate 1 more case before Final Round!");
                txt_round.setText(" 6");
            }
            if(count==4) {
                t_field.setText("Eliminate 1 more case before winning!");
                txt_round.setText(" F");
            }
            
        txt_case.setVisible(true);
        lbl_case.setVisible(true);
        txt_round.setVisible(true);
        lbl_round.setVisible(true);
        center.setVisible(true);
    }
    
    public static void main(String[] args) {
        System.out.println( "DEAL OR NO DEAL GAME PROJECT\n" +
                            "SUBMITTED TO PROF. BEAU GRAY HABAL\n" +
                            "CPEOOP E32 S.y. 2017-2018 Term 3\n" +
                            "                                _     _            _     _ _    ___ _                   \n" +
                            "                             _ | |___| |_  _ _  __| |___| | |  | _ (_)_ _____ _ _ __ _  \n" +
                            "                            | || / _ \\ ' \\| ' \\/ _` / -_) | |  |   / \\ V / -_) '_/ _` |        Documenter\n" +
                            "                             \\__/\\___/_||_|_||_\\__,_\\___|_|_|  |_|_\\_|\\_/\\___|_| \\__,_| \n" +
                            "\n" +
                            "                                _                _        _____    _ _ _             \n" +
                            "                             _ | |__ _ _ __  ___| |__ _  |_   _|__| (_) |__  __ _ ___\n" +
                            "                            | || / _` | '  \\/ -_) / _` |   | |/ _ \\ | | '_ \\/ _` (_-<\n" +
                            "                             \\__/\\__,_|_|_|_\\___|_\\__,_|   |_|\\___/_|_|_.__/\\__,_/__/   Designer\n" +
                            "\n" +
                            "                              ___                __   __    _ _      _     \n" +
                            "                             / __|_ _ ___ ______ \\ \\ / /_ _| | |___ (_)___ \n" +
                            "                            | (__| '_/ _ (_-<_-<  \\ V / _` | | / -_)| / _ \\     Analyzer\n" +
                            "                             \\___|_| \\___/__/__/   \\_/\\__,_|_|_\\___|/ \\___/\n" +
                            "                                                                  |__/   \n" +
                            "\n" +
                            "                             _  __    _       ____     _          _      \n" +
                            "                            | |/ /  _| |___  |_  /__ _| |__  __ _| |__ _ \n" +
                            "                            | ' < || | / -_)  / // _` | '_ \\/ _` | / _` |   \n" +
                            "                            |_|\\_\\_, |_\\___| /___\\__,_|_.__/\\__,_|_\\__,_|   Developer\n" +
                            "                                 |__/                                    \n" +
                            "                               _       _    __   ___ _           \n" +
                            "                              /_\\  _ _| |_  \\ \\ / (_) |_ ___ _ _ \n" +
                            "                             / _ \\| '_|  _|  \\ V /| |  _/ _ \\ '_|       \n" +
                            "                            /_/ \\_\\_|  \\__|   \\_/ |_|\\__\\___/_|     Debugger");
        new DealNoDeal();
    }
}