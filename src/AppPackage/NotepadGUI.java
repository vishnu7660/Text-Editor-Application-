package AppPackage;

import com.ozten.font.JFontChooser;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


public class NotepadGUI extends javax.swing.JFrame 
{
    boolean linewrap = true;
    boolean textChanged = false;
    String fileOpenedLoc = "";
    boolean fileOpened = false;
    boolean fileSaved = false;
    
    Voice voice = null;
    
    
    public NotepadGUI() 
    {
        initComponents();
        
        icon();
        
    }

    
    private void icon()
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage(getClass().getResource("/AppPackage/icon.png"));
        this.setIconImage(img);
     
        
    }
    
    private void saveFile() throws IOException
    {
        if(fileOpened==true)
        {
             FileWriter writer = new FileWriter(fileOpenedLoc);
                try (BufferedWriter br = new BufferedWriter(writer)) 
                {
                    jTextArea2.write(br);
                    fileSaved = true;
                    textChanged = false;
                    
                }
        
        }   else if(fileOpened==false)
        {
            JFileChooser chooser = new JFileChooser();
            int value = chooser.showSaveDialog(null);
            if(value==JFileChooser.APPROVE_OPTION)
            {
                
                File file = chooser.getSelectedFile();
            
            try 
            {
                FileWriter writer = new FileWriter(file+".txt");
                try (BufferedWriter br = new BufferedWriter(writer)) 
                {
                    jTextArea2.write(br);
                    fileOpenedLoc = file.getAbsolutePath()+".txt";
                    fileSaved = true;
                    textChanged = false;
                    fileOpened = true;
                }
                          
            } catch (IOException ex) 
            {
               JOptionPane.showMessageDialog(rootPane, "Error : "+ ex);
            }
            
            }
        
        
        }
        
        
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        jPopupMenu1.setBackground(new java.awt.Color(0, 204, 153));
        jPopupMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jPopupMenu1.setBorder(null);
        jPopupMenu1.setBorderPainted(false);
        jPopupMenu1.setLabel("Menu");
        jPopupMenu1.setMaximumSize(new java.awt.Dimension(120, 120));
        jPopupMenu1.setMinimumSize(new java.awt.Dimension(120, 120));
        jPopupMenu1.setPreferredSize(new java.awt.Dimension(120, 120));

        jMenuItem28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem28.setBorder(null);
        jMenuItem28.setContentAreaFilled(false);
        jMenuItem28.setIconTextGap(0);
        jMenuItem28.setLabel("Cut");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem28);

        jMenuItem29.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jMenuItem29.setBorder(null);
        jMenuItem29.setContentAreaFilled(false);
        jMenuItem29.setIconTextGap(0);
        jMenuItem29.setLabel("Copy");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem29);

        jMenuItem30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem30.setBorder(null);
        jMenuItem30.setContentAreaFilled(false);
        jMenuItem30.setIconTextGap(0);
        jMenuItem30.setLabel("Paste");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem30);

        jMenuItem31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem31.setBorder(null);
        jMenuItem31.setContentAreaFilled(false);
        jMenuItem31.setIconTextGap(0);
        jMenuItem31.setLabel("Clear");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem31);

        jMenuItem32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem32.setBorder(null);
        jMenuItem32.setContentAreaFilled(false);
        jMenuItem32.setIconTextGap(0);
        jMenuItem32.setLabel("Select All ");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem32);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notepad");
        getContentPane().setLayout(new java.awt.CardLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(800, 450));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(800, 450));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 450));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea2MouseReleased(evt);
            }
        });
        jTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea2KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane1, "card2");

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New");
        jMenuItem1.setIconTextGap(8);
        jMenuItem1.setMaximumSize(new java.awt.Dimension(150, 22));
        jMenuItem1.setMinimumSize(new java.awt.Dimension(150, 22));
        jMenuItem1.setPreferredSize(new java.awt.Dimension(150, 22));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open");
        jMenuItem2.setIconTextGap(8);
        jMenuItem2.setMaximumSize(new java.awt.Dimension(150, 22));
        jMenuItem2.setMinimumSize(new java.awt.Dimension(150, 22));
        jMenuItem2.setPreferredSize(new java.awt.Dimension(150, 22));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save");
        jMenuItem3.setIconTextGap(8);
        jMenuItem3.setMaximumSize(new java.awt.Dimension(150, 22));
        jMenuItem3.setMinimumSize(new java.awt.Dimension(150, 22));
        jMenuItem3.setPreferredSize(new java.awt.Dimension(150, 22));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem7.setText("Save As");
        jMenuItem7.setIconTextGap(8);
        jMenuItem7.setMaximumSize(new java.awt.Dimension(150, 22));
        jMenuItem7.setMinimumSize(new java.awt.Dimension(150, 22));
        jMenuItem7.setPreferredSize(new java.awt.Dimension(150, 22));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Print");
        jMenuItem4.setIconTextGap(8);
        jMenuItem4.setMaximumSize(new java.awt.Dimension(150, 22));
        jMenuItem4.setMinimumSize(new java.awt.Dimension(150, 22));
        jMenuItem4.setPreferredSize(new java.awt.Dimension(150, 22));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Exit");
        jMenuItem5.setIconTextGap(8);
        jMenuItem5.setMaximumSize(new java.awt.Dimension(150, 22));
        jMenuItem5.setMinimumSize(new java.awt.Dimension(150, 22));
        jMenuItem5.setPreferredSize(new java.awt.Dimension(150, 22));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setIconTextGap(0);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Cut");
        jMenuItem6.setIconTextGap(0);
        jMenuItem6.setMaximumSize(new java.awt.Dimension(150, 22));
        jMenuItem6.setMinimumSize(new java.awt.Dimension(150, 22));
        jMenuItem6.setPreferredSize(new java.awt.Dimension(150, 22));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Copy");
        jMenuItem11.setIconTextGap(0);
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem34.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem34.setText("Paste");
        jMenuItem34.setIconTextGap(0);
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem34);

        jMenuItem33.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem33.setText("Date/Time");
        jMenuItem33.setIconTextGap(0);
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem33);

        jMenuItem35.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jMenuItem35.setText("Delete");
        jMenuItem35.setIconTextGap(0);
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem35);

        jMenuItem36.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem36.setText("Select All");
        jMenuItem36.setIconTextGap(0);
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem36);

        jCheckBoxMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem2.setText("Speak");
        jCheckBoxMenuItem2.setIconTextGap(0);
        jCheckBoxMenuItem2.setPreferredSize(new java.awt.Dimension(150, 22));
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Format");

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Line Wrap");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem1);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Font");
        jMenuItem12.setMaximumSize(new java.awt.Dimension(130, 22));
        jMenuItem12.setMinimumSize(new java.awt.Dimension(130, 22));
        jMenuItem12.setPreferredSize(new java.awt.Dimension(130, 22));
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Color");
        jMenuItem13.setMaximumSize(new java.awt.Dimension(130, 22));
        jMenuItem13.setMinimumSize(new java.awt.Dimension(130, 22));
        jMenuItem13.setPreferredSize(new java.awt.Dimension(130, 22));
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Theme");

        jMenuItem16.setText("Fast");
        jMenuItem16.setMaximumSize(new java.awt.Dimension(130, 22));
        jMenuItem16.setMinimumSize(new java.awt.Dimension(130, 22));
        jMenuItem16.setPreferredSize(new java.awt.Dimension(130, 22));
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuItem17.setText("Aluminium");
        jMenuItem17.setMaximumSize(new java.awt.Dimension(130, 22));
        jMenuItem17.setMinimumSize(new java.awt.Dimension(130, 22));
        jMenuItem17.setPreferredSize(new java.awt.Dimension(130, 22));
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuItem27.setText("Aero");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem27);

        jMenuItem18.setText("Acryl");
        jMenuItem18.setMaximumSize(new java.awt.Dimension(130, 22));
        jMenuItem18.setMinimumSize(new java.awt.Dimension(130, 22));
        jMenuItem18.setPreferredSize(new java.awt.Dimension(130, 22));
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuItem25.setText("Texture");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem25);

        jMenuItem19.setText("Black");
        jMenuItem19.setMaximumSize(new java.awt.Dimension(130, 22));
        jMenuItem19.setMinimumSize(new java.awt.Dimension(130, 22));
        jMenuItem19.setPreferredSize(new java.awt.Dimension(130, 22));
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem26.setText("Bernstein");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem26);

        jMenuItem24.setText("Luna");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem24);

        jMenuItem20.setText("Smart");
        jMenuItem20.setMaximumSize(new java.awt.Dimension(130, 22));
        jMenuItem20.setMinimumSize(new java.awt.Dimension(130, 22));
        jMenuItem20.setPreferredSize(new java.awt.Dimension(130, 22));
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenuItem21.setText("HiFi");
        jMenuItem21.setMaximumSize(new java.awt.Dimension(130, 22));
        jMenuItem21.setMinimumSize(new java.awt.Dimension(130, 22));
        jMenuItem21.setPreferredSize(new java.awt.Dimension(130, 22));
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem21);

        jMenuItem22.setText("Mint");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem22);

        jMenuItem23.setText("Default");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem23);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Help");

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Help");
        jMenuItem14.setMaximumSize(new java.awt.Dimension(130, 22));
        jMenuItem14.setMinimumSize(new java.awt.Dimension(130, 22));
        jMenuItem14.setPreferredSize(new java.awt.Dimension(130, 22));
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setText("About");
        jMenuItem15.setMaximumSize(new java.awt.Dimension(130, 22));
        jMenuItem15.setMinimumSize(new java.awt.Dimension(130, 22));
        jMenuItem15.setPreferredSize(new java.awt.Dimension(130, 22));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(voice !=null)
        {
        voice.deallocate();
        voice = null;
        }
        if(fileOpened==true)
        {
            if(textChanged==true)
            {
                int r = JOptionPane.showConfirmDialog(rootPane, "Do you want to save the document?");
                if(r==JOptionPane.YES_OPTION)
                {
                
                    try 
                    {
                        saveFile();
                    } catch (IOException ex)
                    {
                      
                    }
                    textChanged = false;
                
                }
                else
                {
                    FileFilter filter = new  FileNameExtensionFilter("Text Files" , "txt", "html","java","xml","css","doc");
                    JFileChooser chooser = new JFileChooser();
                    chooser.addChoosableFileFilter(filter);
                    int value = chooser.showOpenDialog(null);
                 
                if(value==JFileChooser.APPROVE_OPTION)
                {
                    File file = chooser.getSelectedFile();
                    try 
                    {
                        FileReader reader = new FileReader(file);
                        BufferedReader br = new BufferedReader(reader);
                        jTextArea2.read(br, null);
                        br.close();
                        fileOpened = true; 
                        textChanged = false;
                        fileOpenedLoc = file.getAbsolutePath();
                        
                    } catch (FileNotFoundException  ex)
                    {
                
                        JOptionPane.showMessageDialog(rootPane, "Error : "+ ex);
                
                    } catch (IOException ex) 
                    {
                
                        JOptionPane.showMessageDialog(rootPane, "Error : "+ ex);
                 
                    }
            
                }
                  
                
                }
            
            }
            else if(textChanged==false)
            {
                JFileChooser chooser = new JFileChooser();
                int value = chooser.showOpenDialog(null);
               
                if(value==JFileChooser.APPROVE_OPTION)
                {
                    File file = chooser.getSelectedFile();
                   
                    try 
                    {
                        FileReader reader = new FileReader(file);
                        BufferedReader br = new BufferedReader(reader);
                        jTextArea2.read(br, null);
                        br.close();
                        fileOpened = true; 
                        fileOpenedLoc = file.getAbsolutePath();
                       
                        textChanged = false;
                    } catch (FileNotFoundException  ex)
                    {
                
                        JOptionPane.showMessageDialog(rootPane, "Error : "+ ex);
                
                    } catch (IOException ex) 
                    {
                
                        JOptionPane.showMessageDialog(rootPane, "Error : "+ ex);
                 
                    }
            
                } 
            
            
            }
        
        }else if(fileOpened==false)
        {
            if(!jTextArea2.getText().trim().isEmpty() && textChanged==true)
            {
                int r = JOptionPane.showConfirmDialog(rootPane, "Do you want to save the document?");
                if(r==JOptionPane.YES_OPTION)
                {
                
                    try 
                    {
                        saveFile();
                    } 
                    catch (IOException ex) 
                    {
                       
                    }
                
                }else 
                {
                    JFileChooser chooser = new JFileChooser();
                int value = chooser.showOpenDialog(null);
                if(value==JFileChooser.APPROVE_OPTION)
                {
                    File file = chooser.getSelectedFile();
                    try 
                    {
                        FileReader reader = new FileReader(file);
                        BufferedReader br = new BufferedReader(reader);
                        jTextArea2.read(br, null);
                        br.close();
                        fileOpened = true; 
                        textChanged = false;
                        fileOpenedLoc = file.getAbsolutePath();
                        
                    } catch (FileNotFoundException  ex)
                    {
                
                        JOptionPane.showMessageDialog(rootPane, "Error : "+ ex);
                
                    } catch (IOException ex) 
                    {
                
                        JOptionPane.showMessageDialog(rootPane, "Error : "+ ex);
                 
                    }
            
                }
                
                
                }
            
            }
            else if(jTextArea2.getText().trim().isEmpty())
            {
                JFileChooser chooser = new JFileChooser();
                int value = chooser.showOpenDialog(null);
                if(value==JFileChooser.APPROVE_OPTION)
                {
                    File file = chooser.getSelectedFile();
                    try 
                    {
                        FileReader reader = new FileReader(file);
                        BufferedReader br = new BufferedReader(reader);
                        jTextArea2.read(br, null);
                        br.close();
                        fileOpened = true; 
                        fileOpenedLoc = file.getAbsolutePath();
                        
                    } catch (FileNotFoundException  ex)
                    {
                
                        JOptionPane.showMessageDialog(rootPane, "Error : "+ ex);
                
                    } catch (IOException ex) 
                    {
                
                        JOptionPane.showMessageDialog(rootPane, "Error : "+ ex);
                 
                    }
            
                }
            
            
            }
        
        
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
       try 
        {
             UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
             SwingUtilities.updateComponentTreeUI(this);
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
          
        }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
          
        }
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
     try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
          
        }
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            
        }
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
         try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            Logger.getLogger(NotepadGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
       JOptionPane.showMessageDialog(rootPane, " Software : Notepad app \n Version : 1.1.0 \n Developer : Chandan kumar","About",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        JOptionPane.showMessageDialog(rootPane, " Click File Menu for New Document, Print, Save, Exit etc. \n Click Edit Menu to Cut, Copy, Paste etc. \n Click Format to Line Wrap, Font , Font Color. \n Click Theme Menu to Change the theme of app.","Help",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        JColorChooser color = new JColorChooser();
        JOptionPane.showMessageDialog(rootPane, color,"Choose Font Color",JOptionPane.PLAIN_MESSAGE);
        jTextArea2.setForeground(color.getColor());
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        JFontChooser font = new JFontChooser();
        JOptionPane.showMessageDialog(rootPane, font,"Choose Color",JOptionPane.PLAIN_MESSAGE);
        jTextArea2.setFont(font.getPreviewFont());
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
       try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            
        }
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
       try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            
        }
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
       try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            
        }
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
       try 
        {
             UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            
        }
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");	
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            
        }
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
            
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            
        }
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
       
        jTextArea2.cut();
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        jTextArea2.copy();
        
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        jTextArea2.paste();
       
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        jTextArea2.setText("");
       
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        jTextArea2.selectAll();
       
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jTextArea2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea2MouseReleased
        int x = evt.getX();
        int y = evt.getY();
        if(evt.isPopupTrigger())
        {
           
           jPopupMenu1.show(this, x, y);
          
        }
    }//GEN-LAST:event_jTextArea2MouseReleased

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try 
        {
            saveFile();
        } 
        catch (IOException ex) 
        {
           
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTextArea2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyReleased
        textChanged  = true;
    }//GEN-LAST:event_jTextArea2KeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         if(voice !=null)
        {
        voice.deallocate();
        voice = null;
        }
        if(fileOpened==true)
        {
           if(textChanged==true)
           {
              int r = JOptionPane.showConfirmDialog(rootPane, "Do you want to save the document?");
                if(r==JOptionPane.YES_OPTION)
                {
                
                  try 
                  {
                      saveFile();
                      jTextArea2.setText("");
                      
                  } catch (IOException ex) 
                  {
                     
                  }
                    textChanged = false;
                
                }
                else
                {
                    
                    jTextArea2.setText("");
                    fileOpened = false;
                    fileSaved =  false;
                    fileOpenedLoc = "";
                    textChanged = false;
                }
           
           
           }
           else if(textChanged==false)
           {
                jTextArea2.setText("");
                fileOpened = false;
                fileSaved =  false;
                fileOpenedLoc = "";
                textChanged = false;
            }
        
        }
        else if(fileOpened==false)
        {
            if(!jTextArea2.getText().trim().isEmpty())
            {
            
                int r = JOptionPane.showConfirmDialog(rootPane, "Do you want to save the document?");
                if(r==JOptionPane.YES_OPTION)
                {
                
                    try 
                    {
                        saveFile();
                        textChanged = false;
                    } 
                    catch (IOException ex) 
                    {
                       
                    }
                
                }
                else
                {
                    
                    jTextArea2.setText("");
                    fileOpened = false;
                    fileSaved =  false;
                    fileOpenedLoc = "";
                    textChanged = false;
                }
            
            }
            else
            {
                jTextArea2.setText("");
                fileOpened = false;
                fileSaved =  false;
                fileOpenedLoc = "";
                textChanged = false;
            }
                  
                           
        } 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        if(linewrap==true)
        {
            jTextArea2.setLineWrap(false);
            linewrap = false;
        }
        else
        {
            jTextArea2.setLineWrap(true);
            linewrap = true;
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jTextArea2.cut();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
            JFileChooser chooser = new JFileChooser();
            int value = chooser.showDialog(null,"Save As");
            if(value==JFileChooser.APPROVE_OPTION)
            {
                
                File file = chooser.getSelectedFile();
            
            try 
            {
                FileWriter writer = new FileWriter(file+".txt");
                try (BufferedWriter br = new BufferedWriter(writer)) 
                {
                    jTextArea2.write(br);
                    fileOpenedLoc = file.getAbsolutePath()+".txt";
                    fileSaved = true;
                    textChanged = false;
                    fileOpened = true;
                }
                          
            } catch (IOException ex) 
            {
               JOptionPane.showMessageDialog(rootPane, "Error : "+ ex);
            }
            
            }      
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         if(jTextArea2.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Oops, Nothing to print...","Message",JOptionPane.WARNING_MESSAGE);
        
        }
        else
        {                
        try 
        {
            jTextArea2.print();
            
            
        } 
        catch (PrinterException ex) 
        {
           JOptionPane.showMessageDialog(rootPane, "Oops, Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
           Calendar cal = new GregorianCalendar();
          
           jTextArea2.append(cal.getTime().toString()+"\n");
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       jTextArea2.copy();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        jTextArea2.replaceSelection("");
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        jTextArea2.selectAll();
    }//GEN-LAST:event_jMenuItem36ActionPerformed
    private final String name = "mbrola_us1";
    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
    new Thread()
    {
        public void run()
        {
            if(jCheckBoxMenuItem2.isSelected()==true)
            {
                if(voice!=null)
            {
                voice.deallocate();
                voice = null;
  
            }
                System.setProperty("mbrola.base", "D:\\mbrola");
                voice = VoiceManager.getInstance().getVoice(name);
                voice.allocate();
                voice.speak(jTextArea2.getText());
                
                jCheckBoxMenuItem2.setSelected(false);
            }else
            {
                voice.deallocate();
                voice = null;
     
            }
        }
    }.start();
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
          jTextArea2.paste();
    }//GEN-LAST:event_jMenuItem34ActionPerformed

   
    public static void main(String args[]) 
    {
        try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            
        }
        
        

       
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new NotepadGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
